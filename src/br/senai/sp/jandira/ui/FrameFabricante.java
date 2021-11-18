package br.senai.sp.jandira.ui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.repository.FabricanteRepository;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class FrameFabricante extends JFrame {

	private JPanel contentPane;
	private JTextField txtFundador;
	private JTextField txtAnoDeFundacao;
	private JTextField txtFabricante;
	private JButton btnSalvar;
	private int posicao;
	private String[] fabricantesLista;

	public FrameFabricante() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFabricante = new JLabel("Fabricante:");
		lblFabricante.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFabricante.setBounds(10, 23, 74, 14);
		contentPane.add(lblFabricante);

		JLabel lblAnoDeFundacao = new JLabel("Ano de Funda\u00E7\u00E3o");
		lblAnoDeFundacao.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblAnoDeFundacao.setBounds(10, 60, 118, 14);
		contentPane.add(lblAnoDeFundacao);

		JLabel lblFundador = new JLabel("Fundador");
		lblFundador.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFundador.setBounds(10, 85, 62, 14);
		contentPane.add(lblFundador);

		txtFundador = new JTextField();
		txtFundador.setBounds(82, 85, 86, 20);
		contentPane.add(txtFundador);
		txtFundador.setColumns(10);

		txtAnoDeFundacao = new JTextField();
		txtAnoDeFundacao.setBounds(128, 57, 86, 20);
		contentPane.add(txtAnoDeFundacao);
		txtAnoDeFundacao.setColumns(10);

		txtFabricante = new JTextField();
		txtFabricante.setBounds(82, 20, 86, 20);
		contentPane.add(txtFabricante);
		txtFabricante.setColumns(10);

		btnSalvar = new JButton("Salvar Fabricante");
		btnSalvar.setBounds(10, 137, 131, 33);
		contentPane.add(btnSalvar);

		FabricanteRepository fabricantes = new FabricanteRepository();
		
		btnSalvar.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				Fabricante fabricante = new Fabricante();
				fabricante.setNome(txtFabricante.getText());
				fabricante.setAnoDeFundacao(txtAnoDeFundacao.getText());
				fabricante.setFundador(txtFundador.getText());

				fabricantes.gravarFabricante(fabricante, posicao);
				posicao++;
				
				for (Fabricante fa : fabricantes.listarTodosFabricantes())
	           fabricantesLista[5] = fa.getNome();
			}
		});
	}
	public String[] devolverFabricantes() {
		return fabricantesLista;
	}
}
