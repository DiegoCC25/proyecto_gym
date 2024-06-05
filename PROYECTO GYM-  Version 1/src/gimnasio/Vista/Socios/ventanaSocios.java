package gimnasio.Vista.Socios;

import javax.swing.*;

public class ventanaSocios extends JDialog {
    private JPanel contentPane;
    private JTextField textNombre;
    private JTextField textApellido;
    private JTextField textEdad;
    private JTextField textTelefono;
    private JTextField textDireccion;
    private JTextField textCorreo;
    private JTextField textCedula;
    private JComboBox comboRol;
    private JRadioButton miembrosRadioButton;
    private JRadioButton personalRadioButton;
    private JRadioButton dueñosRadioButton;
    private JTable tableSocios;
    private JButton buttonOK;

    public ventanaSocios() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
    }
}
