package com.appNegocios2;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.repositorios.InterfaceRepoEmpresa;
import com.entidades.Empleado2;
import com.entidades.Empresa2;
import com.repositorios.InterfaceRepoEmpresa;
import com.repositorios.InterfaceRepoEmpleado;


@SpringBootApplication
@EnableAutoConfiguration
@EnableJpaRepositories("com.repositorios")
@EntityScan("com.entidades")
public class Negocios2Application implements CommandLineRunner{

	int ee = 0;
	
	@Autowired
	InterfaceRepoEmpleado repEmpleado;
	
	@Autowired
	InterfaceRepoEmpresa repositorioEmpresa;
	
	public static void main(String[] args) {
		SpringApplication.run(Negocios2Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		repEmpleado.truncateEmpleados2();
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
		
		System.out.println("----------------------------------");
		System.out.println("Buscando empleado por nombre native query resultado: "+repEmpleado.devuelveNombreEmpleado("Antonio"));
		
		System.out.println("----------------------------------");
		
		System.out.println("Se han encontrado: "+String.valueOf(repEmpleado.findByNombreEmpleadoOrIdEmpleados("Antoni", 22).size())+" empleados.");
		//int tamañoLista = repEmpleado.findByNombreEmpleadoOrIdEmpleados("Antonio", 22).size();
		
		
		
		if(repEmpleado.findByNombreEmpleadoOrIdEmpleados("Antonio", 22).size() > 0) {
			
			repEmpleado.findByNombreEmpleadoOrIdEmpleados("Antonio", 22).forEach(empleado -> {
				System.out.println("Encontrado empleado: "+(++ee) + " " + empleado.getNombreEmpleado());
			});
		}else {
			System.out.println("No se han encontrado empleados");
		}
		
		if(repEmpleado.findBySearchTermJPQL("Antonio").size() >0) {
			repEmpleado.findBySearchTermJPQL("Antonio").forEach(empleadoEncontrado -> {
				System.out.println("Encontrado empleado con metodo searchTermJPQL: " + empleadoEncontrado.getIdEmpleados()
					+ " nombre: " + empleadoEncontrado.getNombreEmpleado()
					+ " empresa: " + empleadoEncontrado.getEmpresa2().getNombreEmpresa());
			});
		}else {
			System.out.println("No se han encontrado encpleados con serachtTermnJPQL");
		}
		
		if(repEmpleado.findBySearchTermSQL("Antonio").size() >0) {
			repEmpleado.findBySearchTermSQL("Antonio").forEach(empleadoEncontrado -> {
				System.out.println("Encontrado empleado con metodo searchTermSQL: " + empleadoEncontrado.getIdEmpleados()
					+ " nombre: " + empleadoEncontrado.getNombreEmpleado()
					+ " empresa: " + empleadoEncontrado.getEmpresa2().getNombreEmpresa());
			});
		}else {
			System.out.println("No se han encontrado encpleados con serachtTermnJPQL");
		}
		
		System.out.println("------------------------------------------------");
		System.out.println("Empresa------------------ Consultas");
		
		//System.out.println("Buscando empresa por nombre en interfaz....."+repositorioEmpresa.
		
		
	}
	
//	@Bean
//	app app1() {
//		return new app();
//	}
}
