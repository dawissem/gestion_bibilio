package com.sesame.projetnourouma.service;

import com.sesame.projetnourouma.entities.Categorie;
import com.sesame.projetnourouma.repository.ICategorieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ICategorieServiceImpI implements ICategorieService {

    @Autowired
    private ICategorieRepository CategorieRepository;

    @Override
    public List<Categorie> retrieveAllCategories() {
        return (List<Categorie>) CategorieRepository.findAll();
    }

    @Override
    public Categorie retreiveCategorieById(int id) {
        Optional<Categorie> categorie = CategorieRepository.findById(id);
        return categorie.orElse(null);
    }

    @Override
    public Categorie addCategorie(Categorie categorie) {
        return CategorieRepository.save(categorie);
    }


    @Override
    public Categorie updateCategorie(Categorie categorie) {

        return CategorieRepository.save(categorie);
    }



    @Override
    public void deleteCategorie(int id) {

            CategorieRepository.deleteById(id);

    }
}
