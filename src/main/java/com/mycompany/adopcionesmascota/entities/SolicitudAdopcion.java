/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adopcionesmascota.entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import java.io.Serializable;
import java.time.LocalDateTime;

/**
 *
 * @author Josel
 */
@Entity
public class SolicitudAdopcion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario idUsuario;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mascota_id", referencedColumnName = "id")
    private Mascota idMascota;
    private LocalDateTime fechaSolicitud;
    private String estado;

    public SolicitudAdopcion() {
    }

    public SolicitudAdopcion(Long id, Usuario idUsuario, Mascota idMascota, LocalDateTime fechaSolicitud, String estado) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idMascota = idMascota;
        this.fechaSolicitud = fechaSolicitud;
        this.estado = estado;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setIdMascota(Mascota idMascota) {
        this.idMascota = idMascota;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public Mascota getIdMascota() {
        return idMascota;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public String getEstado() {
        return estado;
    }
    
}
