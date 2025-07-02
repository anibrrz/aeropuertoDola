package com.aeropuerto.aeropuerto.entity;

import java.time.LocalTime;
import java.util.UUID;

import com.aeropuerto.aeropuerto.Dto.EscalaDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "escalas")
public class Escala {

    @Id
    private UUID id;

    private int numeroEscala;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "numeroDeVuelo")
    private Vuelo vuelo;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nombreAeropuerto")
    private Aeropuerto aeropuerto;

    private LocalTime horaLlegada;
    private LocalTime horaPartida;

    public Escala() {
        this.id = UUID.randomUUID();
    }

    public EscalaDTO toDto() {
        EscalaDTO dto = new EscalaDTO();
        dto.setId(id);
        dto.setVueloId(vuelo != null ? vuelo.getId() : null);
        dto.setNumeroEscala(numeroEscala);
        dto.setAeropuertoId(aeropuerto != null ? aeropuerto.getId() : null);
        dto.setHoraLlegada(horaLlegada);
        dto.setHoraPartida(horaPartida);
        return dto;
    }

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public int getNumeroEscala() {
		return numeroEscala;
	}

	public void setNumeroEscala(int numeroEscala) {
		this.numeroEscala = numeroEscala;
	}

	public Vuelo getVuelo() {
		return vuelo;
	}

	public void setVuelo(Vuelo vuelo) {
		this.vuelo = vuelo;
	}

	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}

	public LocalTime getHoraLlegada() {
		return horaLlegada;
	}

	public void setHoraLlegada(LocalTime horaLlegada) {
		this.horaLlegada = horaLlegada;
	}

	public LocalTime getHoraPartida() {
		return horaPartida;
	}

	public void setHoraPartida(LocalTime horaPartida) {
		this.horaPartida = horaPartida;
	}
} 