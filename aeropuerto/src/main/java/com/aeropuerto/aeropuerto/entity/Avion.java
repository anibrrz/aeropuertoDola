package com.aeropuerto.aeropuerto.entity;

import jakarta.persistence.*;

import com.aeropuerto.aeropuerto.Dto.AvionDTO;

import java.util.UUID;

@Entity
@Table(name = "avion")
public class Avion {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false, unique = true)
    private Integer numeroSerieAvion;

    private String nombreTipoDeAvion;
    private Integer totalDeAsientos;

    public AvionDTO toDto() {
        AvionDTO dto = new AvionDTO();
        dto.setId(this.id);
        dto.setNumeroSerieAvion(this.numeroSerieAvion);
        dto.setNombreTipoDeAvion(this.nombreTipoDeAvion);
        dto.setTotalDeAsientos(this.totalDeAsientos);
        return dto;
    }

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