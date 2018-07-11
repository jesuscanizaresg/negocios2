package com.appNegocios3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dao.InterfazRepositorioTrabajo;
import com.entidades.Empleado2;
import com.repositorios.RepositorioEmpleadoJPA;
import com.repositorios.RepositorioEmpresaJPA;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories({"com.repositorios"})
@EntityScan("com.entidades")
@ComponentScan("com.*")
public class Negocios3Application implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(Negocios3Application.class, args);
	}

	@Autowired
	InterfazRepositorioTrabajo repTrabajo;
	
	@Autowired
	RepositorioEmpleadoJPA repJPAempleado;
	
	@Autowired
	RepositorioEmpresaJPA repJPAempresa;
	

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
	}
	


	
//	@Bean
//	applicacion applicacion() {
//		return new applicacion();
//	}
}
