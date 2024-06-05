package gimnasio.Controlador.Socios;

import gimnasio.Vista.Socios.ventanaDueño;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CtrlVentanaDueño implements ActionListener {

    private ventanaDueño vista;

    public CtrlVentanaDueño() {
        this.vista = new ventanaDueño();
        initialize();
    }

    private void initialize() {
        vista.setMinimumSize(new Dimension(800, 500));
        vista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.setContentPane(vista.contentPane);
        vista.pack();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);

        // Aquí puedes añadir listeners para los botones si los tuviera
        // vista.someButton.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object source = e.getSource();
        // Implementar lógica de los botones aquí
    }
}
