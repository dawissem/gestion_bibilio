package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Emprunt;

import java.util.List;

public interface IEmpruntService {
    public List<Emprunt> retrieveAllEmprunts();
    public Emprunt retrieveEmprunt(int id);
    public Emprunt createEmprunt(Emprunt emprunt);
    public Emprunt updateEmprunt(Emprunt emprunt);
    public void deleteEmprunt(int id);


}
