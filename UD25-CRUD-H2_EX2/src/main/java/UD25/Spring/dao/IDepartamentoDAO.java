package UD25.Spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import UD25.Spring.dto.Departamento;

public interface IDepartamentoDAO extends JpaRepository<Departamento, Long> {
	

}
