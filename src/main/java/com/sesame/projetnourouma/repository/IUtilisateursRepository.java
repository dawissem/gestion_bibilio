package com.sesame.projetnourouma.repository;

import com.sesame.projetnourouma.entities.Utilisateurs;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUtilisateursRepository  extends CrudRepository<Utilisateurs, Integer>{
}
