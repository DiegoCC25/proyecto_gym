package gimnasio.Vista;

import javax.swing.*;

public class ventanaPrincipal_1 extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancelar;
    private JButton GYM1Button;

    public ventanaPrincipal_1() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }
}
