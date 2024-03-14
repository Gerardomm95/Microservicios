package com.example.MicroserviciosIne.infrastructure.repository;

import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Repository;

import com.example.MicroserviciosIne.domain.model.ImagenIne;
import com.example.MicroserviciosIne.domain.repository.IImagenIneRepository;

@Repository
public class ImagenIneRepository implements IImagenIneRepository {

	@Override
	public ImagenIne guardar(ImagenIne imagenIne) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean buscarPorIdUsuario(UUID uuid) {
		// TODO Auto-generated method stub
		return Optional.empty() != null;
	}

}
