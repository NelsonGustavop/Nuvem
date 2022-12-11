package com.Slayer.aot;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.Slayer.aot.domain.Cliente;
import com.Slayer.aot.domain.Os;
import com.Slayer.aot.domain.Tecnico;
import com.Slayer.aot.domain.enums.Prioridade;
import com.Slayer.aot.domain.enums.Status;
import com.Slayer.aot.repositories.ClienteRepository;
import com.Slayer.aot.repositories.OsRepository;
import com.Slayer.aot.repositories.TecnicoRepository;

@SpringBootApplication
public class OsApplication implements CommandLineRunner {

	
	
	@Autowired
	private TecnicoRepository tecRep;
	@Autowired
	private ClienteRepository  cliRep;
	@Autowired
	private OsRepository osRep;
	
	
	public static void main(String[] args) {
		SpringApplication.run(OsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
			
		Tecnico t1 = new Tecnico(null, "Nelson", "11626959943", "25125238952");
		Tecnico t2 = new Tecnico(null, "Pexe", null, "25125238952");
		Cliente c3 = new Cliente(null, "Cleitin", null, "25125238952");
		Os os = new Os(null,null, Prioridade.ALTA, "Teste create 00", Status.ANDAMENTO, t2, c3);
		
		t1.getList().add(os);
		c3.getList().add(os);
		
		tecRep.saveAll(Arrays.asList(t1,t2));
		cliRep.saveAll(Arrays.asList(c3));
		osRep.saveAll(Arrays.asList(os));
		
	}

}
