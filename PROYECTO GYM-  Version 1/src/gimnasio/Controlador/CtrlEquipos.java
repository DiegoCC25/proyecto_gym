package gimnasio.Controlador;

import gimnasio.Vista.Equipos.ventanaEquipos;
import gimnasio.Vista.Equipos.ventanaEquiposPrincipal;
import gimnasio.Vista.Equipos.ventanaMateriales;
import gimnasio.Vista.Equipos.ventanaVerInventario;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlEquipos implements ActionListener {

    private ventanaEquiposPrincipal vistaEquiposPrincipal;
    private ventanaEquipos vistaEquipos;
    private ventanaMateriales vistaMateriales;
    private ventanaVerInventario vistaVerInventario;

    public CtrlEquipos() {
        this.vistaEquiposPrincipal = new ventanaEquiposPrincipal();
        this.vistaEquipos = new ventanaEquipos();
        this.vistaMateriales = new ventanaMateriales();
        this.vistaVerInventario = new ventanaVerInventario();

        initialize();
    }

    private void initialize() {
        vistaEquiposPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaEquiposPrincipal.setContentPane(vistaEquiposPrincipal.contentPane);
        vistaEquiposPrincipal.pack();
        vistaEquiposPrincipal.setLocationRelativeTo(null);
        vistaEquiposPrincipal.setVisible(true);

        vistaEquiposPrincipal.equiposButton.addActionListener(this);
        vistaEquiposPrincipal.materialesButton.addActionListener(this);
        vistaEquiposPrincipal.verInventarioButton.addActionListener(this);

        vistaEquipos.buttonRegistrar.addActionListener(this);
        vistaEquipos.buttonCancelar.addActionListener(this);

        vistaMateriales.buttonRegistrar.addActionListener(this);
        vistaMateriales.buttonCancelar.addActionListener(this);

        vistaVerInventario.buttonOK.addActionListener(this);
        vistaVerInventario.buttonCancel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vistaEquiposPrincipal.equiposButton) {
            openVentanaEquipos();
        } else if (source == vistaEquiposPrincipal.materialesButton) {
            openVentanaMateriales();
        } else if (source == vistaEquiposPrincipal.verInventarioButton) {
            openVentanaVerInventario();
        } else if (source == vistaEquipos.buttonRegistrar) {
            registrarEquipo();
        } else if (source == vistaEquipos.buttonCancelar) {
            vistaEquipos.dispose();
        } else if (source == vistaMateriales.buttonRegistrar) {
            registrarMaterial();
        } else if (source == vistaMateriales.buttonCancelar) {
            vistaMateriales.dispose();
        } else if (source == vistaVerInventario.buttonOK) {
            vistaVerInventario.dispose();
        } else if (source == vistaVerInventario.buttonCancel) {
            vistaVerInventario.dispose();
        }
    }

    private void openVentanaEquipos() {
        vistaEquipos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaEquipos.setContentPane(vistaEquipos.contentPane);
        vistaEquipos.pack();
        vistaEquipos.setLocationRelativeTo(null);
        vistaEquipos.setVisible(true);
    }

    private void openVentanaMateriales() {
        vistaMateriales.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaMateriales.setContentPane(vistaMateriales.contentPane);
        vistaMateriales.pack();
        vistaMateriales.setLocationRelativeTo(null);
        vistaMateriales.setVisible(true);
    }

    private void openVentanaVerInventario() {
        vistaVerInventario.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaVerInventario.setContentPane(vistaVerInventario.contentPane);
        vistaVerInventario.pack();
        vistaVerInventario.setLocationRelativeTo(null);
        vistaVerInventario.setVisible(true);
    }

    private void registrarEquipo() {
        // Lógica para registrar equipo
        JOptionPane.showMessageDialog(vistaEquipos, "Equipo registrado con éxito.");
        vistaEquipos.dispose();
    }

    private void registrarMaterial() {
        // Lógica para registrar material
        JOptionPane.showMessageDialog(vistaMateriales, "Material registrado con éxito.");
        vistaMateriales.dispose();
    }
}
