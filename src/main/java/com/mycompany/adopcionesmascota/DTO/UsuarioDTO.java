/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adopcionesmascota.DTO;

import java.util.Objects;
import java.util.Set;

/**
 *
 * @author angel
 */
public class UsuarioDTO {

    private Long id;
    private String nombre;
    private String correo;
    private String contraseña;
    private String razones;
    private String identificador;
    private Long citaId;
    private SolicitudAdopcionDTO solicitudAdopcionId;

   

    public UsuarioDTO() {
    }

    public UsuarioDTO(Long id, String nombre, String correo, String contraseña, String razones, String identificador, Long citaId, SolicitudAdopcionDTO solicitudAdopcionId) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contraseña = contraseña;
        this.razones = razones;
        this.identificador = identificador;
        this.citaId = citaId;
        this.solicitudAdopcionId = solicitudAdopcionId;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getRazones() {
        return razones;
    }

    public void setRazones(String razones) {
        this.razones = razones;
    }

    public Long getCitaId() {
        return citaId;
    }

    public void setCitaId(Long citaId) {
        this.citaId = citaId;
    }

    public SolicitudAdopcionDTO getSolicitudAdopcionId() {
        return solicitudAdopcionId;
    }

    public void setSolicitudAdopcionId(SolicitudAdopcionDTO solicitudAdopcionId) {
        this.solicitudAdopcionId = solicitudAdopcionId;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + Objects.hashCode(this.id);
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
        final UsuarioDTO other = (UsuarioDTO) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "UsuarioDTO{" + "id=" + id + ", nombre=" + nombre + ", correo=" + correo + ", razones=" + razones + ", citaId=" + citaId + ", solicitudAdopcionId=" + solicitudAdopcionId + '}';
    }
}
