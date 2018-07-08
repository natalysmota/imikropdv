package br.com.imikropdv.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.ImageIcon;
import javax.swing.border.TitledBorder;

public class ViewClientes extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtCodigoCliente;
	private JTextField txtNomeCliente;
	private JTextField txtCpfCliente;
	private JTextField txtRgCliente;
	private JTextField textField_4;
	private JTextField txtCelularCliente;
	private JTextField txtEmailCliente;
	private JTextField txtLogradouroCliente;
	private JTextField textField_8;
	private JTextField txtCompEndCliente;
	private JTextField txtCepCliente;
	private JTextField txtCidadeCliente;
	private JTextField txtBairroCliente;
	private JTable tblListaClientes;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewClientes frame = new ViewClientes();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/*======================= VIEW COMPONENTS  =======================*/
	public ViewClientes() {
		setClosable(true);
		setTitle("Clientes");
		setBounds(100, 100, 800, 760);
		getContentPane().setLayout(null);
		
		JScrollPane spListaClientes = new JScrollPane();
		spListaClientes.setBounds(10, 452, 764, 195);
		getContentPane().add(spListaClientes);
		
		tblListaClientes = new JTable();
		spListaClientes.setViewportView(tblListaClientes);
		tblListaClientes.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Código", "Cliente", "Tipo de cliente", "Situação", "CPF", "RG", "Telefone", "Celular", "E-mail"
			}
		));
		tblListaClientes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JButton btnExcluirCliente = new JButton("Excluir");
		btnExcluirCliente.setIcon(new ImageIcon(ViewClientes.class.getResource("/br/com/imikropdv/images/cancel.png")));
		btnExcluirCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluirCliente.setBounds(10, 673, 108, 30);
		getContentPane().add(btnExcluirCliente);
		
		JButton btnNovoCliente = new JButton("Novo");
		btnNovoCliente.setIcon(new ImageIcon(ViewClientes.class.getResource("/br/com/imikropdv/images/new.png")));
		btnNovoCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNovoCliente.setBounds(126, 673, 108, 30);
		getContentPane().add(btnNovoCliente);
		
		JButton btnAlterarCliente = new JButton("Alterar");
		btnAlterarCliente.setIcon(new ImageIcon(ViewClientes.class.getResource("/br/com/imikropdv/images/alter.png")));
		btnAlterarCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterarCliente.setBounds(548, 673, 108, 30);
		getContentPane().add(btnAlterarCliente);
		
		JButton btnSalvarCliente = new JButton("Salvar");
		btnSalvarCliente.setIcon(new ImageIcon(ViewClientes.class.getResource("/br/com/imikropdv/images/save.png")));
		btnSalvarCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalvarCliente.setBounds(666, 673, 108, 30);
		getContentPane().add(btnSalvarCliente);
		
		JPanel panelDadosCliente = new JPanel();
		panelDadosCliente.setBorder(new TitledBorder(null, "Cliente", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDadosCliente.setBounds(10, 24, 764, 235);
		getContentPane().add(panelDadosCliente);
		panelDadosCliente.setLayout(null);
		
		txtNomeCliente = new JTextField();
		txtNomeCliente.setBounds(105, 49, 417, 30);
		panelDadosCliente.add(txtNomeCliente);
		txtNomeCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNomeCliente.setColumns(10);
		
		txtCodigoCliente = new JTextField();
		txtCodigoCliente.setBounds(10, 49, 85, 30);
		panelDadosCliente.add(txtCodigoCliente);
		txtCodigoCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCodigoCliente.setColumns(10);
		
		JLabel lblCodigoCliente = new JLabel("Código:");
		lblCodigoCliente.setBounds(10, 30, 46, 14);
		panelDadosCliente.add(lblCodigoCliente);
		lblCodigoCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblNomeCliente = new JLabel("Cliente:");
		lblNomeCliente.setBounds(105, 30, 46, 14);
		panelDadosCliente.add(lblNomeCliente);
		lblNomeCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JComboBox cbTipoCliente = new JComboBox();
		cbTipoCliente.setBounds(532, 49, 111, 30);
		panelDadosCliente.add(cbTipoCliente);
		cbTipoCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblTipoCliente = new JLabel("Tipo de cliente:");
		lblTipoCliente.setBounds(532, 30, 95, 15);
		panelDadosCliente.add(lblTipoCliente);
		lblTipoCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblSituacaoCliente = new JLabel("Situação:");
		lblSituacaoCliente.setBounds(654, 30, 64, 14);
		panelDadosCliente.add(lblSituacaoCliente);
		lblSituacaoCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBounds(653, 49, 101, 30);
		panelDadosCliente.add(comboBox_1);
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtCpfCliente = new JTextField();
		txtCpfCliente.setBounds(10, 111, 212, 30);
		panelDadosCliente.add(txtCpfCliente);
		txtCpfCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCpfCliente.setColumns(10);
		
		JLabel lblCpfCliente = new JLabel("CPF:");
		lblCpfCliente.setBounds(10, 92, 46, 14);
		panelDadosCliente.add(lblCpfCliente);
		lblCpfCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtRgCliente = new JTextField();
		txtRgCliente.setBounds(233, 111, 200, 30);
		panelDadosCliente.add(txtRgCliente);
		txtRgCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtRgCliente.setColumns(10);
		
		JLabel lblRgCliente = new JLabel("RG:");
		lblRgCliente.setBounds(233, 90, 46, 14);
		panelDadosCliente.add(lblRgCliente);
		lblRgCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		textField_4 = new JTextField();
		textField_4.setBounds(443, 111, 176, 30);
		panelDadosCliente.add(textField_4);
		textField_4.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField_4.setColumns(10);
		
		JLabel lblTelefoneCliente = new JLabel("Telefone:");
		lblTelefoneCliente.setBounds(443, 92, 56, 14);
		panelDadosCliente.add(lblTelefoneCliente);
		lblTelefoneCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblEmailCliente = new JLabel("E-mail:");
		lblEmailCliente.setBounds(184, 153, 50, 14);
		panelDadosCliente.add(lblEmailCliente);
		lblEmailCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtEmailCliente = new JTextField();
		txtEmailCliente.setBounds(184, 171, 410, 30);
		panelDadosCliente.add(txtEmailCliente);
		txtEmailCliente.setColumns(10);
		
		txtCelularCliente = new JTextField();
		txtCelularCliente.setBounds(10, 171, 164, 30);
		panelDadosCliente.add(txtCelularCliente);
		txtCelularCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCelularCliente.setColumns(10);
		
		JLabel lblCelularCliente = new JLabel("Celular:");
		lblCelularCliente.setBounds(10, 152, 46, 14);
		panelDadosCliente.add(lblCelularCliente);
		lblCelularCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JPanel panelEnderecoCliente = new JPanel();
		panelEnderecoCliente.setBorder(new TitledBorder(null, "Endereço", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEnderecoCliente.setBounds(10, 270, 764, 165);
		getContentPane().add(panelEnderecoCliente);
		panelEnderecoCliente.setLayout(null);
		
		txtLogradouroCliente = new JTextField();
		txtLogradouroCliente.setBounds(10, 46, 412, 30);
		panelEnderecoCliente.add(txtLogradouroCliente);
		txtLogradouroCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLogradouroCliente.setColumns(10);
		
		JLabel lblLogradouroCliente = new JLabel("Logradouro:");
		lblLogradouroCliente.setBounds(10, 26, 72, 14);
		panelEnderecoCliente.add(lblLogradouroCliente);
		lblLogradouroCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		textField_8 = new JTextField();
		textField_8.setBounds(432, 46, 86, 30);
		panelEnderecoCliente.add(textField_8);
		textField_8.setColumns(10);
		
		JLabel lblNumEndCliente = new JLabel("Nº:");
		lblNumEndCliente.setBounds(432, 27, 46, 14);
		panelEnderecoCliente.add(lblNumEndCliente);
		lblNumEndCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtCompEndCliente = new JTextField();
		txtCompEndCliente.setBounds(528, 46, 226, 30);
		panelEnderecoCliente.add(txtCompEndCliente);
		txtCompEndCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCompEndCliente.setColumns(10);
		
		JLabel lblCompEndCliente = new JLabel("Complemento:");
		lblCompEndCliente.setBounds(528, 27, 101, 14);
		panelEnderecoCliente.add(lblCompEndCliente);
		lblCompEndCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblBairroCliente = new JLabel("Bairro:");
		lblBairroCliente.setBounds(10, 87, 56, 14);
		panelEnderecoCliente.add(lblBairroCliente);
		lblBairroCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtBairroCliente = new JTextField();
		txtBairroCliente.setBounds(10, 107, 226, 30);
		panelEnderecoCliente.add(txtBairroCliente);
		txtBairroCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtBairroCliente.setColumns(10);
		
		JLabel lblCidadeCliente = new JLabel("Cidade:");
		lblCidadeCliente.setBounds(245, 87, 46, 14);
		panelEnderecoCliente.add(lblCidadeCliente);
		lblCidadeCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtCidadeCliente = new JTextField();
		txtCidadeCliente.setBounds(246, 107, 212, 30);
		panelEnderecoCliente.add(txtCidadeCliente);
		txtCidadeCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCidadeCliente.setColumns(10);
		
		JComboBox cbUfCliente = new JComboBox();
		cbUfCliente.setBounds(468, 107, 74, 30);
		panelEnderecoCliente.add(cbUfCliente);
		cbUfCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		JLabel lblUfCliente = new JLabel("UF:");
		lblUfCliente.setBounds(467, 87, 46, 14);
		panelEnderecoCliente.add(lblUfCliente);
		lblUfCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		
		txtCepCliente = new JTextField();
		txtCepCliente.setBounds(552, 107, 169, 30);
		panelEnderecoCliente.add(txtCepCliente);
		txtCepCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCepCliente.setColumns(10);
		
		JLabel lblCepCliente = new JLabel("CEP:");
		lblCepCliente.setBounds(551, 88, 46, 14);
		panelEnderecoCliente.add(lblCepCliente);
		lblCepCliente.setFont(new Font("Tahoma", Font.PLAIN, 12));

	}
}
