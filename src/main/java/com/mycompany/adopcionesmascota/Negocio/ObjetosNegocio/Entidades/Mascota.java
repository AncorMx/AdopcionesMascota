/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adopcionesmascota.Negocio.ObjetosNegocio.Entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.io.Serializable;

/**
 *
 * @author Josel
 */
@Entity
public class Mascota implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String estadoSalud;
    private String especie;
    private String personalidad;
    private String fichaMedica;
    private String urlImagen;
    private int edad;
    private boolean disponible;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cita_id", referencedColumnName = "id")
    private Cita cita;

    public Mascota() {
    }

    public Mascota(Long id, String nombre, String estadoSalud, String especie, String personalidad, String fichaMedica, String urlImagen, int edad, boolean disponible, Cita cita) {
        this.id = id;
        this.nombre = nombre;
        this.estadoSalud = estadoSalud;
        this.especie = especie;
        this.personalidad = personalidad;
        this.fichaMedica = fichaMedica;
        this.urlImagen = urlImagen;
        this.edad = edad;
        this.disponible = disponible;
        this.cita = cita;
    }

  

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public String getEspecie() {
        return especie;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public String getFichaMedica() {
        return fichaMedica;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public Cita getCita() {
        return cita;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public void setFichaMedica(String fichaMedica) {
        this.fichaMedica = fichaMedica;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public void setCita(Cita cita) {
        this.cita = cita;
    }
    
    
}
