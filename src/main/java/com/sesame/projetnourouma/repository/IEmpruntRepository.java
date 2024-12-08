package com.sesame.projetnourouma.repository;

import com.sesame.projetnourouma.entities.Emprunt;
import org.springframework.data.repository.CrudRepository;

public interface IEmpruntRepository extends CrudRepository<Emprunt, Integer> {
}
