package com.sesame.projetnourouma.controler;

import com.sesame.projetnourouma.entities.Auteur;
import com.sesame.projetnourouma.service.IAuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/auteurs")
public class AuteurController {

    @Autowired
    private IAuteurService auteurService;

    @GetMapping  /*ok*/
    public List<Auteur> getAllAuteurs() {
        return auteurService.retrieveAllAuteurs();
    }

    @PostMapping /* ok */
    public Auteur createAuteur(@RequestBody Auteur auteur) {
        return auteurService.addAuteur(auteur);
    }


    @GetMapping("/{id}")  /* ok */
    public Auteur getAuteurById(@PathVariable int id) {
        return auteurService.retrieveAuteurById(id);
    }


    @PutMapping    /*  no ok */
    public Auteur updateAuteur(@RequestBody Auteur auteur) {
        return auteurService.updateAuteur(auteur);
    }

    @DeleteMapping("/{id}")   /*  ok */
    public void  deleteAuteur(@PathVariable int id) {
        auteurService.deleteAuteur(id);

    }
}