package gimnasio.Controlador;

import gimnasio.Controlador.Socios.CtrlVentanaOpciones;
import gimnasio.Vista.ventanaPrincipal_2;
import gimnasio.Controlador.CtrlClases;
import gimnasio.Controlador.CtrlEquipos;
import gimnasio.Controlador.CtrlPagos;
import gimnasio.Controlador.CtrlReportes;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlVentanaPrincipal implements ActionListener {

    private ventanaPrincipal_2 vista;

    public CtrlVentanaPrincipal() {
        this.vista = new ventanaPrincipal_2();
        initialize();
    }

    private void initialize() {
        vista.setMinimumSize(new Dimension(800, 500));
        vista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        vista.setContentPane(vista.contentPane);
        vista.pack();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        vista.buttonCerrar.addActionListener(this);
        vista.sociosButton.addActionListener(this);
        vista.actividadButton.addActionListener(this);
        vista.equiposButton.addActionListener(this);
        vista.pagosButton.addActionListener(this);
        vista.reportesButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vista.buttonCerrar) {
            System.exit(0);
        } else if (source == vista.sociosButton) {
            new CtrlVentanaOpciones();
        } else if (source == vista.actividadButton) {
            new CtrlClases();
        } else if (source == vista.equiposButton) {
            new CtrlEquipos();
        } else if (source == vista.pagosButton) {
            new CtrlPagos();
        } else if (source == vista.reportesButton) {
            new CtrlReportes();
        }
    }
}
