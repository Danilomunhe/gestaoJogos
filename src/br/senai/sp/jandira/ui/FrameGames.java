package br.senai.sp.jandira.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.JLabel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
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
import java.lang.reflect.Array;
import java.util.Arrays;

import javax.swing.JTextField;
import javax.swing.JScrollPane;
import javax.swing.JList;
import javax.swing.JOptionPane;

import java.awt.Color;
import javax.swing.JButton;

public class FrameGames extends JFrame {

	private JPanel contentPane;

	private JTextField txtTitulo;
	private JTextField txtValor;
	private JTextField txtObservacoes;
	private int posicao;

	public FrameGames() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 825, 516);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblTitulo = new JLabel("T\u00EDtulo do jogo:");
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblTitulo.setBounds(10, 78, 95, 14);
		contentPane.add(lblTitulo);

		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblFabricante.setBounds(10, 103, 69, 14);
		contentPane.add(lblFabricante);

		JComboBox comboFabricante = new JComboBox();
		DefaultComboBoxModel<String> modelFabricante = new DefaultComboBoxModel<String>();

		FabricanteRepository fabricantes = new FabricanteRepository();
		for (Fabricante f : fabricantes.listarTodosFabricantes()) {
			modelFabricante.addElement(f.getNome());
		}

		comboFabricante.setModel(modelFabricante);
		comboFabricante.setBounds(87, 100, 148, 23);
		contentPane.add(comboFabricante);

		JCheckBox checkBoxZerado = new JCheckBox("");
		checkBoxZerado.setForeground(new Color(0, 255, 153));
		checkBoxZerado.setBounds(66, 128, 39, 23);
		contentPane.add(checkBoxZerado);

		JLabel lblZerado = new JLabel("Zerado:");
		lblZerado.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblZerado.setBounds(10, 128, 46, 14);
		contentPane.add(lblZerado);

		JComboBox comboBoxConsoles = new JComboBox();
		DefaultComboBoxModel<String> modelConsoles = new DefaultComboBoxModel<String>();

		for (Consoles c : Consoles.values()) {
			modelConsoles.addElement(c.getDescricao());
		}

		comboBoxConsoles.setModel(modelConsoles);
		comboBoxConsoles.setBounds(76, 158, 112, 22);
		contentPane.add(comboBoxConsoles);

		JLabel lblConsoles = new JLabel("Consoles:");
		lblConsoles.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblConsoles.setBounds(10, 161, 69, 14);
		contentPane.add(lblConsoles);

		JLabel lblValor = new JLabel("Valor estimado:");
		lblValor.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblValor.setBounds(10, 196, 95, 14);
		contentPane.add(lblValor);

		JLabel lblObservacoes = new JLabel("Observa\u00E7\u00F5es:");
		lblObservacoes.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblObservacoes.setBounds(10, 252, 81, 14);
		contentPane.add(lblObservacoes);

		JLabel lblMeusJogos = new JLabel("Meus Jogos:");
		lblMeusJogos.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblMeusJogos.setBounds(344, 78, 69, 14);
		contentPane.add(lblMeusJogos);

		txtTitulo = new JTextField();
		txtTitulo.setBounds(99, 76, 112, 20);
		contentPane.add(txtTitulo);
		txtTitulo.setColumns(10);

		txtValor = new JTextField();
		txtValor.setBounds(98, 194, 86, 20);
		contentPane.add(txtValor);
		txtValor.setColumns(10);

		txtObservacoes = new JTextField();
		txtObservacoes.setBounds(87, 233, 148, 117);
		contentPane.add(txtObservacoes);
		txtObservacoes.setColumns(10);

		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(342, 102, 138, 264);
		contentPane.add(scrollPane);

		JList list = new JList();
		DefaultListModel<String> listJogos = new DefaultListModel<String>();
		list.setModel(listJogos);
		scrollPane.setViewportView(list);

		JButton btnSalvar = new JButton("Salvar jogo");
		btnSalvar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnSalvar.setForeground(Color.DARK_GRAY);
		btnSalvar.setBackground(Color.GREEN);
		btnSalvar.setBounds(10, 377, 124, 40);
		contentPane.add(btnSalvar);

		JButton btnVoltar = new JButton("Voltar");
		btnVoltar.setForeground(Color.DARK_GRAY);
		btnVoltar.setBackground(Color.RED);
		btnVoltar.setBounds(324, 387, 89, 23);
		btnVoltar.setEnabled(false);
		contentPane.add(btnVoltar);

		JButton btnAvancar = new JButton("Avan\u00E7ar");
		btnAvancar.setForeground(Color.DARK_GRAY);
		btnAvancar.setBackground(Color.RED);
		btnAvancar.setBounds(429, 387, 89, 23);
		btnAvancar.setEnabled(false);
		contentPane.add(btnAvancar);

		JLabel lblControleDeJogos = new JLabel("Controle de jogos");
		lblControleDeJogos.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblControleDeJogos.setBounds(293, 26, 207, 41);
		contentPane.add(lblControleDeJogos);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnLimpar.setForeground(Color.DARK_GRAY);
		btnLimpar.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnLimpar.setBackground(Color.GREEN);
		btnLimpar.setBounds(147, 377, 124, 40);
		contentPane.add(btnLimpar);


		GamesRepository colecaoJogos = new GamesRepository();

		
		
		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// Criando o objeto jogo e guardando no repositório
				Jogo jogo = new Jogo();

				jogo.setTitulo(txtTitulo.getText());
				jogo.setFabricante(fabricantes.listarFabricante(comboFabricante.getSelectedIndex()));
				jogo.setZerado(checkBoxZerado.isSelected());
				jogo.setObservacoes(txtObservacoes.getText());
				jogo.setDecimal(Double.parseDouble(txtValor.getText()));
				jogo.setConsole(determinarConsole(comboBoxConsoles.getSelectedIndex()));

				colecaoJogos.gravarJogo(jogo, posicao);
				posicao++;

				txtTitulo.setText("");
				txtValor.setText("");
				txtObservacoes.setText("");
				checkBoxZerado.setSelected(false);
				// Adiconando um elemento na lista
				listJogos.addElement(jogo.getTitulo());

				if (posicao == colecaoJogos.getTamanho()) {
					btnSalvar.setEnabled(false);
					btnSalvar.setBackground(Color.RED);
					JOptionPane.showMessageDialog(null, "A coleção está cheia", "Cheia", JOptionPane.WARNING_MESSAGE);
				}
				
			}
		});
		
		btnLimpar.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				txtTitulo.setText("");
				txtValor.setText("");
				txtObservacoes.setText("");
				checkBoxZerado.setSelected(false);
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
				comboFabricante.setSelectedIndex(
				Arrays.asList(fabricantes.listarTodosFabricantes()).indexOf(jogo.getFabricante()));
				
				btnAvancar.setEnabled(true);
				btnVoltar.setEnabled(true);
				btnAvancar.setBackground(Color.GREEN);
				btnVoltar.setBackground(Color.GREEN);
			}
		});

		btnAvancar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int valorDaLista = list.getSelectedIndex();
				list.setSelectedIndex(valorDaLista + 1);

			}
		});

		btnVoltar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				int valorDaLista = list.getSelectedIndex();
				list.setSelectedIndex(valorDaLista - 1);

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
