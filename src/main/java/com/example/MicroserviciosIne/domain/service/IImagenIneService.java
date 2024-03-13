package com.example.MicroserviciosIne.domain.service;

import com.example.MicroserviciosIne.domain.model.ImagenIne;

public interface IImagenIneService {
	
	public ImagenIne subirImagen (ImagenIne imagen);
	
	public boolean ValidarExistencia (Integer id);

}
