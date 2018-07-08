package br.com.imikropdv.view;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class ViewLogin extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel cpLogin;
	private JTextField txtUsuario;
	private JTextField txtSenha;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewLogin frame = new ViewLogin();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*======================= VIEW COMPONENTS  =======================*/
	public ViewLogin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 440, 300);
		cpLogin = new JPanel();
		cpLogin.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cpLogin);
		cpLogin.setLayout(null);
		
		JLabel lblLogotipo = new JLabel("");
		lblLogotipo.setBounds(20, 13, 151, 51);
		ImageIcon logo = new ImageIcon(ViewLogin.class.getResource("/br/com/imikropdv/images/logotipo.png"));
		Image imageLogo = logo.getImage().getScaledInstance(lblLogotipo.getWidth(), lblLogotipo.getHeight(), Image.SCALE_SMOOTH);
		lblLogotipo.setIcon(new ImageIcon(imageLogo));
		cpLogin.add(lblLogotipo);
		
		JLabel lblUsuario = new JLabel("Usuário:");
		lblUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUsuario.setBounds(53, 105, 58, 14);
		cpLogin.add(lblUsuario);
		
		txtUsuario = new JTextField();
		txtUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtUsuario.setBounds(121, 98, 242, 27);
		cpLogin.add(txtUsuario);
		txtUsuario.setColumns(10);
		
		JLabel lblSenha = new JLabel("Senha:");
		lblSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenha.setBounds(53, 143, 46, 14);
		cpLogin.add(lblSenha);
		
		txtSenha = new JTextField();
		txtSenha.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSenha.setBounds(121, 138, 242, 27);
		cpLogin.add(txtSenha);
		txtSenha.setColumns(10);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnLogin.setBounds(175, 197, 89, 27);
		cpLogin.add(btnLogin);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnCancelar.setBounds(274, 197, 89, 27);
		cpLogin.add(btnCancelar);

	}
}
