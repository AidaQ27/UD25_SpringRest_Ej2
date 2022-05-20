package UD25.Spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import UD25.Spring.dao.IDepartamentoDAO;
import UD25.Spring.dto.Departamento;

@Service
public class DepartamentoServiceImpl implements IDepartamentoService{
	
	@Autowired
	IDepartamentoDAO iDepartamentoDAO;
	
	@Override
	public List<Departamento> listarDepartamento() {
		
		return iDepartamentoDAO.findAll();
	}
	
	@Override
	public Departamento guardarDepartamento(Departamento departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}
	
	@Override
	public Departamento departamentoID(Long codigo) {
		
		return iDepartamentoDAO.findById(codigo).get();
		
	}
	
	@Override
	public Departamento actualitzarDepartamentos(Departamento departamento) {
		
		return iDepartamentoDAO.save(departamento);
	}
	

	@Override
	public void eliminarDepartamento(Long codigo) {
		
		iDepartamentoDAO.deleteById(codigo);
	}
}
