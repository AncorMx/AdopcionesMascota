package com.mycompany.adopcionesmascota.Presentacion;

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ControlPresentacion
 */
public class ControlPresentacion {

    public void AbrirPantalla(JFrame frame) {
        frame.setVisible(true);
    }

    public void PasarPantalla(JFrame frame) {
        // Logic to switch frames
        frame.setVisible(true);
    }

    public void PasarPanel(JPanel panel) {
        // Logic to switch panels
        panel.setVisible(true);
    }

    public boolean ValidarCampoCompleto(boolean completo) {
        return completo;
    }
}
