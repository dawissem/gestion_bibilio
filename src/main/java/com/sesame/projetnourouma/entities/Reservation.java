package com.sesame.projetnourouma.entities;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;
import java.util.Date;


@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Reservation implements Serializable {
    @Id
    private int id;
    private Date date_retour;
    private Date date_annulation;
    private Date date_reservation;
    @ManyToOne
    private Utilisateurs re;
    @OneToOne
    private Utilisateurs uts;
    @ManyToOne
    private Livre res;
}
