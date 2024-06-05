package gimnasio.Vista.Pagos;

import javax.swing.*;

public class ventanaMostrarFacturas extends JDialog {
    public JPanel contentPane;
    public JButton atrásButton;
    public JTable tableFacturas;
    public JButton buttonOK;

    public ventanaMostrarFacturas() {
        setTitle("Mostrar Facturas");
        setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
        setContentPane(contentPane);
        setModal(true);
        pack();
        setLocationRelativeTo(null);
    }
}
