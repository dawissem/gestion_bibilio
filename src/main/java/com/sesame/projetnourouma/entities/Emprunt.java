package com.sesame.projetnourouma.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Emprunt implements Serializable {
    @Id
    private int id;
    private Date date_retour;
    private Date date_entourée;
    @ManyToOne
    private Utilisateurs em;
    @ManyToOne
    private Livre empt;
}
