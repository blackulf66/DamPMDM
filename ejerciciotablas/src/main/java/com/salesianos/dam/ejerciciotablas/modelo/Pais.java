package com.salesianos.dam.ejerciciotablas.modelo;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.UUID;

@Entity
@AllArgsConstructor
@Builder
@Getter
@Setter
public class Pais {

    @Id
    private UUID id;

    private String nombre;

    public Pais(){
        id = UUID.randomUUID();
    }

}
