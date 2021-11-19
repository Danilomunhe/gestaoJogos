package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {

	private Fabricante[] fabricantes;
	
	public FabricanteRepository() {
		fabricantes = new Fabricante[3];
		fabricantes[0] = new Fabricante("Activison", "28/02/2003", "Adam");
		fabricantes[1] = new Fabricante("Warner Games", "28/02/2003", "Adam");
		fabricantes[2] = new Fabricante("Ea Sports", "28/02/2003", "Adam");
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
