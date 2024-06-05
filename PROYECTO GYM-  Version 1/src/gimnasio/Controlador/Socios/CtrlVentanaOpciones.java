package gimnasio.Controlador.Socios;

import gimnasio.Vista.Socios.ventanaOpciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlVentanaOpciones implements ActionListener {

    private ventanaOpciones vista;

    public CtrlVentanaOpciones() {
        this.vista = new ventanaOpciones();
        initialize();
    }

    private void initialize() {
        vista.setMinimumSize(new Dimension(800, 500));
        vista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.setContentPane(vista.contentPane);
        vista.pack();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        vista.dueñoButton.addActionListener(this);
        vista.personalButton.addActionListener(this);
        vista.miembrosButton.addActionListener(this);
        vista.atrásButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vista.dueñoButton) {
            new CtrlVentanaDueño();
        } else if (source == vista.personalButton) {
            new CtrlVentanaPersonal();
        } else if (source == vista.miembrosButton) {
            new CtrlVentanaMiembrosOpciones();
        } else if (source == vista.atrásButton) {
            vista.dispose();
        }
    }
}
