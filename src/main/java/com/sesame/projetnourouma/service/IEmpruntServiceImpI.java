package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Emprunt;
import com.sesame.projetnourouma.repository.IEmpruntRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class IEmpruntServiceImpI implements IEmpruntService {

    @Autowired
    private IEmpruntRepository EmpruntRepository;

    @Override
    public List<Emprunt> retrieveAllEmprunts() {
        return (List<Emprunt>) EmpruntRepository.findAll();
    }

    @Override
    public Emprunt retrieveEmprunt(int id) {
        Optional<Emprunt> emprunt = EmpruntRepository.findById(id);
        return emprunt.orElse(null);
    }

    @Override
    public Emprunt createEmprunt(Emprunt emprunt) {
        return EmpruntRepository.save(emprunt);
    }

    @Override
    public Emprunt updateEmprunt(Emprunt emprunt) {

            return EmpruntRepository.save(emprunt);
    }

    @Override
    public void deleteEmprunt(int id) {

            EmpruntRepository.deleteById(id);

    }
}
