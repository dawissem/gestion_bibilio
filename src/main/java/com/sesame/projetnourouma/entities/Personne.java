package com.sesame.projetnourouma.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Personne implements Serializable {
    @Id
    private int id;
    private String nome;
    private String prenom;
    private String Cin;
}
