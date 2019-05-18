package br.com.javagirlapirest.controles;

import java.net.URI;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import br.com.javagirlapirest.models.Contato;
import br.com.javagirlapirest.services.ServicoContato;

@RestController
@RequestMapping("/contacts")
public class ControleContato {
	@Autowired
	private ServicoContato servicoContato;
	
	@PostMapping
	public ResponseEntity<Contato> create(@Valid @RequestBody Contato contato){
		Contato obj = servicoContato.save(contato);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).body(obj);
	}

}
