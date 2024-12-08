package com.sesame.projetnourouma.repository;

import com.sesame.projetnourouma.entities.Reservation;
import org.springframework.data.repository.CrudRepository;

public interface IReservationRepository extends CrudRepository<Reservation, Integer> {
}
