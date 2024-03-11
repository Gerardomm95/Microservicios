package com.example.MicroserviciosIne.service;

import org.springframework.web.multipart.MultipartFile;

public interface IImagenIneService {
	
	public String SubirImagen (MultipartFile frente, MultipartFile reverso, MultipartFile selfi);
	
	public boolean ValidarExistencia (Integer id);

}
