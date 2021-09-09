package com.curso.dsvendas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.curso.dsvendas.Entitites.Seller;

public interface SellerRepository extends JpaRepository<Seller, Long>{

}
