package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Reservation;
import com.sesame.projetnourouma.repository.IReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IReservationServiceImpI implements IReservationService {

    @Autowired
    private IReservationRepository ReservationRepository;

    @Override
    public List<Reservation> retrieveAllReservations() {
        return (List<Reservation>) ReservationRepository.findAll();
    }

    @Override
    public Reservation retrieveReservationById(int id) {
        Optional<Reservation> reservation = ReservationRepository.findById(id);
        return reservation.orElse(null);
    }

    @Override
    public Reservation createReservation(Reservation reservation) {
        return ReservationRepository.save(reservation);
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {

            return ReservationRepository.save(reservation);
    }

    // Supprimer une réservation
    @Override
    public void deleteReservation(Reservation reservation) {
        ReservationRepository.delete(reservation);
    }
}
