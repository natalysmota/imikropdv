package br.com.imikropdv.view;

import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class ViewProdutos extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtNomeProduto;
	private JTextField txtCodigoProduto;
	private JTextField txtPrecoCompraProduto;
	private JTextField txtPrecoAtacadoProduto;
	private JTextField txtPrecoVendaProduto;
	private JTextField txtMargemLucroProduto;
	private JTextField txtMarcaProduto;
	private JTextField textField;

	/*======================= VIEW COMPONENTS  =======================*/
	public ViewProdutos() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		setTitle("Produtos");
		setBounds(100, 100, 800, 490);
		getContentPane().setLayout(null);
		
		JPanel panelDadosProduto = new JPanel();
		panelDadosProduto.setBorder(new TitledBorder(null, "Produto", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelDadosProduto.setBounds(10, 31, 764, 355);
		getContentPane().add(panelDadosProduto);
		panelDadosProduto.setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNome.setBounds(120, 26, 46, 14);
		panelDadosProduto.add(lblNome);
		
		txtNomeProduto = new JTextField();
		txtNomeProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtNomeProduto.setBounds(120, 51, 440, 30);
		panelDadosProduto.add(txtNomeProduto);
		txtNomeProduto.setColumns(10);
		
		JLabel lblCodigoProduto = new JLabel("Código:");
		lblCodigoProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblCodigoProduto.setBounds(10, 26, 46, 14);
		panelDadosProduto.add(lblCodigoProduto);
		
		txtCodigoProduto = new JTextField();
		txtCodigoProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtCodigoProduto.setBounds(10, 51, 100, 30);
		panelDadosProduto.add(txtCodigoProduto);
		txtCodigoProduto.setColumns(10);
		
		JLabel lblFornecedorProduto = new JLabel("Fornecedor:");
		lblFornecedorProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFornecedorProduto.setBounds(568, 27, 84, 14);
		panelDadosProduto.add(lblFornecedorProduto);
		
		JComboBox cbFornecedoresProduto = new JComboBox();
		cbFornecedoresProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbFornecedoresProduto.setBounds(570, 51, 140, 30);
		panelDadosProduto.add(cbFornecedoresProduto);
		
		JLabel lblQtdeEmEstoqueProduto = new JLabel("Qtde. em estoque:");
		lblQtdeEmEstoqueProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblQtdeEmEstoqueProduto.setBounds(331, 91, 118, 14);
		panelDadosProduto.add(lblQtdeEmEstoqueProduto);
		
		JSpinner spQtdeEmEstoqueProduto = new JSpinner();
		spQtdeEmEstoqueProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		spQtdeEmEstoqueProduto.setBounds(331, 116, 60, 30);
		panelDadosProduto.add(spQtdeEmEstoqueProduto);
		
		JLabel lblMedidaProduto = new JLabel("Medida:");
		lblMedidaProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMedidaProduto.setBounds(244, 92, 46, 14);
		panelDadosProduto.add(lblMedidaProduto);
		
		JComboBox cbMedidaProduto = new JComboBox();
		cbMedidaProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbMedidaProduto.setModel(new DefaultComboBoxModel(new String[] {"Kg", "g"}));
		cbMedidaProduto.setBounds(244, 116, 77, 30);
		panelDadosProduto.add(cbMedidaProduto);
		
		JLabel lblPrecoCompraProduto = new JLabel("Preço de compra:");
		lblPrecoCompraProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrecoCompraProduto.setBounds(10, 157, 110, 14);
		panelDadosProduto.add(lblPrecoCompraProduto);
		
		txtPrecoCompraProduto = new JTextField();
		txtPrecoCompraProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPrecoCompraProduto.setBounds(10, 182, 77, 30);
		panelDadosProduto.add(txtPrecoCompraProduto);
		txtPrecoCompraProduto.setColumns(10);
		
		JLabel lblPrecoVendaProduto = new JLabel("Preço de venda:");
		lblPrecoVendaProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrecoVendaProduto.setBounds(139, 157, 100, 14);
		panelDadosProduto.add(lblPrecoVendaProduto);
		
		JLabel lblEmEstoqueProduto = new JLabel("Em estoque:");
		lblEmEstoqueProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblEmEstoqueProduto.setBounds(459, 92, 86, 14);
		panelDadosProduto.add(lblEmEstoqueProduto);
		
		JComboBox cbEmEstoqueProduto = new JComboBox();
		cbEmEstoqueProduto.setModel(new DefaultComboBoxModel(new String[] {"Sim", "N\u00E3o"}));
		cbEmEstoqueProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		cbEmEstoqueProduto.setBounds(459, 116, 77, 30);
		panelDadosProduto.add(cbEmEstoqueProduto);
		
		JLabel lblPrecoAtacadoProduto = new JLabel("Preço do atacado:");
		lblPrecoAtacadoProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPrecoAtacadoProduto.setBounds(249, 157, 118, 14);
		panelDadosProduto.add(lblPrecoAtacadoProduto);
		
		txtPrecoAtacadoProduto = new JTextField();
		txtPrecoAtacadoProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPrecoAtacadoProduto.setBounds(249, 181, 77, 31);
		panelDadosProduto.add(txtPrecoAtacadoProduto);
		txtPrecoAtacadoProduto.setColumns(10);
		
		txtPrecoVendaProduto = new JTextField();
		txtPrecoVendaProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPrecoVendaProduto.setBounds(139, 182, 77, 30);
		panelDadosProduto.add(txtPrecoVendaProduto);
		txtPrecoVendaProduto.setColumns(10);
		
		JLabel lblMargemLucroProduto = new JLabel("Margem de lucro (%):");
		lblMargemLucroProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMargemLucroProduto.setBounds(365, 157, 140, 14);
		panelDadosProduto.add(lblMargemLucroProduto);
		
		txtMargemLucroProduto = new JTextField();
		txtMargemLucroProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtMargemLucroProduto.setBounds(365, 181, 77, 31);
		panelDadosProduto.add(txtMargemLucroProduto);
		txtMargemLucroProduto.setColumns(10);
		
		JLabel lblMarcaProduto = new JLabel("Marca do produto:");
		lblMarcaProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMarcaProduto.setBounds(10, 92, 110, 14);
		panelDadosProduto.add(lblMarcaProduto);
		
		txtMarcaProduto = new JTextField();
		txtMarcaProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtMarcaProduto.setBounds(10, 117, 224, 30);
		panelDadosProduto.add(txtMarcaProduto);
		txtMarcaProduto.setColumns(10);
		
		JLabel lblDescricaoProduto = new JLabel("Descrição:");
		lblDescricaoProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblDescricaoProduto.setBounds(10, 223, 77, 14);
		panelDadosProduto.add(lblDescricaoProduto);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 12));
		textField.setBounds(10, 248, 439, 80);
		panelDadosProduto.add(textField);
		textField.setColumns(10);
		
		JButton btnExcluirProduto = new JButton("Excluir");
		btnExcluirProduto.setIcon(new ImageIcon(ViewProdutos.class.getResource("/br/com/imikropdv/images/cancel.png")));
		btnExcluirProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluirProduto.setBounds(10, 408, 108, 30);
		getContentPane().add(btnExcluirProduto);
		
		JButton btnNovoProduto = new JButton("Novo");
		btnNovoProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnNovoProduto.setIcon(new ImageIcon(ViewProdutos.class.getResource("/br/com/imikropdv/images/new.png")));
		btnNovoProduto.setBounds(128, 408, 108, 30);
		getContentPane().add(btnNovoProduto);
		
		JButton btnSalvarProduto = new JButton("Salvar");
		btnSalvarProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalvarProduto.setIcon(new ImageIcon(ViewProdutos.class.getResource("/br/com/imikropdv/images/save.png")));
		btnSalvarProduto.setBounds(666, 406, 108, 30);
		getContentPane().add(btnSalvarProduto);
		
		JButton btnAlterarProduto = new JButton("Alterar");
		btnAlterarProduto.setIcon(new ImageIcon(ViewProdutos.class.getResource("/br/com/imikropdv/images/alter.png")));
		btnAlterarProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAlterarProduto.setBounds(548, 406, 108, 30);
		getContentPane().add(btnAlterarProduto);

	}
}
