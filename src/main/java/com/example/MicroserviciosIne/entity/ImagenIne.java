package com.example.MicroserviciosIne.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "imagenIne")
@Builder
public class ImagenIne {
	
	@Id
	private String id;
	
	@Lob
	private byte[] frente;
	
	@Lob
	private byte[] reverso;
	
	@Lob
	private byte[] selfi;
	
	private LocalDate fechaSubida;
	
	public ImagenIne(String id, byte[] frente, byte[] reverso, byte[] selfi, LocalDate fechaSubida) {
		this.id = id;
		this.frente = frente;
		this.reverso = reverso;
		this.selfi = selfi;
		this.fechaSubida = fechaSubida;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
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

	public LocalDate getFechaSubida() {
		return fechaSubida;
	}

	public void setFechaSubida(LocalDate fechaSubida) {
		this.fechaSubida = fechaSubida;
	}

	
}
