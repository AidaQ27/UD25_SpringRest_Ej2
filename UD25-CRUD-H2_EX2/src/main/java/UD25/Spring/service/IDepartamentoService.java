package UD25.Spring.service;

import java.util.List;

import UD25.Spring.dto.Departamento;

public interface IDepartamentoService {
	
	//CRUD
	
	//Mostrar departament
	public List<Departamento> listarDepartamento();
	
	// Guardar departament
	public Departamento guardarDepartamento(Departamento departamento);
	
	//Mostra departament
	public Departamento departamentoID(Long codigo);
	
	//Actulitza departament
	public Departamento actualitzarDepartamentos(Departamento departamento);
	
	//Eliminar registre departament
	public void eliminarDepartamento(Long codigo); 
	
	

}
