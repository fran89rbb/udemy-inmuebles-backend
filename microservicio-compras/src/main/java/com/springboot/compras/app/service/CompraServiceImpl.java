package com.springboot.compras.app.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.compras.app.entity.Compra;
import com.springboot.compras.app.repository.ICompraRepository;

@Service
public class CompraServiceImpl implements ICompraService{
	
	@Autowired
	private ICompraRepository compraRepository;

	@Override
	public Compra saveCompra(Compra compra) {
		compra.setFechaCompra(LocalDateTime.now());
		return compraRepository.save(compra);
	}

	@Override
	public List<Compra> findAllComprasOfUser(Long userId) {
		return compraRepository.findAllByUserId(userId);
	}
	
	

}
