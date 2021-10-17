package com.salesianos.dam.ejerciciotablas.repository;

import com.salesianos.dam.ejerciciotablas.modelo.Pais;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface PaisRepository extends JpaRepository<Pais, UUID> {
}
