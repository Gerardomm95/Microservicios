package com.example.MicroserviciosIne.domain.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ImagenIne {
	
	private UUID id;
	
	private byte[] frente;
	
	private byte[] reverso;
	
	private byte[] selfi;
	
	private String fechaSubida;

	
}
