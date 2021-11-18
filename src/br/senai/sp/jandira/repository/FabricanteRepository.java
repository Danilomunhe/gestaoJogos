package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Fabricante;

public class FabricanteRepository {

	private Fabricante[] fabricantes;
	
	public FabricanteRepository() {
		fabricantes = new Fabricante[3];
		
		fabricantes[0].setNome("Activison");
		fabricantes[1].setNome("Sony");
		fabricantes[2].setNome("Ea");
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
