package com.aeropuerto.aeropuerto.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.aeropuerto.aeropuerto.entity.Avion;

import java.util.UUID;

@Repository
public interface AvionRepository extends JpaRepository<Avion, UUID> {}