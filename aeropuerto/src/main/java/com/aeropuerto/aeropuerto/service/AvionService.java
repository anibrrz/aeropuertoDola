package com.aeropuerto.aeropuerto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.aeropuerto.Dto.AvionDTO;
import com.aeropuerto.aeropuerto.entity.Avion;
import com.aeropuerto.aeropuerto.repository.AvionRepository;

import java.util.Optional;
import java.util.UUID;

@Service
public class AvionService {
    @Autowired
    private AvionRepository repo;

    public Optional<AvionDTO> getById(UUID id) {
        return repo.findById(id).map(Avion::toDto);
    }

    public AvionDTO upsert(AvionDTO dto) {
        Avion avion = new Avion();
        avion.setNumeroSerieAvion(dto.getNumeroSerieAvion() != null ? dto.getNumeroSerieAvion() : UUID.randomUUID());
        avion.setNumeroSerieAvion(dto.getNumeroSerieAvion());
        avion.setTipodeavion(dto.getNombreTipoDeAvion());
        avion.setTotalDeAsientos(dto.getTotalDeAsientos());
        return repo.save(avion).toDto();
    }
}
