package com.sesame.projetnourouma.controler;

import com.sesame.projetnourouma.entities.Categorie;
import com.sesame.projetnourouma.service.ICategorieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategorieController {

    @Autowired
    private ICategorieService categorieService;
    @PostMapping("/add")  /* ok */
    public Categorie addCategorie(@RequestBody Categorie categorie) {
        return categorieService.addCategorie(categorie);
    }

    @PutMapping("/update")  /* faux */
    public Categorie updateCategorie(@RequestBody Categorie categorie) {
        return categorieService.updateCategorie(categorie);
    }

    @GetMapping("/get/{id}")   /* ok */
    public Categorie getCategorie(@PathVariable int id) {
        return categorieService.retreiveCategorieById(id);
    }

    @DeleteMapping("/delete/{id}")   /* ok */
    public void deleteCategorie(@PathVariable int id) {
        categorieService.deleteCategorie(id);
    }

    @GetMapping("/getAll")  /* ok */
    public List<Categorie> getAllCategories() {
        return categorieService.retrieveAllCategories();
    }
}
