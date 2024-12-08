package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Compte;

import java.util.List;

public interface ICompteService {
    public List<Compte> retrieveAllComptes();
    public Compte retrieveCompteById(int id);
    public Compte saveCompte(Compte compte);
    public Compte updateCompte(Compte compte);
    public void deleteCompte(int id);
    public Compte addCompte(Compte compte);

}
