package com.aeropuerto.aeropuerto.service;

import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aeropuerto.aeropuerto.Dto.EscalaDTO;
import com.aeropuerto.aeropuerto.entity.Aeropuerto;
import com.aeropuerto.aeropuerto.entity.Escala;
import com.aeropuerto.aeropuerto.entity.Vuelo;
import com.aeropuerto.aeropuerto.repository.AeropuertoRepository;
import com.aeropuerto.aeropuerto.repository.EscalaRepository;
import com.aeropuerto.aeropuerto.repository.VueloRepository;

@Service
public class EscalaService {

    @Autowired
    private EscalaRepository escalaRepository;

    @Autowired
    private VueloRepository vueloRepository;

    @Autowired
    private AeropuertoRepository aeropuertoRepository;

    public Optional<EscalaDTO> getById(UUID id) {
        return escalaRepository.findById(id).map(Escala::toDto);
    }

    public EscalaDTO upsert(EscalaDTO dto) {
        Escala escala = new Escala();
        escala.setId(dto.getId() != null ? dto.getId() : UUID.randomUUID());
        escala.setNumeroEscala(dto.getNumeroEscala());
        escala.setHoraLlegada(dto.getHoraLlegada());
        escala.setHoraPartida(dto.getHoraPartida());

        Vuelo vuelo = vueloRepository.findById(dto.getVueloId()).orElse(null);
        Aeropuerto aeropuerto = aeropuertoRepository.findById(dto.getAeropuertoId()).orElse(null);

        escala.setVuelo(vuelo);
        escala.setAeropuerto(aeropuerto);

        return escalaRepository.save(escala).toDto();
    }
}