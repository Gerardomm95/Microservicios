package com.example.MicroserviciosIne.service;

import java.io.IOException;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.example.MicroserviciosIne.dao.ImagenIneRepository;
import com.example.MicroserviciosIne.entity.ImagenIne;

@Service
public class ImagenIneService implements IImagenIneService {

	@Autowired
	private ImagenIneRepository imagenIneRepository;
	
	public String SubirImagen(MultipartFile frente, MultipartFile reverso, MultipartFile selfi) {
		
		try {
			ImagenIne imagen = new ImagenIne("12",frente.getBytes(),reverso.getBytes(),selfi.getBytes(),LocalDate.now());
			imagen = imagenIneRepository.save(imagen);
			if(imagen.getId() != null) {
				return "Archivos subidos exitosamente";
			}
		} catch (IOException e) {

			return "Error al subir archivos";
		}
		return "";
		

	}

	@Override
	public boolean ValidarExistencia(Integer id) {
		// TODO Auto-generated method stub
		return false;
	}

}
