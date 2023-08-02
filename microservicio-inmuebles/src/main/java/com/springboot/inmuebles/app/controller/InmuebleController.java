package com.springboot.inmuebles.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.inmuebles.app.entity.Inmueble;
import com.springboot.inmuebles.app.service.IInmuebleService;

@RestController
@RequestMapping("api/inmueble")
public class InmuebleController {
	
	@Autowired
	private IInmuebleService inmuebleService;
	
	@GetMapping
	public ResponseEntity<?> findAll(){
		return ResponseEntity.ok(inmuebleService.findAll()); 
	}
	
	@PostMapping()
	public ResponseEntity<?> saveInmueble(@RequestBody Inmueble inmueble) {
		return new ResponseEntity<>(inmuebleService.save(inmueble), HttpStatus.CREATED);
	}
	
	@DeleteMapping("{id}")
	public ResponseEntity<?> deleteInmueble(@PathVariable Long id) {
		inmuebleService.deleteById(id);
		
		return new ResponseEntity<>(HttpStatus.OK);
	}

}
