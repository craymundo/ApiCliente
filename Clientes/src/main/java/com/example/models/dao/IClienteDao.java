package com.example.models.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.models.entity.Cliente;

public interface IClienteDao extends JpaRepository<Cliente, Long> {
	
			
	@Query(value = "SELECT AVG(edad) as promedio FROM cliente", nativeQuery = true)
	double promedio();
	
	@Query(value = "SELECT STD(edad) FROM cliente", nativeQuery = true)
    double desviacion();

}
