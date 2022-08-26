package tareas;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;


import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.Action;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class logins extends JFrame {

	private JPanel Login;
	private JTextField Usuario;
	private JPasswordField Contraseña;
	private JButton ingresar;
	private final Action action = new SwingAction();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					logins frame = new logins();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public logins() {
		addWindowListener(new WindowAdapter() {
			@Override
			public void windowActivated(WindowEvent e) {
			}
		});
		setType(Type.UTILITY);
		setFont(new Font("Ames", Font.PLAIN, 13));
		setTitle("LOGIN");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 464, 239);
		Login = new JPanel();
		Login.setBackground(new Color(230, 230, 250));
		Login.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(Login);
		Login.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("Usuario:");
		lblNewLabel_1.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_1.setBounds(35, 62, 83, 24);
		Login.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Contraseña:");
		lblNewLabel_2.setFont(new Font("Dialog", Font.BOLD, 12));
		lblNewLabel_2.setBounds(35, 118, 83, 24);
		Login.add(lblNewLabel_2);
		
		Usuario = new JTextField();
		Usuario.setBounds(35, 87, 139, 20);
		Login.add(Usuario);
		Usuario.setColumns(10);
		
		Contraseña = new JPasswordField();
		Contraseña.setBounds(35, 153, 139, 20);
		Login.add(Contraseña);
		
		this.setLocationRelativeTo(null);
		
		ingresar = new JButton("Ingresar");
		ingresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				char[] clave = Contraseña.getPassword();
				String clave2 = new String(clave);
				if (Usuario.getText().equals("Katherin Chun") && clave2.equals("202011518")){
					dispose();	
				
					informacion i = new informacion ();
					i.setVisible(true);
					String usu = new String(Usuario.getText());
					informacion.Usuario1.setText(usu);
					informacion.Carnet.setText(clave2);
				
				
				}else {
					JOptionPane.showMessageDialog(null,"Usuario o Contraseña Incorrectos", "ERROR", JOptionPane.ERROR_MESSAGE);
					
				}
					
					
				
				
			
			}
		});
		ingresar.setBackground(UIManager.getColor("Button.focus"));
		ingresar.setFont(new Font("Dialog", Font.BOLD, 12));
		ingresar.setBounds(271, 100, 104, 24);
		Login.add(ingresar);
		
		JLabel lblNewLabel = new JLabel("Ingresa tus datos");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 424, 24);
		Login.add(lblNewLabel);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
