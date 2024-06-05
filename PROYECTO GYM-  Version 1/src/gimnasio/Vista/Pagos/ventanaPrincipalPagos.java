package gimnasio.Vista.Pagos;

import javax.swing.*;

public class ventanaPrincipalPagos extends JFrame {
    public JPanel contentPane;
    public JButton atrásButton;
    public JButton generarFacturaButton;
    public JButton mostrarFacturasButton;

    public ventanaPrincipalPagos() {
        setTitle("Gestión de Pagos");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);
    }
}
