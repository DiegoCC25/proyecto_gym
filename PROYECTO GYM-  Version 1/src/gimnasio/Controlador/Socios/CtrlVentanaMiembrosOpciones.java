package gimnasio.Controlador.Socios;

import gimnasio.Vista.Socios.ventanaMiembrosOpciones;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlVentanaMiembrosOpciones implements ActionListener {

    private ventanaMiembrosOpciones vista;

    public CtrlVentanaMiembrosOpciones() {
        this.vista = new ventanaMiembrosOpciones();
        initialize();
    }

    private void initialize() {
        vista.setMinimumSize(new Dimension(800, 500));
        vista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.setContentPane(vista.contentPane);
        vista.pack();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        vista.registrarMiembroButton.addActionListener(this);
        vista.asociarAActividadButton.addActionListener(this);
        vista.atrásButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vista.registrarMiembroButton) {
            new CtrlVentanaMiembros();
        } else if (source == vista.asociarAActividadButton) {
            new CtrlVentanaAsociarActividad();
        } else if (source == vista.atrásButton) {
            vista.dispose();
        }
    }
}
