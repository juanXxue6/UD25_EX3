package com.UD25_spring.ex3.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.UD25_spring.ex3.dto.Almacenes;

public interface IAlmacenDao extends JpaRepository<Almacenes, Long> {

}
