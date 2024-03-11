package com.example.MicroserviciosIne.service;

import java.io.IOException;
import java.text.SimpleDateFormat;
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
		
		String format = "dd-MM-yyyy";
		SimpleDateFormat dateFormat = new SimpleDateFormat(format);
		String fecha = dateFormat.format(LocalDate.now());
		try {
			ImagenIne imagen = new ImagenIne(frente.getBytes(),reverso.getBytes(),selfi.getBytes(),fecha);
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
