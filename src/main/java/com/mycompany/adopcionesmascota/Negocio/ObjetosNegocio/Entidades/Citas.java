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
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 *
 * @author Josel
 */
@Entity
public class Citas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private LocalDate dia;
    private LocalDateTime hora;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "mascota_id", referencedColumnName = "id")
    private Mascota mascota;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "usuario_id", referencedColumnName = "id")
    private Usuario usuario;

    public Citas() {
    }

    public Citas(Long id, LocalDate dia, LocalDateTime hora, Mascota mascota, Usuario usuario) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
        this.mascota = mascota;
        this.usuario = usuario;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Long getId() {
        return id;
    }

    public LocalDate getDia() {
        return dia;
    }

    public LocalDateTime getHora() {
        return hora;
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

    public void setDia(LocalDate dia) {
        this.dia = dia;
    }

    public void setHora(LocalDateTime hora) {
        this.hora = hora;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
}
