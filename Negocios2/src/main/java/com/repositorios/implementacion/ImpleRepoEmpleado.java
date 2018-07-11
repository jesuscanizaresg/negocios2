package com.repositorios.implementacion;


import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;
import org.springframework.data.repository.query.Param;

import com.entidades.Empleado2;
import com.repositorios.BaseRepositorioEmpleado;



/*
 * Implementación repositorio EMpleado. Extiende Repository, CRUDrepository,JPArepository...
 * 
 */

@NoRepositoryBean
public interface ImpleRepoEmpleado extends BaseRepositorioEmpleado {

	/*
	 * Query de tipo básico, sin parámetros, directamente para meter en orden
	 * JPQL
	 */
	@Query("SELECT t FROM Empleado2 t WHERE t.nombreEmpleado = ?1")
	String findEmpleadoByNombre2(String nombreEmpleado);
	
	/*
	 * Query de tipo básico, con paso de parámetros con @Param. Permite
	 * cambiar el orden y nombre de parámetros, asignando el @Param
	 * JPQL
	 */
	@Query("SELECT t.nombreEmpleado FROM Empleado2 t where t.nombreEmpleado = :n") 
    String findEmpleadoByNombre(@Param("n") String nombreEmpleado);
	
	/*
	 *NAMED Y NATIVE QUERY -> querys nativas de SQL.
	 */
	
	@Query(value = "SELECT nombre_empleado FROM Empleado2 WHERE nombre_empleado = :nombre", nativeQuery=true)
	String devuelveNombreEmpleado (@Param("nombre") String nombreEmpleado);
	
	/*
	 * Error siguiente, si no se incluyen los "Modifying y @Transactional con la query. Al final he colocado @Transactional a toda la clase, para probar
	 * Can not issue data manipulation statements with executeQuery().
	 * He puesto transactional en toda la clase para 
	 */
	@Transactional
	@Modifying
	@Query(value = "TRUNCATE empleado2",nativeQuery=true)
	void truncateEmpleados2();
	
	/*
	 * Crear Querys con churros de texto seguido.
	 */
	public List<Empleado2> findByNombreEmpleadoOrIdEmpleados(String nombreEmpleado,Integer idEmpleado);
	
	//Count empleados
	public long countBynombreEmpleado(String nombreEmpleado);
	
	/*
	 * Case insesitive busqueda con JPQL
	 */
	
	@Query("SELECT t FROM Empleado2 t WHERE LOWER(t.nombreEmpleado) LIKE LOWER(CONCAT('%',:searchTerm, '%')) OR LOWER(t.apellidoEmpleado) LIKE LOWER(CONCAT('%',:searchTerm, '%'))")
    List<Empleado2> findBySearchTermJPQL(@Param("searchTerm") String searchTerm);
	
	/*
	 * Case insensitive con SQL
	 */
	
	@Query(value = "SELECT * FROM empleado2 e WHERE LOWER(e.nombre_empleado) LIKE LOWER(CONCAT('%',:searchTerm,'%')) OR LOWER(e.apellido_empleado) LIKE LOWER(CONCAT('%',:searchTerm,'%'))", nativeQuery=true)
	List<Empleado2> findBySearchTermSQL(@Param("searchTerm") String searchTerm);
	
	
	
	/*
	 * Dinamic Querys
	 */
	
}
