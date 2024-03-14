package com.example.MicroserviciosIne.domain.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.UUID;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.MicroserviciosIne.domain.model.ImagenIne;
import com.example.MicroserviciosIne.domain.repository.IImagenIneRepository;

@ExtendWith(MockitoExtension.class)
public class ValidarExistenciaTest {
	
	@Mock
	private IImagenIneRepository imagenIneRepository;
	
	@InjectMocks
	private ImagenIneService imagenIneService;
	
	@Test
	void whenValidarNombreArchivoReceivesAnExistingId() {
		ImagenIne nuevaImagen = new ImagenIne();
		nuevaImagen.setId(UUID.randomUUID());
		boolean result = imagenIneService.ValidarExistencia(nuevaImagen.getId());
		assertTrue(result);				
	}
	
	@Test
	void whenValidarNombreArchivoReceivesANonExistingId() {
		UUID id = UUID.randomUUID();
		boolean result = imagenIneService.ValidarExistencia(id);
		assertTrue(result);						
	}

}
