/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Control;

import javax.swing.JFrame;

/**
 *
 * @author Josel
 */
public class ControlDiseño {
     private JFrame pantalla;

    public ControlDiseño(JFrame pantalla) {
        this.pantalla = pantalla;
    }

    public void cambiarPantalla(JFrame nuevaPantalla) {
        pantalla.setVisible(false); 
        nuevaPantalla.setLocationRelativeTo(null); 
        nuevaPantalla.setVisible(true); 
    }
}
