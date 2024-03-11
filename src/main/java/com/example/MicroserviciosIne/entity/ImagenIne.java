package com.example.MicroserviciosIne.entity;

import java.util.UUID;

import org.hibernate.annotations.UuidGenerator;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "imagenIne")
public class ImagenIne {
	
	@Id
	@UuidGenerator	
	private UUID id;
	
	@Lob
	private byte[] frente;
	
	@Lob
	private byte[] reverso;
	
	@Lob
	private byte[] selfi;
	
	private String fechaSubida;
	
	public ImagenIne(byte[] frente, byte[] reverso, byte[] selfi, String fechaSubida) {
		this.frente = frente;
		this.reverso = reverso;
		this.selfi = selfi;
		this.fechaSubida = fechaSubida;
	}

	public UUID getId() {
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
