package com.springboot.compras.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.compras.app.entity.Compra;

public interface ICompraRepository extends JpaRepository<Compra, Long>{
	
	List<Compra> findAllByUserId(Long userId);

}
