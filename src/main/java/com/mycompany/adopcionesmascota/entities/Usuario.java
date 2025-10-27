/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adopcionesmascota.entities;

import com.mycompany.adopcionesmascota.DTO.MascotaDTO;
import com.mycompany.adopcionesmascota.DTO.SolicitudAdopcionDTO;
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

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nombre;
    private String correo;
    private String razones;
    @OneToMany(mappedBy = "usuario", cascade = CascadeType.ALL)
    private Set<Mascota> listaMascotas;
    private Long citaId;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "solicitudAdopcion_id", referencedColumnName = "id")
    private SolicitudAdopcion solicitudAdopcion;

    public Usuario() {
    }

    public Usuario(Long id, String nombre, String correo, String razones, Set<Mascota> listaMascotas, Long citaId, SolicitudAdopcion solicitudAdopcion) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.razones = razones;
        this.listaMascotas = listaMascotas;
        this.citaId = citaId;
        this.solicitudAdopcion = solicitudAdopcion;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Set<Mascota> getListaMascotas() {
        return listaMascotas;
    }

    public Long getCitaId() {
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

    public void setListaMascotas(Set<Mascota> listaMascotas) {
        this.listaMascotas = listaMascotas;
    }

    public void setCitaId(Long citaId) {
        this.citaId = citaId;
    }

    public void setSolicitudAdopcion(SolicitudAdopcion solicitudAdopcion) {
        this.solicitudAdopcion = solicitudAdopcion;
    }
    
    
}
