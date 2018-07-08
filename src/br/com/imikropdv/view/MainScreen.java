package br.com.imikropdv.view;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.BevelBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import java.awt.Color;


public class MainScreen extends JFrame {

	private static final long serialVersionUID = 1L;

	private JPanel cpPainelPrincipal;

	/*======================= VIEW COMPONENTS  =======================*/
	public MainScreen() {
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 800);
		
		JMenuBar mbMenuPrincipal = new JMenuBar();
		setJMenuBar(mbMenuPrincipal);
		
		JMenu menuCadastros = new JMenu("Cadastros");
		mbMenuPrincipal.add(menuCadastros);
		
		JMenuItem mnCadastrosClientes = new JMenuItem("Clientes");
		mnCadastrosClientes.setIcon(new ImageIcon(MainScreen.class.getResource("/br/com/imikropdv/images/addClients.png")));
		menuCadastros.add(mnCadastrosClientes);
		
		JMenuItem mnCadastrosFornecedores = new JMenuItem("Fornecedores");
		mnCadastrosFornecedores.setIcon(new ImageIcon(MainScreen.class.getResource("/br/com/imikropdv/images/addFornecedores.png")));
		menuCadastros.add(mnCadastrosFornecedores);
		
		JMenuItem mnCadastrosProdutos = new JMenuItem("Produtos");
		mnCadastrosProdutos.setIcon(new ImageIcon(MainScreen.class.getResource("/br/com/imikropdv/images/addProducts.png")));
		menuCadastros.add(mnCadastrosProdutos);
		
		JMenuItem mntmUsurios = new JMenuItem("Usuários");
		mntmUsurios.setIcon(new ImageIcon(MainScreen.class.getResource("/br/com/imikropdv/images/addUsers.png")));
		menuCadastros.add(mntmUsurios);
		
		JMenu menuEstoque = new JMenu("Estoque");
		mbMenuPrincipal.add(menuEstoque);
		
		JMenuItem mnEstoqueGerenciarEstoque = new JMenuItem("Gerenciar estoque");
		menuEstoque.add(mnEstoqueGerenciarEstoque);
		
		JMenu menuVendas = new JMenu("Vendas");
		mbMenuPrincipal.add(menuVendas);
		
		JMenuItem mnVendasAbrirPDV = new JMenuItem("Abrir PDV");
		menuVendas.add(mnVendasAbrirPDV);
		
		JMenu menuFinanceiro = new JMenu("Financeiro");
		mbMenuPrincipal.add(menuFinanceiro);
		
		JMenuItem mnFinanceiroContasPagar = new JMenuItem("Contas a pagar");
		menuFinanceiro.add(mnFinanceiroContasPagar);
		
		JMenuItem mnFinanceiroContasReceber = new JMenuItem("Contas a receber");
		menuFinanceiro.add(mnFinanceiroContasReceber);
		
		JMenuItem mnFinanceiroRelatorios = new JMenuItem("Relatórios");
		menuFinanceiro.add(mnFinanceiroRelatorios);
		
		JMenu menuConfiguraes = new JMenu("Configurações");
		mbMenuPrincipal.add(menuConfiguraes);
		
		JMenuItem mnConfigGerais = new JMenuItem("Gerais");
		menuConfiguraes.add(mnConfigGerais);
		
		JMenu menuSobre = new JMenu("Sobre");
		mbMenuPrincipal.add(menuSobre);
		
		JMenuItem mnSobreIMikro = new JMenuItem("Sobre a iMikro PDV");
		menuSobre.add(mnSobreIMikro);
		
		JMenu menuAjuda = new JMenu("Ajuda");
		mbMenuPrincipal.add(menuAjuda);
		
		JMenuItem mnAjudaInstrucoes = new JMenuItem("Instruções");
		menuAjuda.add(mnAjudaInstrucoes);
		cpPainelPrincipal = new JPanel();
		cpPainelPrincipal.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(cpPainelPrincipal);
		cpPainelPrincipal.setLayout(null);
		
		JPanel panelTopoPrincipal = new JPanel();
		panelTopoPrincipal.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panelTopoPrincipal.setBounds(10, 11, 998, 68);
		cpPainelPrincipal.add(panelTopoPrincipal);
		panelTopoPrincipal.setLayout(null);
		
		JLabel lblLogotipo = new JLabel("");
		lblLogotipo.setBounds(20, 13, 143, 44);
		ImageIcon logo = new ImageIcon(ViewLogin.class.getResource("/br/com/imikropdv/images/logotipo.png"));
		Image imageLogo = logo.getImage().getScaledInstance(lblLogotipo.getWidth(), lblLogotipo.getHeight(), Image.SCALE_SMOOTH);
		lblLogotipo.setIcon(new ImageIcon(imageLogo));
		panelTopoPrincipal.add(lblLogotipo);
		
		JLabel lblBemVindo = new JLabel("Bem vindo(a),");
		lblBemVindo.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblBemVindo.setBounds(732, 27, 94, 17);
		panelTopoPrincipal.add(lblBemVindo);
		
		JPanel panelDesktop = new JPanel();
		panelDesktop.setBackground(Color.GRAY);
		panelDesktop.setBounds(10, 92, 998, 647);
		cpPainelPrincipal.add(panelDesktop);
		panelDesktop.setLayout(null);
	}
}
