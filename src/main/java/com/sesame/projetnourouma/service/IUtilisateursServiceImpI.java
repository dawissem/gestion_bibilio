package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Utilisateurs;
import com.sesame.projetnourouma.repository.IUtilisateursRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IUtilisateursServiceImpI implements IUtilisateursService {

    @Autowired
    private IUtilisateursRepository utilisateursRepository;

    @Override
    public List<Utilisateurs> retrieveAllUtilisateurs() {
        return (List<Utilisateurs>) utilisateursRepository.findAll();
    }


    @Override
    public Utilisateurs retrieveUtilisateurById(int id) {
        Optional<Utilisateurs> utilisateur = utilisateursRepository.findById(id);
        return utilisateur.orElse(null);
    }

    @Override
    public Utilisateurs createUtilisateur(Utilisateurs utilisateur) {
        return utilisateursRepository.save(utilisateur);
    }

    @Override
    public Utilisateurs updateUtilisateur(Utilisateurs utilisateur) {

        return utilisateursRepository.save(utilisateur);

    }

    @Override
    public boolean deleteUtilisateur(int id) {

        utilisateursRepository.deleteById(id);
        return true;

    }

}