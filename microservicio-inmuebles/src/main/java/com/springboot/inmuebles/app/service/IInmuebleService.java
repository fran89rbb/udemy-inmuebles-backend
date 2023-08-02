package com.springboot.inmuebles.app.service;

import java.util.List;

import com.springboot.inmuebles.app.entity.Inmueble;

public interface IInmuebleService {
	
	List<Inmueble> findAll();
	
	Inmueble save(Inmueble inmueble);
	
	void deleteById(Long id);

}
