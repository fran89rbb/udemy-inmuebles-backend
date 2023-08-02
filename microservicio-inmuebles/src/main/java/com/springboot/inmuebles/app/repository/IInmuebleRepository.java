package com.springboot.inmuebles.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.inmuebles.app.entity.Inmueble;

public interface IInmuebleRepository extends JpaRepository<Inmueble, Long>{

}
