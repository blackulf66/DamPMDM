package com.salesianos.dam.ejerciciotablas.modelo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import java.io.Serializable;
import java.util.UUID;

@Entity
@AllArgsConstructor
@Builder
@Getter
@Setter

public class Producto implements Serializable {

    @Id
    private UUID id;

    private String nombre;

    private double precio;

    private String imagen;

    @Lob
    private String descripcion;

    public Producto(){
        id = UUID.randomUUID();
    }

}
