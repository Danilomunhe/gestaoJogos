package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;

import br.senai.sp.jandira.model.Consoles;
import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.repository.GamesRepository;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import java.awt.Color;
import javax.swing.JButton;

public class FrameGames extends JFrame {

	private JPanel contentPane;
	private JPanel contentPane2;
	private JTextField txtTitulo;
	private JTextField txtValor;
	private JTextField txtObservacoes;
	private int posicao;

	public FrameGames() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 684, 468);
		contentPane = new JPanel();
		contentPane.setBackground(Color.LIGHT_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("T\u00EDtulo do jogo:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTitulo.setBounds(10, 45, 95, 14);
		contentPane.add(lblTitulo);

		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFabricante.setBounds(10, 70, 69, 14);
		contentPane.add(lblFabricante);

		FabricanteRepository listaFabricantes = new FabricanteRepository();
		JComboBox comboFabricante = new JComboBox();
		DefaultListModel<String> modelFabricante = new DefaultListModel<String>();
          
		for(Fabricante fa : listaFabricantes.listarTodosFabricantes()) {
			modelFabricante.addElement(fa.getNome());
		}


		comboFabricante.setBounds(76, 67, 148, 23);
		contentPane.add(comboFabricante);

		JCheckBox checkBoxZerado = new JCheckBox("");
		checkBoxZerado.setForeground(new Color(0, 255, 153));
		checkBoxZerado.setBounds(52, 101, 39, 23);
		contentPane.add(checkBoxZerado);

		JLabel lblZerado = new JLabel("Zerado:");
		lblZerado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblZerado.setBounds(10, 106, 46, 14);
		contentPane.add(lblZerado);

		JComboBox comboBoxConsoles = new JComboBox();
		DefaultComboBoxModel<String> modelConsoles = new DefaultComboBoxModel<String>();

		for (Consoles c : Consoles.values()) {
			modelConsoles.addElement(c.getDescricao());
		}

		comboBoxConsoles.setModel(modelConsoles);
		comboBoxConsoles.setBounds(72, 128, 112, 22);
		contentPane.add(comboBoxConsoles);

		JLabel lblConsoles = new JLabel("Consoles:");
		lblConsoles.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblConsoles.setBounds(10, 131, 69, 14);
		contentPane.add(lblConsoles);

		JLabel lblValor = new JLabel("Valor estimado:");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValor.setBounds(10, 156, 95, 14);
		contentPane.add(lblValor);

		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacoes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblObservacoes.setBounds(10, 193, 81, 14);
		contentPane.add(lblObservacoes);

		JLabel lblMeusJogos = new JLabel("Meus Jogos:");
		lblMeusJogos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMeusJogos.setBounds(323, 30, 69, 14);
		contentPane.add(lblMeusJogos);

		txtTitulo = new JTextField();
		txtTitulo.setBounds(98, 43, 112, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);

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
		DefaultListModel<String> listJogos = new DefaultListModel<String>();
		list.setModel(listJogos);
		scrollPane.setViewportView(list);

		JButton btnSalvar = new JButton("Salvar jogo");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalvar.setForeground(Color.BLUE);
		btnSalvar.setBackground(Color.CYAN);
		btnSalvar.setBounds(10, 344, 124, 40);
		contentPane.add(btnSalvar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setBounds(320, 339, 89, 23);
		contentPane.add(btnVoltar);

		JButton btnAvancar = new JButton("Avan\u00E7ar");
		btnAvancar.setBounds(426, 339, 89, 23);
		contentPane.add(btnAvancar);

		JButton btnAdicionarFabricante = new JButton("Adiconar Fabricante");
		btnAdicionarFabricante.setBackground(Color.CYAN);
		btnAdicionarFabricante.setBounds(146, 344, 138, 40);
		contentPane.add(btnAdicionarFabricante);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 668, 429);
		contentPane.add(panel);
		panel.setLayout(null);

		setVisible(true);

		GamesRepository colecaoJogos = new GamesRepository();

		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Criando o objeto jogo e guardando no repositório
				Jogo jogo = new Jogo();

				jogo.setTitulo(txtTitulo.getText());
				jogo.setZerado(checkBoxZerado.isSelected());
				jogo.setObservacoes(txtObservacoes.getText());
				jogo.setDecimal(Double.parseDouble(txtValor.getText()));
				jogo.setConsole(determinarConsole(comboBoxConsoles.getSelectedIndex()));

				colecaoJogos.gravarJogo(jogo, posicao);
				posicao++;
				System.out.println(colecaoJogos.listarJogo(0).getTitulo());

				// Adiconando um elemento na lista
				listJogos.addElement(jogo.getTitulo());
			}
		});


		list.addListSelectionListener(new ListSelectionListener() {

			@Override
			public void valueChanged(ListSelectionEvent e) {
				Jogo jogo = colecaoJogos.listarJogo(list.getSelectedIndex());
				txtTitulo.setText(jogo.getTitulo());
				txtValor.setText(Double.toString(jogo.getDecimal()));
				txtObservacoes.setText(jogo.getObservacoes());
				checkBoxZerado.setSelected(jogo.isZerado());
				comboBoxConsoles.setSelectedIndex(jogo.getConsole().ordinal());

			}
		});

	}

	private Consoles determinarConsole(int consoleSeleiconado) {
		if (consoleSeleiconado == 0) {
			return Consoles.PS4;
		} else if (consoleSeleiconado == 1) {
			return Consoles.PS5;
		} else if (consoleSeleiconado == 2) {
			return Consoles.XBOXONE;
		} else {
			return Consoles.XBOXSERIESX;
		}
	}
}
