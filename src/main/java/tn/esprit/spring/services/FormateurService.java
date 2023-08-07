package tn.esprit.spring.services;

import tn.esprit.spring.entities.Formateur;

import java.util.List;

public interface FormateurService {
    public Formateur addFormateur(Formateur formateur);
    Formateur updateFormateur(Formateur formateur);

    void deleateFormateur(int idFormateur);


}
