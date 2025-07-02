package com.aeropuerto.aeropuerto.entity;

import java.time.LocalTime;
import java.util.UUID;

import com.aeropuerto.aeropuerto.Dto.VueloDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "vuelos")
public class Vuelo {

    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "numeroDeSerieAvion")
    private Avion avion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nombreAeropuertoSalida")
    private Aeropuerto aeropuertoSalida;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nombreAeropuertoLlegada")
    private Aeropuerto aeropuertoLlegada;

    private LocalTime horaSalida;
    private LocalTime horaLlegada;

    public Vuelo() {
        this.id = UUID.randomUUID();
    }

    public VueloDTO toDto() {
        VueloDTO dto = new VueloDTO();
        dto.setId(id);
        dto.setAvionId(avion != null ? avion.getId() : null);
        dto.setAeropuertoSalidaId(aeropuertoSalida != null ? aeropuertoSalida.getId() : null);
        dto.setAeropuertoLlegadaId(aeropuertoLlegada != null ? aeropuertoLlegada.getId() : null);
        dto.setHoraSalida(horaSalida);
        dto.setHoraLlegada(horaLlegada);
        return dto;
    }

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public Avion getAvion() {
		return avion;
	}

	public void setAvion(Avion avion) {
		this.avion = avion;
	}

	public Aeropuerto getAeropuertoSalida() {
		return aeropuertoSalida;
	}

	public void setAeropuertoSalida(Aeropuerto aeropuertoSalida) {
		this.aeropuertoSalida = aeropuertoSalida;
	}

	public Aeropuerto getAeropuertoLlegada() {
		return aeropuertoLlegada;
	}

	public void setAeropuertoLlegada(Aeropuerto aeropuertoLlegada) {
		this.aeropuertoLlegada = aeropuertoLlegada;
	}

	public LocalTime getHoraSalida() {
		return horaSalida;
	}

	public void setHoraSalida(LocalTime horaSalida) {
		this.horaSalida = horaSalida;
	}

	public LocalTime getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(LocalTime horaLlegada) {
		this.horaLlegada = horaLlegada;
	}
    
    
}