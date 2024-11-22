/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.PLN.service;

import com.example.PLN.entity.Alumnos;
import java.util.List;

/**
 *
 * @author Calde
 */
public interface ServiceAlumno {
    //SERVICIO PARA LISTAR A TODOS LOS ALUMNOS
    public List<Alumnos> ListAllAlumnos();
    //SERVICIO PARA GUARDAR ALUMNOS
    public Alumnos saveAlumnos(Alumnos alumnos);
    
    
}
