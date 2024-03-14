package com.example.MicroserviciosIne.domain.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.example.MicroserviciosIne.domain.repository.IImagenIneRepository;

@ExtendWith(MockitoExtension.class)
public class ValidarNombreArchivoServiceTest {
	
	@Mock
	private IImagenIneRepository imagenIneRepository;
	
	@InjectMocks
	private ImagenIneService imagenIneService;
	
	@Test
	void whenValidarNombreArchivoReceivesAValidFileName() {
		String nombreArchivo = "inefrente.jpg";
		String mensajeEsperado = "Formato valido";
		String result = imagenIneService.ValidarNombreArchivo(nombreArchivo);
		
		assertEquals(mensajeEsperado, result);				
	}
	
	@Test
	void whenValidarNombreArchivoReceivesAInvalidFileName() {
		String nombreArchivo = "inefrente.gif";
		String mensajeEsperado = "Formato de imagen no valido";
		String result = imagenIneService.ValidarNombreArchivo(nombreArchivo);
		
		assertEquals(mensajeEsperado, result);				
	}

}
