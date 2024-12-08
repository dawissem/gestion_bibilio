package com.sesame.projetnourouma.repository;

import com.sesame.projetnourouma.entities.Auteur;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface IAuteurRepository extends CrudRepository<Auteur, Integer> {
    public List<Auteur> findByNome(String nome);
    public List<Auteur> findByPrenom(String prenom);
    public List<Auteur> findByCin(String cin);


}
