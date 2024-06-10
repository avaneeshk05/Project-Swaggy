/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectswaggy;

/**
 *
 * 
 * @author Avaneesh Koushik
 */
public class ProjectSwaggy {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new dpHome().setVisible(true);
            }
        });
    }
}
