package com.gabrielaguiar.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gabrielaguiar.cursomc.domain.Client;
import com.gabrielaguiar.cursomc.repositories.ClientRepository;

@Service
public class ClientService {

	@Autowired
	private ClientRepository repo;

	// Essa chamada estava sendo usada abaixo do Java 8
//	public Categoria buscar(Integer id) {
//		Categoria obj = repo.findOne(id);
//		return obj;
//	}
	
	public Client find(Integer id){
		Optional<Client> obj = repo.findById(id);		
		return obj.orElseThrow(() -> new com.gabrielaguiar.cursomc.services.exceptions.ObjectNotFoundException(
				"Object not found! Id: " + id + ", Type: " + Client.class.getName()));
	}

}
