package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Livre;

import java.util.List;

public interface ILivreService {
    public List<Livre>retrieveAllLivres();
    public Livre retrieveLivreById(int id);
    public Livre saveLivre(Livre livre);
    public void deleteLivreById(int id);
    public Livre updateLivre(Livre livre);
    public Livre addLivre(Livre livre);
}
