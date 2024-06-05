package gimnasio.Controlador;

import gimnasio.Vista.Actividad.ventanaMostrar;
import gimnasio.Vista.Actividad.ventanaPrincipalRegistro;
import gimnasio.Vista.Actividad.ventanaRegistro;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlClases implements ActionListener {

    private ventanaPrincipalRegistro vistaPrincipalRegistro;
    private ventanaMostrar vistaMostrar;
    private ventanaRegistro vistaRegistro;

    public CtrlClases() {
        this.vistaPrincipalRegistro = new ventanaPrincipalRegistro();
        this.vistaMostrar = new ventanaMostrar();
        this.vistaRegistro = new ventanaRegistro();

        initialize();
    }

    private void initialize() {
        vistaPrincipalRegistro.setMinimumSize(new Dimension(500, 300)); //CAMBIAR DIMENSION
        vistaPrincipalRegistro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaPrincipalRegistro.setContentPane(vistaPrincipalRegistro.contentPane);
        vistaPrincipalRegistro.pack();
        vistaPrincipalRegistro.setLocationRelativeTo(null);
        vistaPrincipalRegistro.setVisible(true);

        vistaPrincipalRegistro.registrarActividadButton.addActionListener(this);
        vistaPrincipalRegistro.mostrarActividadesButton.addActionListener(this);
        vistaPrincipalRegistro.buttonAtras.addActionListener(this);  // Agregado para manejar el botón Atras

        vistaMostrar.buttonAtras.addActionListener(this);
        vistaRegistro.buttonRegistrar.addActionListener(this);
        vistaRegistro.buttonCancelar.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vistaPrincipalRegistro.registrarActividadButton) {
            openVentanaRegistro();
        } else if (source == vistaPrincipalRegistro.mostrarActividadesButton) {
            openVentanaMostrar();
        } else if (source == vistaPrincipalRegistro.buttonAtras) {
            vistaPrincipalRegistro.dispose(); // Cerrar la ventana de registro de actividades
        } else if (source == vistaMostrar.buttonAtras) {
            vistaMostrar.dispose(); // Cerrar la ventana de mostrar actividades
        } else if (source == vistaRegistro.buttonRegistrar) {
            registrarActividad();
        } else if (source == vistaRegistro.buttonCancelar) {
            vistaRegistro.dispose(); // Cerrar la ventana de registro de actividades
        }
    }

    private void openVentanaRegistro() {
        vistaRegistro.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaRegistro.setContentPane(vistaRegistro.contentPane);
        vistaRegistro.pack();
        vistaRegistro.setLocationRelativeTo(null);
        vistaRegistro.setVisible(true);
    }

    private void openVentanaMostrar() {
        vistaMostrar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaMostrar.setContentPane(vistaMostrar.contentPane);
        vistaMostrar.pack();
        vistaMostrar.setLocationRelativeTo(null);
        vistaMostrar.setVisible(true);
    }

    private void registrarActividad() {
        // Lógica para registrar la actividad
        JOptionPane.showMessageDialog(vistaRegistro, "Actividad registrada con éxito.");
        vistaRegistro.dispose(); // Cerrar la ventana de registro después de registrar
    }
}
