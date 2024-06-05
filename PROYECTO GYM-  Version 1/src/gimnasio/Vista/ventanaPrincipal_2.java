package gimnasio.Vista;

import javax.swing.*;
import java.awt.*;

public class ventanaPrincipal_2 extends JFrame {
    public JPanel contentPane;
    public JButton buttonCerrar;
    public JButton sociosButton;
    public JButton actividadButton;
    public JButton equiposButton;
    public JButton pagosButton;
    public JButton reportesButton;
    public JLabel labelLogo;  // Cambiado a JLabel

    public ventanaPrincipal_2() {
        setTitle("Ventana Principal");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);

        // Cargar la imagen y redimensionarla
        try {
            ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/LOGO3.png"));
            Image image = icon.getImage(); // transform it
            Image newimg = image.getScaledInstance(500, 500,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
            icon = new ImageIcon(newimg);  // transform it back
            labelLogo.setIcon(icon);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
