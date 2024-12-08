package com.sesame.projetnourouma.controler;

import com.sesame.projetnourouma.entities.Utilisateurs;
import com.sesame.projetnourouma.service.IUtilisateursService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/utilisateur")
public class UtilisateursController {
    @Autowired
    private IUtilisateursService utilisateursService;
    @GetMapping("/getAll")
    public List<Utilisateurs> getAllUtilisateurs() {
        return utilisateursService.retrieveAllUtilisateurs();
    }

    @GetMapping("/get/{id}")
    public Utilisateurs getUtilisateurById(@PathVariable int id) {
        return utilisateursService.retrieveUtilisateurById(id);
    }

    @PostMapping("/add")
    public Utilisateurs addUtilisateur(@RequestBody Utilisateurs utilisateur) {
        return utilisateursService.createUtilisateur(utilisateur);
    }

    @PutMapping("/update")
    public Utilisateurs updateUtilisateur(@RequestBody Utilisateurs utilisateur) {
        return utilisateursService.updateUtilisateur(utilisateur);
    }

    @DeleteMapping("/delete/{id}")
    public boolean deleteUtilisateur(@PathVariable int id) {
        return utilisateursService.deleteUtilisateur(id);
    }

}
