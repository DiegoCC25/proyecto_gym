package gimnasio.Controlador;

import gimnasio.Vista.Reportes.ventanaReportes;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlReportes implements ActionListener {

    private ventanaReportes vistaReportes;

    public CtrlReportes() {
        this.vistaReportes = new ventanaReportes();
        initialize();
    }

    private void initialize() {
        vistaReportes.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vistaReportes.setContentPane(vistaReportes.contentPane);
        vistaReportes.pack();
        vistaReportes.setLocationRelativeTo(null);
        vistaReportes.setVisible(true);

        vistaReportes.cancelarButton.addActionListener(this);
        vistaReportes.enviarButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        if (source == vistaReportes.cancelarButton) {
            vistaReportes.dispose();
        } else if (source == vistaReportes.enviarButton) {
            enviarReporte();
        }
    }

    private void enviarReporte() {
        String motivo = vistaReportes.textMotivo.getText();
        String mensaje = vistaReportes.txtMensaje.getText();
        // Lógica para enviar el reporte
        JOptionPane.showMessageDialog(vistaReportes, "Reporte enviado con éxito.\nMotivo: " + motivo + "\nMensaje: " + mensaje);
        vistaReportes.dispose();
    }
}
