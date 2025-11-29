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
import java.time.LocalDateTime;

/**
 *
 * @author Josel
 */
@Entity
public class Cita implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDateTime fechaHora;
    private SolicitudAdopcion solicitud;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mascota_id", referencedColumnName = "id")
    private Mascota mascota;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    public Cita() {
    }

    public Cita(Long id, LocalDateTime fechaHora, SolicitudAdopcion solicitud, Mascota mascota, Usuario usuario) {
        this.id = id;
        this.fechaHora = fechaHora;
        this.solicitud = solicitud;
        this.mascota = mascota;
        this.usuario = usuario;
    }

   

    public Long getId() {
        return id;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public SolicitudAdopcion getSolicitud() {
        return solicitud;
    }

    public Mascota getMascota() {
        return mascota;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setSolicitud(SolicitudAdopcion solicitud) {
        this.solicitud = solicitud;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

}
