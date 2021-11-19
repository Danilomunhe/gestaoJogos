package br.senai.sp.jandira.model;

public class Jogo {

	private String titulo;
	private Fabricante fabricante;
	private boolean zerado;
	private Consoles console;
	private double valor;
	private String observacoes;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}
	public boolean isZerado() {
		return zerado;
	}

	public void setZerado(boolean zerado) {
		this.zerado = zerado;
	}

	public Consoles getConsole() {
		return console;
	}

	public void setConsole(Consoles console) {
		this.console = console;
	}

	public double getDecimal() {
		return valor;
	}

	public void setDecimal(double valor) {
		this.valor = valor;
	}

	public String getObservacoes() {
		return observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

}
