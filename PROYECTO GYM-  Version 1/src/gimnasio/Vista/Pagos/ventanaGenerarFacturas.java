package gimnasio.Vista.Pagos;

import javax.swing.*;

public class ventanaGenerarFacturas extends JFrame {
    public JPanel contentPane;
    public JButton buttonCancel;
    public JTextField textCedula;
    public JTextField textNombre;
    public JTextField textApellido;
    public JTextField textFecha;
    public JTextField textPrecio;
    public JTextField textCantidad;
    public JButton generarButton;

    public ventanaGenerarFacturas() {
        setTitle("Generar Facturas");
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setContentPane(contentPane);
        pack();
        setLocationRelativeTo(null);
    }
}
