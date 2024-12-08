package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Utilisateurs;

import java.util.List;

public interface IUtilisateursService {
    List<Utilisateurs> retrieveAllUtilisateurs();
    Utilisateurs retrieveUtilisateurById(int id);
    Utilisateurs createUtilisateur(Utilisateurs utilisateur);
    Utilisateurs updateUtilisateur(Utilisateurs utilisateur);
    boolean deleteUtilisateur(int id);
}
