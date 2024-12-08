package com.sesame.projetnourouma.repository;

import com.sesame.projetnourouma.entities.Categorie;
import org.springframework.data.repository.CrudRepository;

public interface ICategorieRepository extends CrudRepository<Categorie, Integer> {
}
