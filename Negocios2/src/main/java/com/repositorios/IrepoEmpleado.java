package com.repositorios;


import org.springframework.stereotype.Repository;

import com.repositorios.implementacion.ImpRepoEmpleado;
import com.entidades.Empresa2;
import com.entidades.Empleado2;
import java.util.List;




/*
 * Repositorio central que usará el programa para crear operaciones.
 * Extiende la base, con operaciones de Repository,CRUDrepository,JPArepository....
 * y además, extiende la clase implementación de repo, donde irán las operaciones más complejas,
 * con acesso y manejo de entitymanager, natives query, JPQL querys y los churros de query.
 */
@Repository
public interface IrepoEmpleado extends BaseRepositorioEmpleado,ImpRepoEmpleado {
	

	Empleado2 findByNombreEmpleado(String nombreEmpleado);

	Empleado2 findByEmpresa2AndNombreEmpleado(String n,String m);
	
	List<Empleado2> findByEmpresa2(Empresa2 empresa2);
	
}
