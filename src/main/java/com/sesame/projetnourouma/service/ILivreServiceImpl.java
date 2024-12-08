package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Livre;
import com.sesame.projetnourouma.repository.ILivreRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ILivreServiceImpl implements ILivreService {

    @Autowired
    private ILivreRepository LivreRepository;

    @Override
    public List<Livre> retrieveAllLivres() {
        return (List<Livre>) LivreRepository.findAll();
    }

    @Override
    public Livre retrieveLivreById(int id) {
        Optional<Livre> livre = LivreRepository.findById(id);
        return livre.orElse(null);
    }

    @Override
    public Livre saveLivre(Livre livre) {
        return LivreRepository.save(livre);
    }

    @Override
    public void deleteLivreById(int id) {

            LivreRepository.deleteById(id);

    }

    @Override
    public Livre updateLivre(Livre livre) {

            return LivreRepository.save(livre);
    }


    @Override
    public Livre addLivre(Livre livre) {
        return LivreRepository.save(livre);
    }
}
