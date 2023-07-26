/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package mx.lania.EjemploBD.Repositorios;

import mx.lania.EjemploBD.Entidades.Animalito;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author UIEPA
 */

@Repository
public interface AnimalitoRepositorio extends JpaRepository <Animalito, String>{
    //ESTO ES UNA INTERFAZ
    
}
