package com.appNegocios2;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.jdbc.core.JdbcTemplate;

import com.entidades.Empleado2;
import com.entidades.Empresa2;
import com.repositorios.IrepoEmpleado;
import com.repositorios.IrepoEmpresa;
import com.repositorios.implementacion.ImpRepoEmpleado;

@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.repositorios")
@EntityScan("com.entidades")
public class Negocios2Application implements CommandLineRunner{

	@Autowired
	IrepoEmpleado repEmpleado;
	
	@Autowired
	IrepoEmpresa repositorioEmpresa;
	
	public static void main(String[] args) {
		SpringApplication.run(Negocios2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repEmpleado.deleteAll();
		repositorioEmpresa.deleteAll();
		
		
		Empresa2 empresa1 = new Empresa2("Amazon","955444887",null);
		repositorioEmpresa.save(empresa1);
		
		Empleado2 empleado1 = new Empleado2("Pezaeres", "Antonio", null);
		empleado1.setEmpresa2(empresa1);
		repEmpleado.save(empleado1);
		
		System.out.println("___---------------------____________");
		System.out.println("Buscando empleado Antonio, que trabaja en amazon.....");
		
		Empleado2 e2 = repEmpleado.findByNombreEmpleado("Antonio");
		System.out.println("Encontrado "+e2.getNombreEmpleado()+" que trabaja en: "+e2.getEmpresa2().getNombreEmpresa());
		
		System.out.println("Buscando empleado por nombre: "+repEmpleado.findEmpleadoByNombre("Antonio"));
		
	}
}
