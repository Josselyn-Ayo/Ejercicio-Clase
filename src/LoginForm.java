import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginForm extends JFrame{
    private JPanel PLogin;
    private JTextField txtUsuario;
    private JPasswordField txtContrasena;
    private JButton AccesoButton;
    private JComboBox comboRol;
    private JPasswordField passwordField1;
    private JPanel PanelMain;


    public LoginForm(){
        setTitle("Login"); setContentPane(PLogin);
        setSize(400,200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);

        AccesoButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario= txtUsuario.getText();
                String contrasena = new String(txtContrasena.getPassword());
                String rol = (String) comboRol.getSelectedItem();
                if (usuario.isEmpty() || contrasena. isEmpty()){
                        JOptionPane.showMessageDialog(null, "Por favor, complete los campos vacios");
                        return;
                }
                if (rol.equals("Administrador") && usuario.equals("Admin") && contrasena.equals("123")){
                    new Administrador().setVisible(true);
                    dispose();
                }
                if (rol.equals("Jugador") && usuario.equals("Jugar") && contrasena.equals("123")){
                    new ModelForm().setVisible(true);
                    dispose();
                }

            }
        });
    }


}
