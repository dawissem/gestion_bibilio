package com.sesame.projetnourouma.controler;

import com.sesame.projetnourouma.entities.Livre;
import com.sesame.projetnourouma.service.ILivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/livre")
public class LivreController {
    @Autowired
    private ILivreService livreService;
    @GetMapping("/getAll")  /*  ok */
    public List<Livre> getAllLivres() {
        return livreService.retrieveAllLivres();
    }

    @PostMapping("/add")  /* ok */
    public Livre addLivre(@RequestBody Livre livre) {
        return livreService.addLivre(livre);
    }

    @GetMapping("/get/{id}")  /* ok */
    public Livre getLivreById(@PathVariable int id) {
        return livreService.retrieveLivreById(id);
    }



    @PutMapping("/update")  /*  not ok */
    public Livre updateLivre(@RequestBody Livre livre) {
        return livreService.updateLivre(livre);
    }

    @DeleteMapping("/delete/{id}")  /* ok */
    public void deleteLivre(@PathVariable int id) {
        livreService.deleteLivreById(id);
    }
}

