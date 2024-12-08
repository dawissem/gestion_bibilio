package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Categorie;

import java.util.List;

public interface ICategorieService {
    public List<Categorie> retrieveAllCategories();
    public Categorie retreiveCategorieById(int id);
    public Categorie addCategorie(Categorie categorie);
    public Categorie updateCategorie(Categorie categorie);
    public void deleteCategorie(int id);
}
