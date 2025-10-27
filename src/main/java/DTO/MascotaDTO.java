/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import java.util.Objects;

/**
 *
 * @author angel
 */
public class MascotaDTO {
    private Long id;
    private String nombre;
    private String estadoSalud;
    private String especie;
    private String personalidad;
    private String fichaMedica;
    private String urlImagen;
    private int edad;
    private boolean disponible;

    public MascotaDTO(Long id, String nombre, String estadoSalud, String especie, String personalidad, String fichaMedica, String urlImagen, int edad, boolean disponible) {
        this.id = id;
        this.nombre = nombre;
        this.estadoSalud = estadoSalud;
        this.especie = especie;
        this.personalidad = personalidad;
        this.fichaMedica = fichaMedica;
        this.urlImagen = urlImagen;
        this.edad = edad;
        this.disponible = disponible;
    }

    public MascotaDTO() {
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

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getPersonalidad() {
        return personalidad;
    }

    public void setPersonalidad(String personalidad) {
        this.personalidad = personalidad;
    }

    public String getFichaMedica() {
        return fichaMedica;
    }

    public void setFichaMedica(String fichaMedica) {
        this.fichaMedica = fichaMedica;
    }

    public String getUrlImagen() {
        return urlImagen;
    }

    public void setUrlImagen(String urlImagen) {
        this.urlImagen = urlImagen;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 89 * hash + Objects.hashCode(this.id);
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
        final MascotaDTO other = (MascotaDTO) obj;
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString() {
        return "MascotaDTO{" + "id=" + id + ", nombre=" + nombre + ", estadoSalud=" + estadoSalud + ", especie=" + especie + ", personalidad=" + personalidad + ", fichaMedica=" + fichaMedica + ", urlImagen=" + urlImagen + ", edad=" + edad + ", disponible=" + disponible + '}';
    }

}
