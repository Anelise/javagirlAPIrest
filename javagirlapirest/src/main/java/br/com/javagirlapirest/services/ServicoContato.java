package br.com.javagirlapirest.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.javagirlapirest.models.Contato;
import br.com.javagirlapirest.repositories.RepositorioContato;

@Service
public class ServicoContato {
	@Autowired
	private RepositorioContato repositorioContato;
	
	public Contato findById(Long id) {
		return repositorioContato.findOne(id);
	}
	
	public List<Contato> findAll() {
		return repositorioContato.findAll();
	}
	
	public Contato save(Contato contact) {
		return repositorioContato.save(contact);
	}
	
	public void deleteById(long id) {
		repositorioContato.delete(id);
	}
	
	public void deleteAll() {
		repositorioContato.deleteAll();
	}
}
