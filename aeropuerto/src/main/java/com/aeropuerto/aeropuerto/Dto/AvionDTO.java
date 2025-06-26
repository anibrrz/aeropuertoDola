package com.aeropuerto.aeropuerto.Dto;

import java.util.UUID;

public class AvionDTO {
    private UUID id;
    private Integer numeroSerieAvion;
    private String nombreTipoDeAvion;
    private Integer totalDeAsientos;
    
	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}
	
	public Integer getNumeroSerieAvion() {
		return numeroSerieAvion;
	}
	
	public void setNumeroSerieAvion(Integer numeroSerieAvion) {
		this.numeroSerieAvion = numeroSerieAvion;
	}
	
	public String getNombreTipoDeAvion() {
		return nombreTipoDeAvion;
	}
	
	public void setNombreTipoDeAvion(String nombreTipoDeAvion) {
		this.nombreTipoDeAvion = nombreTipoDeAvion;
	}
	
	public Integer getTotalDeAsientos() {
		return totalDeAsientos;
	}
	
	public void setTotalDeAsientos(Integer totalDeAsientos) {
		this.totalDeAsientos = totalDeAsientos;
	}
    
}