/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.adopcionesmascota.Negocio.ObjetosNegocio.AdopcionesDTO;

import java.util.Objects;

/**
 *
 * @author angel
 */
public class SolicitudAdopcionDTO {
    private Long id;
    private String infoVivienda;
    private String razonesAntecedentes;

    public SolicitudAdopcionDTO(Long id, String infoVivienda, String razonesAntecedentes) {
        this.id = id;
        this.infoVivienda = infoVivienda;
        this.razonesAntecedentes = razonesAntecedentes;
    }

    public SolicitudAdopcionDTO() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getInfoVivienda() {
        return infoVivienda;
    }

    public void setInfoVivienda(String infoVivienda) {
        this.infoVivienda = infoVivienda;
    }

    public String getRazonesAntecedentes() {
        return razonesAntecedentes;
    }

    public void setRazonesAntecedentes(String razonesAntecedentes) {
        this.razonesAntecedentes = razonesAntecedentes;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
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
        return "SolicitudAdopcionDTO{" + "id=" + id + ", infoVivienda=" + infoVivienda + ", razonesAntecedentes=" + razonesAntecedentes + '}';
    }
}
