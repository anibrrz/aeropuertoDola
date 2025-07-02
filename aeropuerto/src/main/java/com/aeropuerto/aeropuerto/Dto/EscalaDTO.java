package com.aeropuerto.aeropuerto.Dto;

import java.time.LocalTime;
import java.util.UUID;

public class EscalaDTO {
    private UUID id;
    private UUID vueloId;
    private int numeroEscala;
    private UUID aeropuertoId;
    private LocalTime horaLlegada;
    private LocalTime horaPartida;
	public UUID getId() {
		return id;
	}
	public void setId(UUID id) {
		this.id = id;
	}
	public UUID getVueloId() {
		return vueloId;
	}
	public void setVueloId(UUID vueloId) {
		this.vueloId = vueloId;
	}
	public int getNumeroEscala() {
		return numeroEscala;
	}
	public void setNumeroEscala(int numeroEscala) {
		this.numeroEscala = numeroEscala;
	}
	public UUID getAeropuertoId() {
		return aeropuertoId;
	}
	public void setAeropuertoId(UUID aeropuertoId) {
		this.aeropuertoId = aeropuertoId;
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