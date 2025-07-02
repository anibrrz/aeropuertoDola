package com.aeropuerto.aeropuerto.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.aeropuerto.Dto.PuedeAterrizarDTO;
import com.aeropuerto.aeropuerto.entity.Aeropuerto;
import com.aeropuerto.aeropuerto.entity.PuedeAterrizar;
import com.aeropuerto.aeropuerto.entity.TipoDeAvion;
import com.aeropuerto.aeropuerto.repository.AeropuertoRepository;
import com.aeropuerto.aeropuerto.repository.PuedeAterrizarRepository;
import com.aeropuerto.aeropuerto.repository.TipoDeAvionRepository;

@Service
public class PuedeAterrizarService {

    @Autowired
    private PuedeAterrizarRepository puedeAterrizarRepository;

    @Autowired
    private TipoDeAvionRepository tipoDeAvionRepository;

    @Autowired
    private AeropuertoRepository aeropuertoRepository;

    public Optional<PuedeAterrizarDTO> getById(UUID id) {
        return puedeAterrizarRepository.findById(id).map(PuedeAterrizar::toDto);
    }

    public PuedeAterrizarDTO upsert(PuedeAterrizarDTO dto) {
        PuedeAterrizar entity = new PuedeAterrizar();
        entity.setId(dto.getId() != null ? dto.getId() : UUID.randomUUID());

        TipoDeAvion tipo = tipoDeAvionRepository.findById(dto.getTipoDeAvionId()).orElse(null);
        Aeropuerto aero = aeropuertoRepository.findById(dto.getAeropuertoId()).orElse(null);

        entity.setTipoDeAvion(tipo);
        entity.setAeropuerto(aero);

        return puedeAterrizarRepository.save(entity).toDto();
    }
}