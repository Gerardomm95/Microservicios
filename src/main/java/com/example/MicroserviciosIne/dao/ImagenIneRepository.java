package com.example.MicroserviciosIne.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.MicroserviciosIne.entity.ImagenIne;

@Repository
public interface ImagenIneRepository extends JpaRepository <ImagenIne, String>{

}
