package com.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.entidades.Empleado2;

public interface RepositorioEmpleadoJPA extends JpaRepository<Empleado2, Integer> {

}
