package com.dao.impl;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.jpa.event.spi.JpaIntegrator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.dao.InterfazRepositorioTrabajo;
import com.entidades.Empleado2;

@Repository
public class ImplRepositorioTrabajo implements InterfazRepositorioTrabajo {

	@Autowired
	EntityManager entitymana;
	
	public ImplRepositorioTrabajo() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Empleado2 findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Empleado2 save(Empleado2 empleado) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Empleado2> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void miscojonesBellos() {
		// TODO Auto-generated method stub
		
	}

}
