package tn.esprit.spring.controllers;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tn.esprit.spring.entities.Formateur;
import tn.esprit.spring.services.FormateurService;

@RestController


public class FormateurController {
    @Autowired
    FormateurService formateurService;

    @PostMapping("/ajouterFormateur")
    public Formateur addFormateur(@RequestBody Formateur formateur){

       return formateurService.addFormateur(formateur);

  }
  @PutMapping("/modifierFormateur")
  public Formateur modifierFormateur(@RequestBody Formateur formateur) {

      return formateurService.updateFormateur(formateur);


  }
  @DeleteMapping("/supprimerFormateur/{idFormateur}")
    public void supprimerFormateur(@PathVariable int idFormateur) {

        formateurService.deleateFormateur(idFormateur);

  }}
