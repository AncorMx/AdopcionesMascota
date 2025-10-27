/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.adopcionesmascota;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author angel
 */
public class AdopcionesMascota {

    public static void main(String[] args) {
        System.out.println("Aasasdasd");
        EntityManagerFactory emf= Persistence.createEntityManagerFactory("AdopcionPU");
        EntityManager em=emf.createEntityManager();
    }
}
