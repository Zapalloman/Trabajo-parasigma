package main;

import gui.VentanaPrincipal; // Asumiremos que crearás esta clase después

public class Main {
    public static void main(String[] args) {
        // Swing debe ejecutarse en el Event Dispatch Thread (EDT)
        javax.swing.SwingUtilities.invokeLater(() -> {
            new VentanaPrincipal().setVisible(true); // Lanza la ventana principal
        });
    }
}