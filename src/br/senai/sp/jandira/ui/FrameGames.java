package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import br.senai.sp.jandira.model.Consoles;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JButton;

public class FrameGames extends JFrame {

	private JPanel contentPane;
	private JTextField txtTitulo;
	private JTextField txtFabricante;
	private JTextField txtValor;
	private JTextField txtObservacoes;

	public FrameGames() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 634, 454);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblTitulo = new JLabel("T\u00EDtulo do jogo:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTitulo.setBounds(10, 55, 95, 14);
		contentPane.add(lblTitulo);
		
		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFabricante.setBounds(10, 80, 69, 14);
		contentPane.add(lblFabricante);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("");
		chckbxNewCheckBox.setForeground(new Color(0, 255, 153));
		chckbxNewCheckBox.setBounds(52, 101, 39, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JLabel lblZerado = new JLabel("Zerado:");
		lblZerado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblZerado.setBounds(10, 106, 46, 14);
		contentPane.add(lblZerado);
		
		JComboBox comboBoxConsoles = new JComboBox();
		comboBoxConsoles.setModel(new DefaultComboBoxModel(Consoles.values()));
		comboBoxConsoles.setBounds(72, 128, 81, 22);
		contentPane.add(comboBoxConsoles);
		
		JLabel lblConsoles = new JLabel("Consoles:");
		lblConsoles.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblConsoles.setBounds(10, 131, 69, 14);
		contentPane.add(lblConsoles);
		
		JLabel lblNewLabel = new JLabel("Valor estimado:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel.setBounds(10, 156, 95, 14);
		contentPane.add(lblNewLabel);
		
		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacoes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblObservacoes.setBounds(10, 193, 81, 14);
		contentPane.add(lblObservacoes);
		
		JLabel lblNewLabel_1 = new JLabel("Meus Jogos:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblNewLabel_1.setBounds(323, 30, 69, 14);
		contentPane.add(lblNewLabel_1);
		
		txtTitulo = new JTextField();
		txtTitulo.setBounds(98, 53, 112, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);
		
		txtFabricante = new JTextField();
		txtFabricante.setBounds(72, 78, 138, 20);
		contentPane.add(txtFabricante);
		txtFabricante.setColumns(10);
		
		txtValor = new JTextField();
		txtValor.setBounds(98, 154, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);
		
		txtObservacoes = new JTextField();
		txtObservacoes.setBounds(98, 191, 148, 117);
		contentPane.add(txtObservacoes);
		txtObservacoes.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(322, 55, 138, 264);
		contentPane.add(scrollPane);
		
		JList list = new JList();
		scrollPane.setViewportView(list);
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalvar.setForeground(Color.BLACK);
		btnSalvar.setBackground(Color.CYAN);
		btnSalvar.setBounds(10, 344, 124, 40);
		contentPane.add(btnSalvar);
		
		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(320, 339, 89, 23);
		contentPane.add(btnVoltar);
		
		JButton btnAvancar = new JButton("Avan\u00E7ar");
		btnAvancar.setBounds(426, 339, 89, 23);
		contentPane.add(btnAvancar);
	}
}
