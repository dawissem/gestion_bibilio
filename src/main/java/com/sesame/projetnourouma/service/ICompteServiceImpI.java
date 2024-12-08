package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Categorie;
import com.sesame.projetnourouma.entities.Compte;
import com.sesame.projetnourouma.repository.ICompteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Service
public class ICompteServiceImpI implements ICompteService {

    @Autowired
    private ICompteRepository CompteRepository;

    @Override
    public List<Compte> retrieveAllComptes() {
        return (List<Compte>) CompteRepository.findAll();
    }

    @Override
    public Compte retrieveCompteById(int id) {
        Optional<Compte> compte = CompteRepository.findById(id);
        return compte.orElse(null);
    }

    @Override
    public Compte saveCompte(Compte compte) {
        return CompteRepository.save(compte);
    }

    @Override
    public Compte updateCompte(Compte compte) {

            return CompteRepository.save(compte);
    }

    @Override
    public void deleteCompte(int id) {

            CompteRepository.deleteById(id);

    }

    @Override
    public Compte addCompte(Compte compte) {
        return CompteRepository.save(compte);    }


}
