package UD25.Spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import UD25.Spring.dto.Departamento;
import UD25.Spring.service.DepartamentoServiceImpl;

@RestController
@RequestMapping("/api")
public class DepartamentoController {
	
	@Autowired
	DepartamentoServiceImpl deptServiceImpl;
	
	@GetMapping("/departamento")
	public List<Departamento> listarDepartamento(){
		
		return deptServiceImpl.listarDepartamento();
	}
	
	@PostMapping("/departamento")
	public Departamento guardarDepartamento(@RequestBody Departamento departamento) {
		
		return deptServiceImpl.guardarDepartamento(departamento);
	}
	
	@GetMapping("/departamento/{codigo}")
	public Departamento departamentoID(@PathVariable(name="codigo") Long codigo) {
		
		Departamento departamentoID = new Departamento();
		
		departamentoID = deptServiceImpl.departamentoID(codigo);
		
		System.out.println("Codigo departamento: " + departamentoID);
		
		return departamentoID;
		
		
		
	}
	
	@PutMapping("/departamento/{codigo}")
	public Departamento actualitzarDepartamento(@PathVariable(name="codigo")Long codigo,@RequestBody Departamento departamento) {
		
		Departamento departamento_seleccionado = new Departamento();
		Departamento departamento_actualizado = new Departamento();
		
		departamento_seleccionado = deptServiceImpl.departamentoID(codigo);
		
		departamento_seleccionado.setNombre(departamento.getNombre());
		departamento_seleccionado.setPresupuesto(departamento.getPresupuesto());
		
		
		departamento_actualizado = deptServiceImpl.actualitzarDepartamentos(departamento_seleccionado);
		
		System.out.println("El dept actualizado es: "+ departamento_actualizado);
		
		return departamento_actualizado;
	}

	@DeleteMapping("/departamento/{codigo}")
	public void eliminarDepartamento(@PathVariable(name="codigo")Long codigo) {
		deptServiceImpl.eliminarDepartamento(codigo);
	}
}
