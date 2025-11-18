/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Control;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Josel
 */
public class ControlDiseño {

    private JFrame pantalla;

    public ControlDiseño(JFrame pantalla) {
        this.pantalla = pantalla;
    }

    void cambiarPantalla(JFrame nuevaPantalla) {
        pantalla.setVisible(false);
        nuevaPantalla.setLocationRelativeTo(null);
        nuevaPantalla.setVisible(true);
    }

    public void cambiarPantalla(JFrame nuevaPantalla, int ancho, int alto) {
        pantalla.setVisible(false);
        nuevaPantalla.setSize(ancho, alto);
        nuevaPantalla.setLocationRelativeTo(null);
        nuevaPantalla.setVisible(true);
    }

    public void cambiarPanel(JPanel panelActual, JPanel nuevoPanel) {
        panelActual.setVisible(false);
        nuevoPanel.setVisible(true);
    }

    public void cambiarPanel(JPanel panelActual, JPanel nuevoPanel, int x, int y, int ancho, int alto) {
        panelActual.setVisible(false);
        nuevoPanel.setBounds(x, y, ancho, alto);
        nuevoPanel.setVisible(true);
    }
}
