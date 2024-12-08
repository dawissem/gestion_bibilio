package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Personne;
import com.sesame.projetnourouma.repository.IPersonneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IPersonneServiceImpI implements IPersonneService {

    @Autowired
    private IPersonneRepository PersonneRepository;

    @Override
    public List<Personne> retrieveAllPersonnes() {
        return (List<Personne>) PersonneRepository.findAll();
    }

    @Override
    public Personne retrievePersonne(int id) {
        Optional<Personne> personne = PersonneRepository.findById((long) id);
        return personne.orElse(null);
    }

    @Override
    public Personne createPersonne(Personne personne) {
        return PersonneRepository.save(personne);
    }

    @Override
    public Personne updatePersonne(Personne personne) {

            return PersonneRepository.save(personne);
    }

    @Override
    public void deletePersonne(int id) {

            PersonneRepository.deleteById((long) id);

    }

    @Override
    public Personne addPersonne(Personne personne) {
        return PersonneRepository.save(personne);
    }
}
