package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Auteur;

import java.util.List;

public interface IAuteurService {
    public List<Auteur> retrieveAllAuteurs();
    public Auteur retrieveAuteurById(int id);
    public Auteur updateAuteur(Auteur auteur);
    public Auteur addAuteur(Auteur auteur);
    public void deleteAuteur(int id);

}
