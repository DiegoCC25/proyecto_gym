package gimnasio.Vista.Reportes;

import javax.swing.*;

public class ventanaReportes extends JFrame {
    public JPanel contentPane;
    public JTextArea txtMensaje;
    public JTextField textMotivo;
    public JButton cancelarButton;
    public JButton enviarButton;

    public ventanaReportes() {
        setTitle("Reportes");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);
    }
}
