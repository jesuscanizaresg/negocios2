package com.dao;

import java.util.List;

import com.entidades.Empleado2;

public interface InterfazRepositorioTrabajo {
	
	Empleado2 findById(Long id);
	Empleado2 save(Empleado2 empleado);
	List<Empleado2> findAll();
	
	void miscojonesBellos();
}
