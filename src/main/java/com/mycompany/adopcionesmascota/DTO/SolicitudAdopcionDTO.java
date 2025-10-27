/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adopcionesmascota.DTO;

import com.mycompany.adopcionesmascota.entities.*;
import java.time.LocalDateTime;
import java.util.Objects;

/**
 *
 * @author angel
 */
public class SolicitudAdopcionDTO {
    private Long id;
    private Usuario idUsuario;
    private Mascota idMascota;
    private LocalDateTime fechaSolicitud;
    private String estado;

    public SolicitudAdopcionDTO(Long id, Usuario idUsuario, Mascota idMascota, LocalDateTime fechaSolicitud, String estado) {
        this.id = id;
        this.idUsuario = idUsuario;
        this.idMascota = idMascota;
        this.fechaSolicitud = fechaSolicitud;
        this.estado = estado;
    }

    public SolicitudAdopcionDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Mascota getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(Mascota idMascota) {
        this.idMascota = idMascota;
    }

    public LocalDateTime getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDateTime fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 29 * hash + Objects.hashCode(this.id);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final SolicitudAdopcionDTO other = (SolicitudAdopcionDTO) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "SolicitudAdopcionDTO{" + "id=" + id + ", idUsuario=" + idUsuario + ", idMascota=" + idMascota + ", fechaSolicitud=" + fechaSolicitud + ", estado=" + estado + '}';
    }
    
}
