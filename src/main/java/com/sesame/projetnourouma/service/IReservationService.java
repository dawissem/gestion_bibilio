package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Reservation;

import java.util.List;

public interface IReservationService {
    public List<Reservation> retrieveAllReservations();
    public Reservation retrieveReservationById(int id);
    public Reservation updateReservation(Reservation reservation);
    public void deleteReservation(Reservation reservation);
    public Reservation createReservation(Reservation reservation);

}
