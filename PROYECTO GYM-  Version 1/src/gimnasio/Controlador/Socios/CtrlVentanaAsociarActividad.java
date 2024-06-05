package gimnasio.Controlador.Socios;

import gimnasio.Vista.Socios.ventanaAsociarActividad;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CtrlVentanaAsociarActividad {

    private ventanaAsociarActividad vista;

    public CtrlVentanaAsociarActividad() {
        this.vista = new ventanaAsociarActividad();
        initialize();
    }

    private void initialize() {
        vista.setMinimumSize(new Dimension(800, 500));
        vista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.setContentPane(vista.contentPane);
        vista.pack();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        vista.textCedula.addKeyListener(new KeyAdapter() {
            @Override
            public void keyReleased(KeyEvent e) {
                String cedula = vista.textCedula.getText();
                if (!cedula.isEmpty()) {
                    vista.labelNombre.setText("Nombre: " + obtenerNombrePorCedula(cedula));
                } else {
                    vista.labelNombre.setText("");
                }
            }
        });

        vista.cancelarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vista.dispose();
            }
        });

        vista.registrarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Lógica de registro
            }
        });
    }

    private String obtenerNombrePorCedula(String cedula) {
        // Lógica para obtener el nombre por la cédula
        return "Nombre Ejemplo";
    }
}
