package gimnasio.Controlador;

import gimnasio.Vista.Pagos.ventanaGenerarFacturas;
import gimnasio.Vista.Pagos.ventanaMostrarFacturas;
import gimnasio.Vista.Pagos.ventanaPrincipalPagos;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlPagos implements ActionListener {

    private ventanaPrincipalPagos vistaPrincipalPagos;
    private ventanaGenerarFacturas vistaGenerarFacturas;
    private ventanaMostrarFacturas vistaMostrarFacturas;

    public CtrlPagos() {
        this.vistaPrincipalPagos = new ventanaPrincipalPagos();
        this.vistaGenerarFacturas = new ventanaGenerarFacturas();
        this.vistaMostrarFacturas = new ventanaMostrarFacturas();

        initialize();
    }

    private void initialize() {
        vistaPrincipalPagos.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaPrincipalPagos.setContentPane(vistaPrincipalPagos.contentPane);
        vistaPrincipalPagos.pack();
        vistaPrincipalPagos.setLocationRelativeTo(null);
        vistaPrincipalPagos.setVisible(true);

        vistaPrincipalPagos.generarFacturaButton.addActionListener(this);
        vistaPrincipalPagos.mostrarFacturasButton.addActionListener(this);
        vistaPrincipalPagos.atrásButton.addActionListener(this);

        vistaGenerarFacturas.generarButton.addActionListener(this);
        vistaGenerarFacturas.buttonCancel.addActionListener(this);

        vistaMostrarFacturas.atrásButton.addActionListener(this);
        //vistaMostrarFacturas.buttonOK.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vistaPrincipalPagos.generarFacturaButton) {
            openVentanaGenerarFacturas();
        } else if (source == vistaPrincipalPagos.mostrarFacturasButton) {
            openVentanaMostrarFacturas();
        } else if (source == vistaPrincipalPagos.atrásButton) {
            vistaPrincipalPagos.dispose();
        } else if (source == vistaGenerarFacturas.generarButton) {
            generarFactura();
        } else if (source == vistaGenerarFacturas.buttonCancel) {
            vistaGenerarFacturas.dispose();
        } else if (source == vistaMostrarFacturas.atrásButton) {
            vistaMostrarFacturas.dispose();
        }
    }

    private void openVentanaGenerarFacturas() {
        vistaGenerarFacturas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaGenerarFacturas.setContentPane(vistaGenerarFacturas.contentPane);
        vistaGenerarFacturas.pack();
        vistaGenerarFacturas.setLocationRelativeTo(null);
        vistaGenerarFacturas.setVisible(true);
    }

    private void openVentanaMostrarFacturas() {
        vistaMostrarFacturas.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaMostrarFacturas.setContentPane(vistaMostrarFacturas.contentPane);
        vistaMostrarFacturas.pack();
        vistaMostrarFacturas.setLocationRelativeTo(null);
        vistaMostrarFacturas.setVisible(true);
    }

    private void generarFactura() {
        // Lógica para generar factura
        JOptionPane.showMessageDialog(vistaGenerarFacturas, "Factura generada con éxito.");
        vistaGenerarFacturas.dispose();
    }
}
