package gimnasio.Controlador.Socios;

import gimnasio.Vista.Socios.ventanaDueño;
import gimnasio.Vista.Socios.ventanaMiembros;
import gimnasio.Vista.Socios.ventanaOpciones;
import gimnasio.Vista.Socios.ventanaPersonal;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlSocios implements ActionListener {

    private ventanaOpciones vistaOpciones;
    private ventanaDueño vistaDueño;
    private ventanaPersonal vistaPersonal;
    private ventanaMiembros vistaMiembros;

    public CtrlSocios() {
        this.vistaOpciones = new ventanaOpciones();
        this.vistaDueño = new ventanaDueño();
        this.vistaPersonal = new ventanaPersonal();
        this.vistaMiembros = new ventanaMiembros();

        initialize();
    }

    private void initialize() {
        vistaOpciones.setMinimumSize(new Dimension(500, 300)); //CAMBIAR DIMENSION
        vistaOpciones.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaOpciones.setContentPane(vistaOpciones.contentPane);
        vistaOpciones.pack();
        vistaOpciones.setLocationRelativeTo(null);
        vistaOpciones.setVisible(true);

        vistaOpciones.dueñoButton.addActionListener(this);
        vistaOpciones.personalButton.addActionListener(this);
        vistaOpciones.miembrosButton.addActionListener(this);
        vistaOpciones.buttonAtras.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vistaOpciones.dueñoButton) {
            openVentanaDueño();
        } else if (source == vistaOpciones.personalButton) {
            openVentanaPersonal();
        } else if (source == vistaOpciones.miembrosButton) {
            openVentanaMiembros();
        } else if (source == vistaOpciones.buttonAtras) {
            vistaOpciones.dispose(); // Cerrar la ventana de opciones
        }
    }

    private void openVentanaDueño() {
        vistaDueño.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaDueño.setContentPane(vistaDueño.contentPane);
        vistaDueño.pack();
        vistaDueño.setLocationRelativeTo(null);
        vistaDueño.setVisible(true);
    }

    private void openVentanaPersonal() {
        vistaPersonal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaPersonal.setContentPane(vistaPersonal.contentPane);
        vistaPersonal.pack();
        vistaPersonal.setLocationRelativeTo(null);
        vistaPersonal.setVisible(true);
    }

    private void openVentanaMiembros() {
        vistaMiembros.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaMiembros.setContentPane(vistaMiembros.contentPane);
        vistaMiembros.pack();
        vistaMiembros.setLocationRelativeTo(null);
        vistaMiembros.setVisible(true);
    }
}
