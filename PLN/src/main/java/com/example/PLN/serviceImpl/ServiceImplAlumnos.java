/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PLN.serviceImpl;

import com.example.PLN.entity.Alumnos;
import com.example.PLN.repository.AlumnosRepository;
import com.example.PLN.service.ServiceAlumno;
import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Calde
 */
@Service
@Transactional
public class ServiceImplAlumnos implements ServiceAlumno{
    
    @Autowired
    private AlumnosRepository alumnosRepository;
    
    @Override
    public List<Alumnos> ListAllAlumnos() {
        return alumnosRepository.findAllAlumnos();
                
    }

    @Override
    public Alumnos saveAlumnos(Alumnos alumnos) {
        Alumnos a = new Alumnos();
        a.setNombre(alumnos.getNombre());
        a.setApellido_paterno(alumnos.getApellido_paterno());
        a.setApellido_materno(alumnos.getApellido_materno());
        a.setEdad(alumnos.getEdad());
        a.setGenero(alumnos.getGenero());
        return alumnosRepository.save(a);
    }
    
}
