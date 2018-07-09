package com.repositorios;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

import com.entidades.Empleado2;


/*
 * Repositorio base que extiende a REpository ,CRUD repositorio, etc.... todo lo que contienen
 * T describe el tipo de entidad manejada, e ID describe el tipo de campo id para la entidad
 */

//NoRepositoryBean: Esta etiqueta asegura que Spring Data JPA no intente crear una implementación de nuestro interfaz repositorio base
@NoRepositoryBean
//public interface BaseRepositorioEmpleado <T, ID extends Serializable> extends JpaRepository<T, ID>
public interface BaseRepositorioEmpleado extends JpaRepository<Empleado2, Integer> {
	


}
