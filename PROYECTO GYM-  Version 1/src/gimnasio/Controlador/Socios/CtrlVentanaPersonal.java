package gimnasio.Controlador.Socios;

import gimnasio.Vista.Socios.ventanaPersonal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlVentanaPersonal implements ActionListener {

    private ventanaPersonal vista;

    public CtrlVentanaPersonal() {
        this.vista = new ventanaPersonal();
        initialize();
    }

    private void initialize() {
        vista.setMinimumSize(new Dimension(800, 500));
        vista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.setContentPane(vista.contentPane);
        vista.pack();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        // Añadir listeners para los botones
        vista.registrarButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vista.registrarButton) {
            // Lógica para el botón OK
            JOptionPane.showMessageDialog(vista, "Información guardada correctamente.");
            vista.dispose();
        }
    }
}
