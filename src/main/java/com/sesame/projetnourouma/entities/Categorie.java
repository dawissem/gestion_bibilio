package com.sesame.projetnourouma.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Categorie implements Serializable {
    @Id
    private int id;
    private String libelle;
    @ManyToMany(mappedBy = "categories")
    private Set<Livre> livres = new HashSet<>();

}
