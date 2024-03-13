package com.example.MicroserviciosIne.domain.service;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static com.example.MicroserviciosIne.factory.ImagenIneFactory.createImagenIneWithDefaults;

import com.example.MicroserviciosIne.domain.model.ImagenIne;
import com.example.MicroserviciosIne.domain.repository.IImagenIneRepository;

@ExtendWith(MockitoExtension.class)
class ImagenIneServiceTest {
	
	@Mock
	private IImagenIneRepository imagenIneRepository;
	
	@InjectMocks
	private ImagenIneService imagenIneService;
	
	private ImagenIne defaultImagenIne;
	
	@BeforeEach
	void setUp() {
		defaultImagenIne = createImagenIneWithDefaults();
	}
	
	@Test
	void givenValidImageDataWhenUploadImageThenImageIsSavedSuccessfully() {
		when(imagenIneRepository.guardar(any())).thenReturn(defaultImagenIne);
		ImagenIne subirImagen = imagenIneService.subirImagen(defaultImagenIne);
		assertNotNull(subirImagen);
	}

}
