/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adopcionesmascota.DTO;

import java.time.*;

/**
 *
 * @author Josel
 */
public class CitasDTO {

    private Long id;
    private LocalDate dia;
    private LocalDateTime hora;
    private MascotaDTO mascota;
    private UsuarioDTO usuario;

    public CitasDTO() {
    }

    public CitasDTO(Long id, LocalDate dia, LocalDateTime hora, MascotaDTO mascota, UsuarioDTO usuario) {
        this.id = id;
        this.dia = dia;
        this.hora = hora;
        this.mascota = mascota;
        this.usuario = usuario;
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

    public MascotaDTO getMascota() {
        return mascota;
    }

    public UsuarioDTO getUsuario() {
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

    public void setMascota(MascotaDTO mascota) {
        this.mascota = mascota;
    }

    public void setUsuario(UsuarioDTO usuario) {
        this.usuario = usuario;
    }

    @Override
    public String toString() {
        return "CitasDTO{" + "id=" + id + ", dia=" + dia + ", hora=" + hora + ", mascota=" + mascota + ", usuario=" + usuario + '}';
    }
    
}
