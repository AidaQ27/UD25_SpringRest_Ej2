package UD25.Spring.service;

import java.util.List;

import UD25.Spring.dto.Empleado;

public interface IEmpleadoService {
	
	//CRUD
	
		//Mostrar empleado
		public List<Empleado> listarEmpleado();
		
		public Empleado guardarEmpleado (Empleado empleado);
		
		//Mostra departament
		public Empleado empleadoID(String dni);
		
		//Actulitza departament
		public Empleado actualitzarEmpleados(Empleado empleado);
		
		//Eliminar registre departament
		public void eliminarEmpleado(String dni); 
		
		

}
