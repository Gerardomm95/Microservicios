package com.example.MicroserviciosIne.domain.service;

import java.util.UUID;

import com.example.MicroserviciosIne.domain.model.ImagenIne;

public interface IImagenIneService {
	
	public ImagenIne subirImagen (ImagenIne imagen);
	
	public boolean ValidarExistencia (UUID id);
	
	public String ValidarNombreArchivo (String nombre);

}
