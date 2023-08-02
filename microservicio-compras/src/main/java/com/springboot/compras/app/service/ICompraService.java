package com.springboot.compras.app.service;

import java.util.List;

import com.springboot.compras.app.entity.Compra;

public interface ICompraService {
	
	Compra saveCompra(Compra compra);
	
	List<Compra> findAllComprasOfUser(Long userId);

}
