package UD25.Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import UD25.Spring.dao.IEmpleadosDAO;
import UD25.Spring.dto.Empleado;

@Service
public class EmpleadoServiceImpl implements IEmpleadoService{
	
	@Autowired
	IEmpleadosDAO iEmpleadoDAO;
	
	@Override
	public List<Empleado> listarEmpleado(){
		
		return iEmpleadoDAO.findAll();
		
	}
	
	@Override
	public Empleado guardarEmpleado(Empleado empleado) {
		return iEmpleadoDAO.save(empleado);
	}
	
	@Override
	public Empleado empleadoID(String dni) {
		
		return iEmpleadoDAO.findById(dni).get();
	}
	
	@Override
	public Empleado actualitzarEmpleados(Empleado empleado) {
		
		return iEmpleadoDAO.save(empleado);
	}
	
	@Override
	public void eliminarEmpleado(String dni) {
		
		iEmpleadoDAO.deleteById(dni);
	}
	
	

}
