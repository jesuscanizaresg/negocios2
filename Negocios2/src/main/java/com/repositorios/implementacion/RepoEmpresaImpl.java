package com.repositorios.implementacion;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.repositorios.BaseRepositorioEmpresa;
import com.repositorios.InterfaceRepoEmpresa;

@Repository
public abstract class RepoEmpresaImpl implements InterfaceRepoEmpresa,BaseRepositorioEmpresa {

	@Autowired
	EntityManager entityMana;
	
	
	public RepoEmpresaImpl() {
		// TODO Auto-generated constructor stub
	}

	public void prueba() {
		System.out.println("hola");
	}
	
//	public String devuelveNombreEmpresa(String nombreEmpresa) {
//		
//		Empresa2 e = entityMana.find(Empresa2.class, nombreEmpresa);
//		
//		return e.getNombreEmpresa();
//	}
}
