package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {

	private Fabricante[] fabricantes;
	
	public FabricanteRepository() {
		fabricantes = new Fabricante[3];
		fabricantes[0] = new Fabricante("Activison", "01/10/1979", "Larry Kaplan ");
		fabricantes[1] = new Fabricante("Warner Games", "14/01/2004", "Jace Hall");
		fabricantes[2] = new Fabricante("Ea Sports", "1991", "Electronic Arts");
	}
	public FabricanteRepository(int quantidadeFabricantes) {
		fabricantes = new Fabricante[quantidadeFabricantes];
	}
	public void gravarFabricante(Fabricante fabricante, int posicao) {
		fabricantes[posicao] = fabricante; 
	}
	public Fabricante listarFabricante(int posicao) {
		return fabricantes[posicao];
	}
	public Fabricante[] listarTodosFabricantes() {
		return fabricantes;
	}
}
