package com.repositorios.implementacion;



import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import com.entidades.Empleado2;
import com.repositorios.BaseRepositorioEmpleado;


/*
 * Implementación más compleja de repositorio EMpleado. Extiende Repository, CRUDrepository,JPArepository...
 * Aqui operará con opciones más complejas, entitymanager, @transantional, JPQL, native query....
 * 
 */
@NoRepositoryBean
public interface ImpRepoEmpleado extends BaseRepositorioEmpleado {

	/*
	 * Query de tipo básico, sin parámetros, directamente para meter en orden
	 */
	
	@Query("SELECT t FROM Empleado2 t WHERE t.nombreEmpleado = ?1")
	String findEmpleadoByNombre2(String nombreEmpleado);
	
	/*
	 * Query de tipo básico, con paso de parámetros con @Param. Permite
	 * cambiar el orden y nombre de parámetros, asignando el @Param
	 */
	@Query("SELECT t.nombreEmpleado FROM Empleado2 t where t.nombreEmpleado = :n") 
    String findEmpleadoByNombre(@Param("n") String nombreEmpleado);
	
}
