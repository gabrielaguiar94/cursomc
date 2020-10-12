package com.gabrielaguiar.cursomc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gabrielaguiar.cursomc.domain.Address;

@Repository
public interface AddressRepository  extends JpaRepository<Address, Integer>{	
	

}
