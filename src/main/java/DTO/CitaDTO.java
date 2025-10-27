/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.time.LocalDateTime;

/**
 *
 * @author Josel
 */
public class CitaDTO {
    public Long id;
    public LocalDateTime fechaHora;
    public SolicitudAdopcionDTO solicitud;
    public MascotaDTO mascota;
    public UsuarioDTO usuario;

    public CitaDTO() {
    }

    public CitaDTO(Long id, LocalDateTime fechaHora, SolicitudAdopcionDTO solicitud, MascotaDTO mascota, UsuarioDTO usuario) {
        this.id=id;
        this.fechaHora = fechaHora;
        this.solicitud = solicitud;
        this.mascota = mascota;
        this.usuario = usuario;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public SolicitudAdopcionDTO getSolicitud() {
        return solicitud;
    }

    public MascotaDTO getMascota() {
        return mascota;
    }

    public UsuarioDTO getUsuario() {
        return usuario;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public void setSolicitud(SolicitudAdopcionDTO solicitud) {
        this.solicitud = solicitud;
    }

    public void setMascota(MascotaDTO mascota) {
        this.mascota = mascota;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CitaDTO{" + "fechaHora=" + fechaHora + ", solicitud=" + solicitud + ", mascota=" + mascota + ", usuario=" + usuario + '}';
    }

}
