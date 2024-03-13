package com.example.MicroserviciosIne.domain.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.example.MicroserviciosIne.domain.model.ImagenIne;
import com.example.MicroserviciosIne.domain.repository.IImagenIneRepository;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Service
@RequiredArgsConstructor
@Slf4j
public class ImagenIneService implements IImagenIneService {
	
	private final IImagenIneRepository imagenIneRepository;
	
	public ImagenIne subirImagen(ImagenIne imagen) {
		
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String fecha = LocalDate.now().format(formatter);
		try {
			ImagenIne nuevaImagen = new ImagenIne(UUID.randomUUID(),imagen.getFrente(),imagen.getReverso(),imagen.getSelfi(),fecha);
			imagen = imagenIneRepository.guardar(nuevaImagen);
			if(imagen.getId() != null) {
				return imagen;
			}
		} catch (Exception e) {

			log.error("Error al subir archivos");
		}
		return new ImagenIne();
		

	}

	@Override
	public boolean ValidarExistencia(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
