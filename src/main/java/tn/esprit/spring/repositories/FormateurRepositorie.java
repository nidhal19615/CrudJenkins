package tn.esprit.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.entities.Formateur;

public interface FormateurRepositorie extends JpaRepository<Formateur, Integer> {
}
