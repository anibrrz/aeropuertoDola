package com.aeropuerto.aeropuerto.Dto;

import java.util.UUID;

public class PuedeAterrizarDTO {
    private UUID id;
    private UUID tipoDeAvionId;
    private UUID aeropuertoId;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getTipoDeAvionId() {
        return tipoDeAvionId;
    }

    public void setTipoDeAvionId(UUID tipoDeAvionId) {
        this.tipoDeAvionId = tipoDeAvionId;
    }

    public UUID getAeropuertoId() {
        return aeropuertoId;
    }

    public void setAeropuertoId(UUID aeropuertoId) {
        this.aeropuertoId = aeropuertoId;
    }
}