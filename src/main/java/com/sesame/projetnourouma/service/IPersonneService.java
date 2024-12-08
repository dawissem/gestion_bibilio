package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Personne;

import java.util.List;

public interface IPersonneService {
    public List<Personne> retrieveAllPersonnes();
    public Personne retrievePersonne(int id);
    public Personne createPersonne(Personne personne);
    public Personne updatePersonne(Personne personne);
    public void deletePersonne(int id);
    public Personne addPersonne(Personne personne);
}
