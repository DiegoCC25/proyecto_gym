package gimnasio.Controlador.Socios;

import gimnasio.Vista.Socios.ventanaMiembros;

import javax.swing.*;
import java.awt.*;

public class CtrlVentanaMiembros {

    private ventanaMiembros vista;

    public CtrlVentanaMiembros() {
        this.vista = new ventanaMiembros();
        initialize();
    }

    private void initialize() {
        vista.setMinimumSize(new Dimension(800, 500));
        vista.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        vista.setContentPane(vista.contentPane);
        vista.pack();
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
}
