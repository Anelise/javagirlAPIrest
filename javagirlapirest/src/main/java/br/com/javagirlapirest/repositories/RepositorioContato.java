package br.com.javagirlapirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.javagirlapirest.models.Contato;

@Repository
public interface RepositorioContato extends JpaRepository<Contato, Long> {

}
