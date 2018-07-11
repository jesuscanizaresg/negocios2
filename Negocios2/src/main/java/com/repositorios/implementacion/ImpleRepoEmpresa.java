package com.repositorios.implementacion;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.repositorios.BaseRepositorioEmpresaJPA;
import com.repositorios.InterfaceRepoEmpresa;

@Repository
public abstract class ImpleRepoEmpresa implements InterfaceRepoEmpresa {

//	@Autowired
//	EntityManager entityMana;
	
	
	public ImpleRepoEmpresa() {
		// TODO Auto-generated constructor stub
	}

//	public void prueba() {
//		System.out.println("hola");
//	}
	
//	public String devuelveNombreEmpresa(String nombreEmpresa) {
//		
//		Empresa2 e = entityMana.find(Empresa2.class, nombreEmpresa);
//		
//		return e.getNombreEmpresa();
//	}
}
