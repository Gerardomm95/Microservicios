package com.example.MicroserviciosIne.domain.repository;

import java.util.Optional;
import java.util.UUID;

import com.example.MicroserviciosIne.domain.model.ImagenIne;

public interface IImagenIneRepository {
	
	/**
	 * Metodo para guardar imagen
	 * @param imagenIne imagen
	 * @return imagen
	 */
	ImagenIne guardar(ImagenIne imagenIne);
	
	/**
	 * Metodo para buscar documento por id
	 * @param uuid id
	 * @return imagen
	 */
	Optional<ImagenIne> buscarPorIdUsuario(UUID uuid);

}
