package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Auteur;
import com.sesame.projetnourouma.repository.IAuteurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IAuteurServiceImpI implements IAuteurService {

    @Autowired
    private IAuteurRepository AuteurRepository;

    @Override
    public List<Auteur> retrieveAllAuteurs() {
        return (List<Auteur>) AuteurRepository.findAll();
    }

    @Override
    public Auteur retrieveAuteurById(int id) {
        Optional<Auteur> auteur = AuteurRepository.findById(id);
        return auteur.orElse(null);
    }

    @Override
    public Auteur updateAuteur(Auteur auteur) {

            return AuteurRepository.save(auteur);

    }

    @Override
    public Auteur addAuteur(Auteur auteur) {
        return AuteurRepository.save(auteur);
    }

    @Override
    public void deleteAuteur(int id) {

            AuteurRepository.deleteById(id);

    }
}
