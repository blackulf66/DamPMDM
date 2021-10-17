package com.salesianos.dam.ejerciciotablas.repository;

import com.salesianos.dam.ejerciciotablas.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ProductoRepository extends JpaRepository<Producto, UUID> {


}
