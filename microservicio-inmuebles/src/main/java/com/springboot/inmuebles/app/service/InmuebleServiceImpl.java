package com.springboot.inmuebles.app.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.inmuebles.app.entity.Inmueble;
import com.springboot.inmuebles.app.repository.IInmuebleRepository;

@Service
public class InmuebleServiceImpl implements IInmuebleService{
	
	@Autowired
	private IInmuebleRepository inmuebleRepository;

	@Override
	public List<Inmueble> findAll() {
		return inmuebleRepository.findAll();
	}

	@Override
	public Inmueble save(Inmueble inmueble) {
		inmueble.setFechaCreacion(LocalDateTime.now());
		return inmuebleRepository.save(inmueble);
	}

	@Override
	public void deleteById(Long id) {
		inmuebleRepository.deleteById(id);
	}

}
