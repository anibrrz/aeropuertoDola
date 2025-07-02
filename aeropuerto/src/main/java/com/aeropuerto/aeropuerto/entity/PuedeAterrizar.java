package com.aeropuerto.aeropuerto.entity;

import java.util.UUID;

import com.aeropuerto.aeropuerto.Dto.PuedeAterrizarDTO;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "puedeaterrizar")
public class PuedeAterrizar {

    @Id
    private UUID id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nombreTipoDeAvion")
    private TipoDeAvion tipoDeAvion;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "nombreAeropuerto")
    private Aeropuerto aeropuerto;

    public PuedeAterrizar() {
        this.id = UUID.randomUUID();
    }

    public PuedeAterrizarDTO toDto() {
        PuedeAterrizarDTO dto = new PuedeAterrizarDTO();
        dto.setId(id);
        dto.setTipoDeAvionId(tipoDeAvion != null ? tipoDeAvion.getId() : null);
        dto.setAeropuertoId(aeropuerto != null ? aeropuerto.getId() : null);
        return dto;
    }

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public TipoDeAvion getTipoDeAvion() {
		return tipoDeAvion;
	}

	public void setTipoDeAvion(TipoDeAvion tipoDeAvion) {
		this.tipoDeAvion = tipoDeAvion;
	}

	public Aeropuerto getAeropuerto() {
		return aeropuerto;
	}

	public void setAeropuerto(Aeropuerto aeropuerto) {
		this.aeropuerto = aeropuerto;
	}
}