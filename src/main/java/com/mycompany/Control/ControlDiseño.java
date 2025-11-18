/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Control;

import com.mycompany.adopcionesmascota.GUI.*;
import java.awt.CardLayout;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Josel
 */
public class ControlDiseño {

    private JFrame currentFrame;
    private JPanel dynamicPanelContainer;
    private CardLayout cardLayout;

    // Constructor para transiciones entre frames (Login/Registro)
    public ControlDiseño(JFrame currentFrame) {
        this.currentFrame = currentFrame;
    }

    // Constructor para ser usado por FMain para gestionar sus paneles internos
    public ControlDiseño(JFrame mainFrame, JPanel container, CardLayout layout) {
        this.currentFrame = mainFrame;
        this.dynamicPanelContainer = container;
        this.cardLayout = layout;
    }

    public final class ViewNames {
        // Paneles de navegación principal

        public static final String CATALOGO = "Mostrar_Menu";
        public static final String SOLICITUDES = "Mostrar_Solis";
        public static final String CONTACTO = "Mostrar_Contacto";

        // Flujo de Solicitud
        public static final String INFO_MASCOTA = "Mostrar_InfoMascota";
        public static final String PASO_1_PERSONAL = "Mostrar_InfoPersonal";
        public static final String PASO_2_VIVIENDA = "Mostrar_InfoVivienda";
        public static final String PASO_3_RAZONES = "Mostrar_InfoRazones";
        public static final String PASO_4_RESUMEN = "Mostrar_InfoResumen";

        // Pantallas de mensaje
        public static final String ERROR_CITA = "Error_CitaPendiente";
        public static final String ERROR_SOLICITUD = "Error_Solicitud";
    }

    /**
     * Crea un panel por reflexión, inyecta el controlador y lo registra en el
     * CardLayout.
     */
    public void createAndRegisterPanel(String viewName, Class<? extends JPanel> panelType) {
        if (dynamicPanelContainer.getLayout() instanceof CardLayout) {
            try {
                // Intenta encontrar el constructor que acepta ControlDiseño
                JPanel newPanel;
                try {
                    newPanel = (JPanel) panelType.getConstructor(ControlDiseño.class).newInstance(this);
                } catch (NoSuchMethodException e) {
                    // Si falla (ej: JPSolicitudes), intenta el constructor sin argumentos
                    newPanel = (JPanel) panelType.getConstructor().newInstance();
                }

                newPanel.setName(viewName);
                dynamicPanelContainer.add(newPanel, viewName);
            } catch (Exception e) {
                System.err.println("Error al crear el panel para la vista " + viewName + ": " + e.getMessage());
            }
        }
    }

    // Método base para transicionar entre JFrames
    private void cambiarPantalla(JFrame nuevaPantalla) {
        if (currentFrame != null) {
            currentFrame.dispose();
        }
        nuevaPantalla.setLocationRelativeTo(null);
        nuevaPantalla.setVisible(true);
    }

    // Método base para cambiar la vista interna
    private void showInternalPanel(String viewName) {
        if (cardLayout != null) {
            cardLayout.show(dynamicPanelContainer, viewName);
        }
    }

    // ==========================================================
    // MÉTODOS PÚBLICOS DE NAVEGACIÓN
    // ==========================================================
    // Transiciones entre JFrames
    public void goToLogin(JFrame currentFrame) {
        cambiarPantalla(new FrmInicoSesion());
    }

    public void goToRegistro(JFrame currentFrame) {
        cambiarPantalla(new FrmRegistro());
    }

    public void goToMain(JFrame currentFrame) {
        cambiarPantalla(new FMain());
    }

    // Métodos de navegación de menú
    public void goToMainCatalog() {
        showInternalPanel(ViewNames.CATALOGO);
    }

    public void goToSolicitudes() {
        showInternalPanel(ViewNames.SOLICITUDES);
    }

    public void goToRegistro() {
        cambiarPantalla(new FrmRegistro());
    }
    public void goToMain() {
        cambiarPantalla(new FMain());
    }

    public void goToContacto() {
        showInternalPanel(ViewNames.CONTACTO);
    }

    /**
     * Define el flujo secuencial del formulario de adopción.
     */
    public void goToNextStep(String currentViewName) {
        switch (currentViewName) {
            case ViewNames.INFO_MASCOTA:
                showInternalPanel(ViewNames.PASO_1_PERSONAL);
                break;
            case ViewNames.PASO_1_PERSONAL:
                showInternalPanel(ViewNames.PASO_2_VIVIENDA);
                break;
            case ViewNames.PASO_2_VIVIENDA:
                showInternalPanel(ViewNames.PASO_3_RAZONES);
                break;
            case ViewNames.PASO_3_RAZONES:
                showInternalPanel(ViewNames.PASO_4_RESUMEN);
                break;
            case ViewNames.PASO_4_RESUMEN:
                // Asume envío exitoso y regresa al catálogo.
                goToMainCatalog();
                break;
            default:
                goToMainCatalog();
        }
    }

    /**
     * Navega al paso anterior del formulario.
     */
    public void goToPreviousStep(String currentViewName) {
        switch (currentViewName) {
            case ViewNames.PASO_4_RESUMEN:
                showInternalPanel(ViewNames.PASO_3_RAZONES);
                break;
            case ViewNames.PASO_3_RAZONES:
                showInternalPanel(ViewNames.PASO_2_VIVIENDA);
                break;
            case ViewNames.PASO_2_VIVIENDA:
                showInternalPanel(ViewNames.PASO_1_PERSONAL);
                break;
            case ViewNames.PASO_1_PERSONAL:
                showInternalPanel(ViewNames.INFO_MASCOTA);
                break;
            default:
                goToMainCatalog();
        }
    }

    public void cancelForm() {
        goToMainCatalog();
    }
}
