package gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class VentanaPrincipal extends JFrame {
    public VentanaPrincipal() {
        configurarVentana();
        agregarComponentes();
    }

    private void configurarVentana() {
        setTitle("Sistema de Pruebas - Taxonomía de Bloom");
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar en pantalla
    }

    private void agregarComponentes() {
        JButton btnCargarArchivo = new JButton("Cargar archivo de ítemes");
        btnCargarArchivo.addActionListener(e -> cargarArchivo());
        add(btnCargarArchivo);
    }

    private void cargarArchivo() {
        JFileChooser fileChooser = new JFileChooser();
        if (fileChooser.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
            // Aquí procesarás el archivo (lo haremos después)
            System.out.println("Archivo seleccionado: " + fileChooser.getSelectedFile().getName());
        }
    }
}