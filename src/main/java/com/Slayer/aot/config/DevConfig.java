package com.Slayer.aot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.Slayer.aot.services.DbService;

@Configuration
@Profile("dev")
public class DevConfig {
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String ddl;
	
	
	@Autowired
	private DbService dbService;
	@Bean
	public boolean instanciaMySql() {
		if(ddl.equals("create")) {
		this.dbService.instanciaDb();
		}
		return false;
	}
}
