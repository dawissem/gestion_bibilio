package com.sesame.projetnourouma.repository;

import com.sesame.projetnourouma.entities.Livre;
import org.springframework.data.repository.CrudRepository;

public interface ILivreRepository extends CrudRepository<Livre, Integer> {
}
