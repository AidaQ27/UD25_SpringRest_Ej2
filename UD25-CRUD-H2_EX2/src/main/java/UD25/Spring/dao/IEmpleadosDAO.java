package UD25.Spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import UD25.Spring.dto.Empleado;

public interface IEmpleadosDAO extends JpaRepository<Empleado, String>{

}
