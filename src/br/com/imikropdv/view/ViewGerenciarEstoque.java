package br.com.imikropdv.view;

import javax.swing.JInternalFrame;
import java.awt.Font;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;

public class ViewGerenciarEstoque extends JInternalFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtPesquisarProduto;
	private JTable tblListaProdutos;

	/*======================= VIEW COMPONENTS  =======================*/
	public ViewGerenciarEstoque() {
		getContentPane().setFont(new Font("Tahoma", Font.PLAIN, 12));
		setClosable(true);
		setTitle("Gerenciar estoque");
		setBounds(100, 100, 900, 580);
		getContentPane().setLayout(null);
		
		JPanel panelGerenciarEstoque = new JPanel();
		panelGerenciarEstoque.setBorder(new TitledBorder(null, "Estoque", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelGerenciarEstoque.setBounds(10, 11, 864, 122);
		getContentPane().add(panelGerenciarEstoque);
		panelGerenciarEstoque.setLayout(null);
		
		JLabel lblPesquisarProduto = new JLabel("Pesquisar:");
		lblPesquisarProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblPesquisarProduto.setBounds(10, 34, 64, 14);
		panelGerenciarEstoque.add(lblPesquisarProduto);
		
		txtPesquisarProduto = new JTextField();
		txtPesquisarProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		txtPesquisarProduto.setBounds(73, 27, 731, 30);
		panelGerenciarEstoque.add(txtPesquisarProduto);
		txtPesquisarProduto.setColumns(10);
		
		JButton btnAdicionarProduto = new JButton("Adicionar produto");
		btnAdicionarProduto.setIcon(new ImageIcon(ViewGerenciarEstoque.class.getResource("/br/com/imikropdv/images/addProducts.png")));
		btnAdicionarProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnAdicionarProduto.setBounds(73, 68, 160, 30);
		panelGerenciarEstoque.add(btnAdicionarProduto);
		
		JButton btnExcluirProduto = new JButton("Excluir produto");
		btnExcluirProduto.setIcon(new ImageIcon(ViewGerenciarEstoque.class.getResource("/br/com/imikropdv/images/cancel.png")));
		btnExcluirProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnExcluirProduto.setBounds(243, 68, 160, 30);
		panelGerenciarEstoque.add(btnExcluirProduto);
		
		JButton btnPesquisarProduto = new JButton("");
		btnPesquisarProduto.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnPesquisarProduto.setIcon(new ImageIcon(ViewGerenciarEstoque.class.getResource("/br/com/imikropdv/images/search.png")));
		btnPesquisarProduto.setBounds(814, 27, 40, 30);
		panelGerenciarEstoque.add(btnPesquisarProduto);
		
		JPanel panelListaProdutos = new JPanel();
		panelListaProdutos.setBorder(new TitledBorder(null, "Lista de produtos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panelListaProdutos.setBounds(10, 144, 864, 395);
		getContentPane().add(panelListaProdutos);
		panelListaProdutos.setLayout(null);
		
		JScrollPane spListaProdutos = new JScrollPane();
		spListaProdutos.setBounds(10, 34, 844, 350);
		panelListaProdutos.add(spListaProdutos);
		
		tblListaProdutos = new JTable();
		spListaProdutos.setViewportView(tblListaProdutos);
		tblListaProdutos.setModel(new DefaultTableModel(
			new Object[][] {
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
				{null, null, null, null, null, null, null, null, null, null, null, null},
			},
			new String[] {
				"Código", "Nome", "Fornecedor", "Marca", "Medida", "Qtde. em estoque", "Em estoque", "Preço de compra", "Preço de venda", "Preço do atacado", "Margem de lucro(%)", "Descrição"
			}
		));
		tblListaProdutos.setFont(new Font("Tahoma", Font.PLAIN, 12));

	}
}
