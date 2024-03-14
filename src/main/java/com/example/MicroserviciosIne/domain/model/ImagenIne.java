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
	
	public ImagenIne(UUID id, byte[] frente, byte[] reverso, byte[] selfi, String fechaSubida) {
		this.id = id;
		this.frente = frente;
		this.reverso = reverso;
		this.selfi = selfi;
		this.fechaSubida = fechaSubida;
	}

	public ImagenIne() {
		// TODO Auto-generated constructor stub
	}

	public UUID getId() {
		return id;
	}
	public UUID getId(UUID id) {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public byte[] getFrente() {
		return frente;
	}

	public void setFrente(byte[] frente) {
		this.frente = frente;
	}

	public byte[] getReverso() {
		return reverso;
	}

	public void setReverso(byte[] reverso) {
		this.reverso = reverso;
	}

	public byte[] getSelfi() {
		return selfi;
	}

	public void setSelfi(byte[] selfi) {
		this.selfi = selfi;
	}

	public String getFechaSubida() {
		return fechaSubida;
	}

	public void setFechaSubida(String fechaSubida) {
		this.fechaSubida = fechaSubida;
	}

	
}
