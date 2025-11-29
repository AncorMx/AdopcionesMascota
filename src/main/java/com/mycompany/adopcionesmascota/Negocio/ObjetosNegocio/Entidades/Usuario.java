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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.util.Set;

/**
 *
 * @author Josel
 */
@Entity
public class Usuario implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String correo;
    private String razones;
    private String contraseña;
    private String identificador;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "cita_id", referencedColumnName = "id")
    private Cita citaId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "solicitudAdopcion_id", referencedColumnName = "id")
    private SolicitudAdopcion solicitudAdopcion;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String correo, String razones, String contraseña, String identificador, Cita citaId, SolicitudAdopcion solicitudAdopcion) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.razones = razones;
        this.contraseña = contraseña;
        this.identificador = identificador;
        this.citaId = citaId;
        this.solicitudAdopcion = solicitudAdopcion;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCorreo() {
        return correo;
    }

    public String getRazones() {
        return razones;
    }

    public Cita getCitaId() {
        return citaId;
    }

    public SolicitudAdopcion getSolicitudAdopcion() {
        return solicitudAdopcion;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setRazones(String razones) {
        this.razones = razones;
    }

    public void setCitaId(Cita citaId) {
        this.citaId = citaId;
    }

    public void setSolicitudAdopcion(SolicitudAdopcion solicitudAdopcion) {
        this.solicitudAdopcion = solicitudAdopcion;
    }

}
