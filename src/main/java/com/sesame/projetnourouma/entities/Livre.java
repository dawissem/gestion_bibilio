package com.sesame.projetnourouma.entities;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Livre implements Serializable {
    @Id
    private int id;
    private String titre;
    private String ISBN;
    private Date date_edition;
    @OneToMany(mappedBy = "empt")
    private List<Emprunt> Emprunts;
    @OneToMany(mappedBy = "res")
    private  List<Reservation> reservations;
    @ManyToMany(mappedBy = "aute")
    private List<Auteur> auteurs;
    @ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinTable(
            name = "livre_categorie",
            joinColumns = @JoinColumn(name = "livre_id"),
            inverseJoinColumns = @JoinColumn(name = "categorie_id")
    )
    private Set<Categorie> categories = new HashSet<>();

}
