package com.Slayer.aot.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Slayer.aot.domain.Tecnico;
import com.Slayer.aot.dtos.TecnicoDTO;
import com.Slayer.aot.services.TecnicoService;

@RestController
@RequestMapping(value= "/tecnicos")
public class TecnicoResource {
	
	@Autowired
	private TecnicoService service;
	
	@GetMapping(value="/{id}")
	public ResponseEntity<TecnicoDTO> findById(@PathVariable Integer id) {
		Tecnico obj = service.findById(id);
		TecnicoDTO objDTO = new TecnicoDTO(obj);
		return ResponseEntity.ok().body(objDTO);
		
	}

}
