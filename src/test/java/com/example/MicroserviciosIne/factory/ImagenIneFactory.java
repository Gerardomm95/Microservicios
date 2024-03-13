package com.example.MicroserviciosIne.factory;

import java.util.UUID;

import com.example.MicroserviciosIne.domain.model.ImagenIne;

public class ImagenIneFactory {

	public static ImagenIne createImagenIneWithDefaults() {
		ImagenIne imagenIne = new ImagenIne();
		imagenIne.setId(UUID.randomUUID());
		imagenIne.setFrente("defaultFrenteData".getBytes());
		imagenIne.setReverso("defaultReversoData".getBytes());
		imagenIne.setSelfi("defaultSelfiData".getBytes());
		imagenIne.setFechaSubida("2024-03-13");
		return imagenIne;
	}

}
