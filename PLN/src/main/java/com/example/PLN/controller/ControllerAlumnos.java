/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.PLN.controller;

import com.example.PLN.entity.Alumnos;
import com.example.PLN.service.ServiceAlumno;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Calde
 */
@RestController
@RequestMapping("/alumnos")
public class ControllerAlumnos {
    @Autowired
    private ServiceAlumno alumnosService;
    
    @GetMapping("/listarAlumnos")
    public ResponseEntity<List<Alumnos>> getAllAlumnos(){
        try{
            List<Alumnos> alumnos = alumnosService.ListAllAlumnos();
            return new ResponseEntity<>(alumnos, HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
                    
        }
        
    }
    
    @PostMapping("/guardarAlumnos")
    public ResponseEntity<Alumnos> createUsuario(@RequestBody Alumnos alumnos){
        try{
            Alumnos res = alumnosService.saveAlumnos(alumnos);
            return new ResponseEntity<>(res, HttpStatus.CREATED);
        }catch (Exception e){
            return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
                    
        }
        
    }
    
}
