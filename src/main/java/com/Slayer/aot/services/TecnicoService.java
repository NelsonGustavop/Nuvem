package com.Slayer.aot.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Slayer.aot.domain.Tecnico;
import com.Slayer.aot.repositories.TecnicoRepository;

@Service
public class TecnicoService {
	
	@Autowired
	private TecnicoRepository tcRep;
	
	public Tecnico findById(Integer id) {
		Optional<Tecnico> obj = tcRep.findById(id);
		return obj.orElse(null);
	}
}
