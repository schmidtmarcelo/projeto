package com.curso.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.dsvendas.Entitites.Sale;

public interface SaleRepository extends JpaRepository<Sale, Long>{

}
