package br.senai.sp.jandira.model;

public enum Consoles {

	PS4("Ps4",2780.0,"20/02/2014"),
	PS5("Ps5",4900.0, "20/02/2014"),
	XBOXONE("Xbox One",2500.0,"20/02/2014"),
	XBOXSERIESX("Xbox Series X", 3800.0, "20/02/2014");
	
	
	private String descricao;
	private double valor;
	private String anoDeLancamento;
	
	 private Consoles(String descricao, double valor, String anoDeLancamento) {
     this.descricao = descricao;
     this.valor = valor;
     this.anoDeLancamento = anoDeLancamento;
	}
	 public String getDescricao() {
			return descricao;
		}
	 public double getValor() {
		 return valor;
	 }
	 public String getAnoDeLancamento() {
		 return anoDeLancamento;
	 }
}
