/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.lania.EjemploBD.Controladores;

import java.util.List;
import java.util.Optional;
import mx.lania.EjemploBD.Entidades.Animalito;
import mx.lania.EjemploBD.Servicios.AnimalitoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author UIEPA
 */
@RestController
@RequestMapping("/animalito")

public class Controlador {
    @Autowired
    AnimalitoServicio aservicio;
    
    @GetMapping
    public List<Animalito> obtenerAnimalitos(){
        return aservicio.consultarAnimalito();
    }

    @GetMapping("/id")
    public Optional<Animalito> obtenerUnAnimalito(String nombre){
        return aservicio.consultarUnAnimalito(nombre);
    }
    
    @PostMapping
    public String insertarAnimalito(@RequestBody Animalito a){
        //Reglas de negocio
        String r;
        if(aservicio.agregarAnimalito(a)){
            r = "Todo se guardo bien";
        }else{
            r = "No se guardo nada";
        }
        return r;
    }
    
    @PutMapping
    public String actualizarAnimalito(@RequestBody Animalito a){
        //Reglas de negocio
        String r;
        if(aservicio.actualizarAnimalito(a)){
            r = "Se Actualizó bien";
        }else{
            r = "No se Actualizó nada";
        }
        return r;
    }  
    
    @DeleteMapping
    public String eliminarAnimalito(@RequestBody Animalito a){
        //Reglas de negocio
        String r;
        if(aservicio.eliminarAnimalito(a)){
            r = "Se elimino bien";
        }else{
            r = "No se elimino nada";
        }
        return r;
    }     
    
}
