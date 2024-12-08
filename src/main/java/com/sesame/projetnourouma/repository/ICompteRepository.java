package com.sesame.projetnourouma.repository;

import com.sesame.projetnourouma.entities.Compte;
import org.springframework.data.repository.CrudRepository;

public interface ICompteRepository extends CrudRepository<Compte, Integer> {
}
