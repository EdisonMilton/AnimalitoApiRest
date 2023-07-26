/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.lania.EjemploBD.Entidades;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author UIEPA
 */
@Entity
@Table (name = "animalitos")
public class Animalito {
    @Id
    String nombre;
    int patas;
    String especie;
    
    public Animalito() {
    }


    public String getNombre() {
        return nombre;
    }

    public int getPatas() {
        return patas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }
    
    
}
