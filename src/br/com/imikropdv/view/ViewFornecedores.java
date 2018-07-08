package br.com.imikropdv.view;

import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.TitledBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ViewFornecedores extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtCodigoForncedor;
	private JTextField txtNomeFornecedor;
	private JTextField txtCnpjFornecedor;
	private JTextField textField;
	private JTextField txtTelefone2Fornecedor;
	private JTextField txtEmailFornecedor;
	private JTextField txtLogradouroFornecedor;
	private JTextField txtNumEndFornecedor;
	private JTextField txtCompEndFornecedor;
	private JTextField txtBairroFornecedor;
	private JTextField txtCidadeFornecedor;
	private JTextField txtCepFornecedor;
	private JTable tblListaFornecedores;

	/*======================= VIEW COMPONENTS  =======================*/
	public ViewFornecedores() {
		setClosable(true);
		setTitle("Fornecedores");
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		setBounds(100, 100, 800, 760);
		getContentPane().setLayout(null);
		
		JPanel panelInfoFornecedores = new JPanel();
		panelInfoFornecedores.setBorder(new TitledBorder(null, "Fornecedor", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelInfoFornecedores.setBounds(10, 29, 764, 226);
		getContentPane().add(panelInfoFornecedores);
		panelInfoFornecedores.setLayout(null);
		
		JLabel lblCodigoFornecedor = new JLabel("Código:");
		lblCodigoFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodigoFornecedor.setBounds(10, 24, 53, 14);
		panelInfoFornecedores.add(lblCodigoFornecedor);
		
		txtCodigoForncedor = new JTextField();
		txtCodigoForncedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCodigoForncedor.setBounds(10, 49, 127, 28);
		panelInfoFornecedores.add(txtCodigoForncedor);
		txtCodigoForncedor.setColumns(10);
		
		JLabel lblNomeForncedor = new JLabel("Nome:");
		lblNomeForncedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNomeForncedor.setBounds(147, 24, 46, 14);
		panelInfoFornecedores.add(lblNomeForncedor);
		
		txtNomeFornecedor = new JTextField();
		txtNomeFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNomeFornecedor.setBounds(147, 49, 369, 28);
		panelInfoFornecedores.add(txtNomeFornecedor);
		txtNomeFornecedor.setColumns(10);
		
		JLabel lblTipoDeFornecedor = new JLabel("Tipo de fornecedor:");
		lblTipoDeFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTipoDeFornecedor.setBounds(523, 25, 127, 14);
		panelInfoFornecedores.add(lblTipoDeFornecedor);
		
		JComboBox cbTipoFornecedor = new JComboBox();
		cbTipoFornecedor.setModel(new DefaultComboBoxModel(new String[] {"Pessoa f\u00EDsica", "Pessoa Jur\u00EDdica"}));
		cbTipoFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbTipoFornecedor.setBounds(526, 49, 124, 28);
		panelInfoFornecedores.add(cbTipoFornecedor);
		
		JLabel lblSituacaoFornecedor = new JLabel("Situação:");
		lblSituacaoFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblSituacaoFornecedor.setBounds(660, 25, 69, 14);
		panelInfoFornecedores.add(lblSituacaoFornecedor);
		
		JComboBox cbSituacaoFornecedor = new JComboBox();
		cbSituacaoFornecedor.setModel(new DefaultComboBoxModel(new String[] {"Ativo", "Inativo"}));
		cbSituacaoFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbSituacaoFornecedor.setBounds(660, 49, 94, 28);
		panelInfoFornecedores.add(cbSituacaoFornecedor);
		
		JLabel lblCnpjFornecedor = new JLabel("CNPJ:");
		lblCnpjFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCnpjFornecedor.setBounds(10, 88, 46, 14);
		panelInfoFornecedores.add(lblCnpjFornecedor);
		
		txtCnpjFornecedor = new JTextField();
		txtCnpjFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCnpjFornecedor.setBounds(10, 113, 183, 28);
		panelInfoFornecedores.add(txtCnpjFornecedor);
		txtCnpjFornecedor.setColumns(10);
		
		JLabel lblTelefoneFonecedor = new JLabel("Telefone:");
		lblTelefoneFonecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefoneFonecedor.setBounds(205, 89, 69, 14);
		panelInfoFornecedores.add(lblTelefoneFonecedor);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(203, 113, 201, 28);
		panelInfoFornecedores.add(textField);
		textField.setColumns(10);
		
		JLabel lblTelefone2Fornecedor = new JLabel("Telefone 2:");
		lblTelefone2Fornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTelefone2Fornecedor.setBounds(414, 88, 85, 14);
		panelInfoFornecedores.add(lblTelefone2Fornecedor);
		
		txtTelefone2Fornecedor = new JTextField();
		txtTelefone2Fornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtTelefone2Fornecedor.setBounds(414, 113, 201, 28);
		panelInfoFornecedores.add(txtTelefone2Fornecedor);
		txtTelefone2Fornecedor.setColumns(10);
		
		JLabel lblEmailFornecedor = new JLabel("E-mail:");
		lblEmailFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmailFornecedor.setBounds(10, 152, 46, 14);
		panelInfoFornecedores.add(lblEmailFornecedor);
		
		txtEmailFornecedor = new JTextField();
		txtEmailFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtEmailFornecedor.setBounds(10, 177, 311, 28);
		panelInfoFornecedores.add(txtEmailFornecedor);
		txtEmailFornecedor.setColumns(10);
		
		JPanel panelEndereçoFornecedor = new JPanel();
		panelEndereçoFornecedor.setBorder(new TitledBorder(null, "Endereço", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelEndereçoFornecedor.setBounds(10, 266, 764, 176);
		getContentPane().add(panelEndereçoFornecedor);
		panelEndereçoFornecedor.setLayout(null);
		
		JLabel lblLogradouroFornecedor = new JLabel("Logradouro:");
		lblLogradouroFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblLogradouroFornecedor.setBounds(10, 28, 81, 14);
		panelEndereçoFornecedor.add(lblLogradouroFornecedor);
		
		txtLogradouroFornecedor = new JTextField();
		txtLogradouroFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtLogradouroFornecedor.setBounds(10, 53, 453, 28);
		panelEndereçoFornecedor.add(txtLogradouroFornecedor);
		txtLogradouroFornecedor.setColumns(10);
		
		JLabel lblNumEndFornecedor = new JLabel("Nº:");
		lblNumEndFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNumEndFornecedor.setBounds(473, 28, 46, 14);
		panelEndereçoFornecedor.add(lblNumEndFornecedor);
		
		txtNumEndFornecedor = new JTextField();
		txtNumEndFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNumEndFornecedor.setBounds(473, 53, 68, 28);
		panelEndereçoFornecedor.add(txtNumEndFornecedor);
		txtNumEndFornecedor.setColumns(10);
		
		JLabel lblCompEndFornecedor = new JLabel("Complemento:");
		lblCompEndFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCompEndFornecedor.setBounds(551, 29, 92, 14);
		panelEndereçoFornecedor.add(lblCompEndFornecedor);
		
		txtCompEndFornecedor = new JTextField();
		txtCompEndFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCompEndFornecedor.setBounds(551, 53, 203, 28);
		panelEndereçoFornecedor.add(txtCompEndFornecedor);
		txtCompEndFornecedor.setColumns(10);
		
		JLabel lblBairroFornecedor = new JLabel("Bairro:");
		lblBairroFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblBairroFornecedor.setBounds(10, 92, 46, 14);
		panelEndereçoFornecedor.add(lblBairroFornecedor);
		
		txtBairroFornecedor = new JTextField();
		txtBairroFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtBairroFornecedor.setBounds(10, 117, 227, 28);
		panelEndereçoFornecedor.add(txtBairroFornecedor);
		txtBairroFornecedor.setColumns(10);
		
		JLabel lblCidadeFornecedor = new JLabel("Cidade:");
		lblCidadeFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCidadeFornecedor.setBounds(246, 93, 46, 14);
		panelEndereçoFornecedor.add(lblCidadeFornecedor);
		
		txtCidadeFornecedor = new JTextField();
		txtCidadeFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCidadeFornecedor.setBounds(247, 117, 203, 28);
		panelEndereçoFornecedor.add(txtCidadeFornecedor);
		txtCidadeFornecedor.setColumns(10);
		
		JLabel lblUfFornecedor = new JLabel("UF:");
		lblUfFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblUfFornecedor.setBounds(457, 93, 46, 14);
		panelEndereçoFornecedor.add(lblUfFornecedor);
		
		JComboBox cbUfFornecedor = new JComboBox();
		cbUfFornecedor.setModel(new DefaultComboBoxModel(new String[] {"AC", "AL", "AP", "AM", "BA", "CE", "DF", "ES", "GO", "MA", "MT", "MS", "MG", "PA", "PB", "PR", "PE", "PI", "RJ", "RN", "RS", "RO", "RR", "SC", "SP", "SE", "TO"}));
		cbUfFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbUfFornecedor.setBounds(460, 117, 81, 28);
		panelEndereçoFornecedor.add(cbUfFornecedor);
		
		JLabel lblCepFornecedor = new JLabel("CEP:");
		lblCepFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCepFornecedor.setBounds(551, 92, 46, 14);
		panelEndereçoFornecedor.add(lblCepFornecedor);
		
		txtCepFornecedor = new JTextField();
		txtCepFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCepFornecedor.setBounds(551, 117, 162, 28);
		panelEndereçoFornecedor.add(txtCepFornecedor);
		txtCepFornecedor.setColumns(10);
		
		JScrollPane spListaFornecedores = new JScrollPane();
		spListaFornecedores.setBounds(10, 469, 764, 170);
		getContentPane().add(spListaFornecedores);
		
		tblListaFornecedores = new JTable();
		tblListaFornecedores.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spListaFornecedores.setViewportView(tblListaFornecedores);
		tblListaFornecedores.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null},
			},
			new String[] {
				"C\u00F3digo", "Nome", "Tipo de fornecedor", "Situa\u00E7\u00E3o", "CNPJ", "Telefone", "Telefone 2", "E-mail"
			}
		));
		
		JButton btnExcluirFornecedor = new JButton("Excluir");
		btnExcluirFornecedor.setIcon(new ImageIcon(ViewFornecedores.class.getResource("/br/com/imikropdv/images/cancel.png")));
		btnExcluirFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluirFornecedor.setBounds(10, 672, 110, 30);
		getContentPane().add(btnExcluirFornecedor);
		
		JButton btnNovoFornecedor = new JButton("Novo");
		btnNovoFornecedor.setIcon(new ImageIcon(ViewFornecedores.class.getResource("/br/com/imikropdv/images/new.png")));
		btnNovoFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNovoFornecedor.setBounds(130, 672, 110, 30);
		getContentPane().add(btnNovoFornecedor);
		
		JButton btnAlterarFornecedor = new JButton("Alterar");
		btnAlterarFornecedor.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnAlterarFornecedor.setIcon(new ImageIcon(ViewFornecedores.class.getResource("/br/com/imikropdv/images/alter.png")));
		btnAlterarFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterarFornecedor.setBounds(544, 672, 110, 30);
		getContentPane().add(btnAlterarFornecedor);
		
		JButton btnSalvarFornecedor = new JButton("Salvar");
		btnSalvarFornecedor.setIcon(new ImageIcon(ViewFornecedores.class.getResource("/br/com/imikropdv/images/save.png")));
		btnSalvarFornecedor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalvarFornecedor.setBounds(664, 672, 110, 30);
		getContentPane().add(btnSalvarFornecedor);

	}
}
