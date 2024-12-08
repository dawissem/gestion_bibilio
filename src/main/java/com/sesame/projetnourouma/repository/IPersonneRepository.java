package com.sesame.projetnourouma.repository;

import com.sesame.projetnourouma.entities.Personne;
import org.springframework.data.repository.CrudRepository;

public interface IPersonneRepository extends CrudRepository<Personne, Long> {
}
