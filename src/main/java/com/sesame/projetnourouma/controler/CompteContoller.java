package com.sesame.projetnourouma.controler;

import com.sesame.projetnourouma.entities.Compte;
import com.sesame.projetnourouma.service.ICompteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/compte")
public class CompteContoller {
    @Autowired
 private ICompteService compteService;
    @PostMapping("/add")  /* ok */
    public Compte addCompte(@RequestBody Compte compte) {
        return compteService.addCompte(compte);
    }

    // Modifier un compte
    @PutMapping("/update")  /* not ok */
    public Compte updateCompte(@RequestBody Compte compte) {
        return compteService.updateCompte(compte);
    }

    // Récupérer un compte par son ID
    @GetMapping("/get/{id}")  /* ok  */
    public Compte getCompte(@PathVariable int id) {
        return compteService.retrieveCompteById(id);
    }

    // Supprimer un compte par son ID
    @DeleteMapping("/delete/{id}")
    public void deleteCompte(@PathVariable int id) {
        compteService.deleteCompte(id);
    }

    // Récupérer tous les comptes
    @GetMapping("/getAll")  /* ok */
    public List<Compte> getAllComptes() {
        return compteService.retrieveAllComptes();
    }
}


