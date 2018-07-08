package br.com.imikropdv.view;

import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.UIManager;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class ViewUsuarios extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtTelefoneUsuario;
	private JTextField txtCelularUsuario;
	private JTextField txtEmailUsuario;
	private JTextField txtLogradouroUsuario;
	private JTextField txtNumEndUsuario;
	private JTextField txtCompEndUsuario;
	private JTextField txtBairroUsuario;
	private JTextField txtCidadeUsuario;
	private JTextField txtCepUsuario;
	private JTextField txtNomeUsuario;
	private JTextField txtLoginUsuario;
	private JTextField txtSenhaUsuario;
	private JTable table;

	/*======================= VIEW COMPONENTS  =======================*/
	public ViewUsuarios() {
		setTitle("Usuário");
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		setBounds(100, 100, 800, 780);
		getContentPane().setLayout(null);
		
		JPanel panelDadosUsuario = new JPanel();
		panelDadosUsuario.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Usuário", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panelDadosUsuario.setBounds(10, 11, 764, 230);
		getContentPane().add(panelDadosUsuario);
		panelDadosUsuario.setLayout(null);
		
		JLabel lblNomeUsuario = new JLabel("Nome:");
		lblNomeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomeUsuario.setBounds(10, 28, 46, 14);
		panelDadosUsuario.add(lblNomeUsuario);
		
		txtNomeUsuario = new JTextField();
		txtNomeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNomeUsuario.setBounds(10, 53, 512, 28);
		panelDadosUsuario.add(txtNomeUsuario);
		txtNomeUsuario.setColumns(10);
		
		JComboBox cbTipoUsuario = new JComboBox();
		cbTipoUsuario.setModel(new DefaultComboBoxModel(new String[] {"Funcionário", "Administrador"}));
		cbTipoUsuario.setBounds(532, 51, 111, 30);
		panelDadosUsuario.add(cbTipoUsuario);
		cbTipoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblTipoUsuario = new JLabel("Tipo de usuário:");
		lblTipoUsuario.setBounds(532, 32, 95, 15);
		panelDadosUsuario.add(lblTipoUsuario);
		lblTipoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JComboBox cbSituacaoUsuario = new JComboBox();
		cbSituacaoUsuario.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		cbSituacaoUsuario.setBounds(653, 51, 101, 30);
		panelDadosUsuario.add(cbSituacaoUsuario);
		cbSituacaoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblSituacaoUsuario = new JLabel("Situação:");
		lblSituacaoUsuario.setBounds(654, 32, 64, 14);
		panelDadosUsuario.add(lblSituacaoUsuario);
		lblSituacaoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		textField = new JTextField();
		textField.setBounds(10, 113, 164, 30);
		panelDadosUsuario.add(textField);
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setColumns(10);
		
		JLabel lblCpfUsuario = new JLabel("CPF:");
		lblCpfUsuario.setBounds(10, 94, 46, 14);
		panelDadosUsuario.add(lblCpfUsuario);
		lblCpfUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblCelularUsuario = new JLabel("Celular:");
		lblCelularUsuario.setBounds(580, 94, 46, 14);
		panelDadosUsuario.add(lblCelularUsuario);
		lblCelularUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtCelularUsuario = new JTextField();
		txtCelularUsuario.setBounds(580, 113, 164, 30);
		panelDadosUsuario.add(txtCelularUsuario);
		txtCelularUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCelularUsuario.setColumns(10);
		
		txtEmailUsuario = new JTextField();
		txtEmailUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmailUsuario.setBounds(10, 173, 362, 30);
		panelDadosUsuario.add(txtEmailUsuario);
		txtEmailUsuario.setColumns(10);
		
		JLabel lblEmailUsuario = new JLabel("E-mail:");
		lblEmailUsuario.setBounds(10, 155, 50, 14);
		panelDadosUsuario.add(lblEmailUsuario);
		lblEmailUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		textField_1 = new JTextField();
		textField_1.setBounds(184, 113, 200, 30);
		panelDadosUsuario.add(textField_1);
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_1.setColumns(10);
		
		JLabel lblRgUsuario = new JLabel("RG:");
		lblRgUsuario.setBounds(184, 92, 46, 14);
		panelDadosUsuario.add(lblRgUsuario);
		lblRgUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblTelefoneUsuario = new JLabel("Telefone:");
		lblTelefoneUsuario.setBounds(394, 94, 56, 14);
		panelDadosUsuario.add(lblTelefoneUsuario);
		lblTelefoneUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtTelefoneUsuario = new JTextField();
		txtTelefoneUsuario.setBounds(394, 113, 176, 30);
		panelDadosUsuario.add(txtTelefoneUsuario);
		txtTelefoneUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTelefoneUsuario.setColumns(10);
		
		JLabel lblLoginUsuario = new JLabel("Login:");
		lblLoginUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLoginUsuario.setBounds(382, 155, 46, 14);
		panelDadosUsuario.add(lblLoginUsuario);
		
		txtLoginUsuario = new JTextField();
		txtLoginUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLoginUsuario.setBounds(382, 173, 176, 30);
		panelDadosUsuario.add(txtLoginUsuario);
		txtLoginUsuario.setColumns(10);
		
		JLabel lblSenhaUsuario = new JLabel("Senha:");
		lblSenhaUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSenhaUsuario.setBounds(568, 155, 46, 14);
		panelDadosUsuario.add(lblSenhaUsuario);
		
		txtSenhaUsuario = new JTextField();
		txtSenhaUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtSenhaUsuario.setBounds(568, 173, 176, 30);
		panelDadosUsuario.add(txtSenhaUsuario);
		txtSenhaUsuario.setColumns(10);
		
		JPanel panelEnderecoUsuario = new JPanel();
		panelEnderecoUsuario.setLayout(null);
		panelEnderecoUsuario.setBorder(new TitledBorder(null, "Endereço", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEnderecoUsuario.setBounds(10, 263, 764, 165);
		getContentPane().add(panelEnderecoUsuario);
		
		txtLogradouroUsuario = new JTextField();
		txtLogradouroUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLogradouroUsuario.setColumns(10);
		txtLogradouroUsuario.setBounds(10, 46, 412, 30);
		panelEnderecoUsuario.add(txtLogradouroUsuario);
		
		JLabel lblLogradouroUsuario = new JLabel("Logradouro:");
		lblLogradouroUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLogradouroUsuario.setBounds(10, 26, 72, 14);
		panelEnderecoUsuario.add(lblLogradouroUsuario);
		
		txtNumEndUsuario = new JTextField();
		txtNumEndUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNumEndUsuario.setColumns(10);
		txtNumEndUsuario.setBounds(432, 46, 86, 30);
		panelEnderecoUsuario.add(txtNumEndUsuario);
		
		JLabel lblNumEndUsuario = new JLabel("Nº:");
		lblNumEndUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumEndUsuario.setBounds(432, 27, 46, 14);
		panelEnderecoUsuario.add(lblNumEndUsuario);
		
		txtCompEndUsuario = new JTextField();
		txtCompEndUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCompEndUsuario.setColumns(10);
		txtCompEndUsuario.setBounds(528, 46, 226, 30);
		panelEnderecoUsuario.add(txtCompEndUsuario);
		
		JLabel lblCompEndUsuario = new JLabel("Complemento:");
		lblCompEndUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCompEndUsuario.setBounds(528, 27, 101, 14);
		panelEnderecoUsuario.add(lblCompEndUsuario);
		
		JLabel lblBairroUsuario = new JLabel("Bairro:");
		lblBairroUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairroUsuario.setBounds(10, 87, 56, 14);
		panelEnderecoUsuario.add(lblBairroUsuario);
		
		txtBairroUsuario = new JTextField();
		txtBairroUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtBairroUsuario.setColumns(10);
		txtBairroUsuario.setBounds(10, 107, 226, 30);
		panelEnderecoUsuario.add(txtBairroUsuario);
		
		JLabel lblCidadeUsuario = new JLabel("Cidade:");
		lblCidadeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidadeUsuario.setBounds(245, 87, 46, 14);
		panelEnderecoUsuario.add(lblCidadeUsuario);
		
		txtCidadeUsuario = new JTextField();
		txtCidadeUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCidadeUsuario.setColumns(10);
		txtCidadeUsuario.setBounds(246, 107, 212, 30);
		panelEnderecoUsuario.add(txtCidadeUsuario);
		
		JComboBox cbUfUsuario = new JComboBox();
		cbUfUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbUfUsuario.setBounds(468, 107, 74, 30);
		panelEnderecoUsuario.add(cbUfUsuario);
		
		JLabel lblUfUsuario = new JLabel("UF:");
		lblUfUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUfUsuario.setBounds(467, 87, 46, 14);
		panelEnderecoUsuario.add(lblUfUsuario);
		
		txtCepUsuario = new JTextField();
		txtCepUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCepUsuario.setColumns(10);
		txtCepUsuario.setBounds(552, 107, 169, 30);
		panelEnderecoUsuario.add(txtCepUsuario);
		
		JLabel lblCepUsuario = new JLabel("CEP:");
		lblCepUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCepUsuario.setBounds(551, 88, 46, 14);
		panelEnderecoUsuario.add(lblCepUsuario);
		
		JButton btnExcluirUsuario = new JButton("Excluir");
		btnExcluirUsuario.setIcon(new ImageIcon(ViewUsuarios.class.getResource("/br/com/imikropdv/images/cancel.png")));
		btnExcluirUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluirUsuario.setBounds(10, 700, 110, 30);
		getContentPane().add(btnExcluirUsuario);
		
		JButton btnNovoUsuario = new JButton("Novo");
		btnNovoUsuario.setIcon(new ImageIcon(ViewUsuarios.class.getResource("/br/com/imikropdv/images/new.png")));
		btnNovoUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNovoUsuario.setBounds(130, 700, 110, 30);
		getContentPane().add(btnNovoUsuario);
		
		JButton btnAlterarUsuario = new JButton("Alterar");
		btnAlterarUsuario.setIcon(new ImageIcon(ViewUsuarios.class.getResource("/br/com/imikropdv/images/alter.png")));
		btnAlterarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterarUsuario.setBounds(544, 700, 110, 30);
		getContentPane().add(btnAlterarUsuario);
		
		JButton btnSalvarUsuario = new JButton("Salvar");
		btnSalvarUsuario.setIcon(new ImageIcon(ViewUsuarios.class.getResource("/br/com/imikropdv/images/save.png")));
		btnSalvarUsuario.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalvarUsuario.setBounds(664, 700, 110, 30);
		getContentPane().add(btnSalvarUsuario);
		
		JPanel panelListaUsuarios = new JPanel();
		panelListaUsuarios.setBorder(new TitledBorder(null, "Lista de Usu\u00E1rios", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelListaUsuarios.setBounds(10, 439, 764, 250);
		getContentPane().add(panelListaUsuarios);
		panelListaUsuarios.setLayout(null);
		
		JScrollPane spListaUsuarios = new JScrollPane();
		spListaUsuarios.setBounds(10, 28, 744, 200);
		panelListaUsuarios.add(spListaUsuarios);
		
		table = new JTable();
		spListaUsuarios.setViewportView(table);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Nome", "Tipo de usu\u00E1rio", "Situa\u00E7\u00E3o", "CPF", "RG", "Telefone", "Celula", "E-mail", "Login", "Senha"
			}
		));
		table.setFont(new Font("Tahoma", Font.PLAIN, 12));

	}

}
