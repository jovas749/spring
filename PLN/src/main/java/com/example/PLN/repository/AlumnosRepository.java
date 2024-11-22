/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.PLN.repository;

import com.example.PLN.entity.Alumnos;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Calde
 */
@Repository
public interface AlumnosRepository extends JpaRepository<Alumnos, Integer>{
    
    @Query(value = "SELECT * FROM alumnos;", nativeQuery = true)
    List<Alumnos> findAllAlumnos();
    
}
