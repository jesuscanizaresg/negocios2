package com.appNegocios2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.repositorios.InterfaceRepoEmpresa;
import com.repositorios.InterfaceRepoEmpleado;

import com.entidades.Empleado2;
import com.entidades.Empresa2;

//@Component
public class app {

//	@Autowired
//	InterfaceRepoEmpleado repEmpleado;
//	
//	
//	@Autowired
//	InterfaceRepoEmpresa repositorioEmpresa;
//	
//	int ee=0;
//	
//	public void app1() {
//		// TODO Auto-generated constructor stub
//		repEmpleado.truncateEmpleados2();
//		repEmpleado.deleteAll();
//
//		
//		
//		
//		Empresa2 empresa1 = new Empresa2("Amazon","955444887",null);
//		//repositorioBaseJPAEmpresa.save(empresa1);
//		
//		Empleado2 empleado1 = new Empleado2("Pezaeres", "Antonio", null);
//		empleado1.setEmpresa2(empresa1);
//		repEmpleado.save(empleado1);
//		
//		System.out.println("___---------------------____________");
//		System.out.println("Buscando empleado Antonio, que trabaja en amazon.....");
//		
//		Empleado2 e2 = repEmpleado.findByNombreEmpleado("Antonio");
//		System.out.println("Encontrado "+e2.getNombreEmpleado()+" que trabaja en: "+e2.getEmpresa2().getNombreEmpresa());
//		
//		System.out.println("Buscando empleado por nombre: "+repEmpleado.findEmpleadoByNombre("Antonio"));
//		
//		System.out.println("----------------------------------");
//		System.out.println("Buscando empleado por nombre native query resultado: "+repEmpleado.devuelveNombreEmpleado("Antonio"));
//		
//		System.out.println("----------------------------------");
//		
//		System.out.println("Se han encontrado: "+String.valueOf(repEmpleado.findByNombreEmpleadoOrIdEmpleados("Antoni", 22).size())+" empleados.");
//		//int tamañoLista = repEmpleado.findByNombreEmpleadoOrIdEmpleados("Antonio", 22).size();
//		
//		
//		
//		if(repEmpleado.findByNombreEmpleadoOrIdEmpleados("Antonio", 22).size() > 0) {
//			
//			repEmpleado.findByNombreEmpleadoOrIdEmpleados("Antonio", 22).forEach(empleado -> {
//				System.out.println("Encontrado empleado: "+(++ee) + " " + empleado.getNombreEmpleado());
//			});
//		}else {
//			System.out.println("No se han encontrado empleados");
//		}
//		
//		if(repEmpleado.findBySearchTermJPQL("Antonio").size() >0) {
//			repEmpleado.findBySearchTermJPQL("Antonio").forEach(empleadoEncontrado -> {
//				System.out.println("Encontrado empleado con metodo searchTermJPQL: " + empleadoEncontrado.getIdEmpleados()
//					+ " nombre: " + empleadoEncontrado.getNombreEmpleado()
//					+ " empresa: " + empleadoEncontrado.getEmpresa2().getNombreEmpresa());
//			});
//		}else {
//			System.out.println("No se han encontrado encpleados con serachtTermnJPQL");
//		}
//		
//		if(repEmpleado.findBySearchTermSQL("Antonio").size() >0) {
//			repEmpleado.findBySearchTermSQL("Antonio").forEach(empleadoEncontrado -> {
//				System.out.println("Encontrado empleado con metodo searchTermSQL: " + empleadoEncontrado.getIdEmpleados()
//					+ " nombre: " + empleadoEncontrado.getNombreEmpleado()
//					+ " empresa: " + empleadoEncontrado.getEmpresa2().getNombreEmpresa());
//			});
//		}else {
//			System.out.println("No se han encontrado encpleados con serachtTermnJPQL");
//		}
//		
//		System.out.println("------------------------------------------------");
//		System.out.println("Empresa------------------ Consultas");
//		
//		//System.out.println("Buscando empresa por nombre en interfaz....."+repositorioEmpresa.findByNombreEmpresa("Amazon"));
//		//System.out.println("Nombre de empresa: "+repositorioEmpresa.devu);
//		
//		
//	}

}
