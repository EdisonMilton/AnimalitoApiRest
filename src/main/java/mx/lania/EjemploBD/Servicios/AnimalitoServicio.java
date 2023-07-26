/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.lania.EjemploBD.Servicios;

import java.util.List;
import java.util.Optional;
import mx.lania.EjemploBD.Entidades.Animalito;
import mx.lania.EjemploBD.Repositorios.AnimalitoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author UIEPA
 */
@Service  //Acciones a implementar
public class AnimalitoServicio {
    @Autowired
    AnimalitoRepositorio arepo;
    
    public boolean agregarAnimalito(Animalito a){
        boolean r = false;
        try{
            arepo.save(a);
            r = true;
        }catch(Exception e){
            System.out.print("No se guardo nada, error" + e.getCause());
        }
        return r;
    }
    
    public boolean actualizarAnimalito(Animalito a){
        boolean r = false;
        try{
            arepo.save(a);
            r = true;
        }catch(Exception e){
            System.out.print("No se actualizo nada, error" + e.getCause());
        }
        return r;
    }    
    
    public boolean eliminarAnimalito(Animalito a){
        boolean r = false;
        try{
            arepo.delete(a);
            r = true;
        }catch(Exception e){
            System.out.print("No se elimino nada, error" + e);
        }
        return r;
    }   
    
    public  List<Animalito> consultarAnimalito(){
        List<Animalito> lista = null;
        try{
            lista = arepo.findAll();
        }catch(Exception e){
            System.out.print("No se listo nada, error" + e);
        }
        return lista;
    }    
    
    
    public  Optional<Animalito> consultarUnAnimalito(String nombre){
        Optional<Animalito> lista = null;
        try{
            lista = arepo.findById(nombre);
        }catch(Exception e){
            System.out.print("No se listo nada, error" + e);
        }
        return lista;
    }      
}
