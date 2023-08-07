package tn.esprit.spring.services;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.spring.entities.Formateur;
import tn.esprit.spring.repositories.FormateurRepositorie;

@Service
public class FormateurServiceImpl  implements FormateurService{
    @Autowired
    FormateurRepositorie formateurRepositorie;
    @Override
    public  Formateur addFormateur(Formateur formateur) {
       return formateurRepositorie.save(formateur);

    }

    @Override
    public Formateur updateFormateur(Formateur formateur) {
     return    formateurRepositorie.save(formateur);
    }

    @Override
    public void deleateFormateur(int idFormateur) {
          formateurRepositorie.deleteById(idFormateur);
    }


}




