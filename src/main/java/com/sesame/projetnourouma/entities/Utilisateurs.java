package com.sesame.projetnourouma.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Utilisateurs  implements Serializable {
    @Id
    private int id;
    private String name;
    private String prenom;
    private String cin;
    @OneToOne(mappedBy = "ut")
    private Compte compte;
    @OneToMany(mappedBy = "em")
    private List<Emprunt> emprunts;
    @OneToMany(mappedBy = "re")
    private List<Reservation>reservations;
    @OneToOne(mappedBy = "uts")
    private Reservation reservation;


}
