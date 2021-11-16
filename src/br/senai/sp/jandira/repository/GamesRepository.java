package br.senai.sp.jandira.repository;

import br.senai.sp.jandira.model.Jogo;

public class GamesRepository {

	private Jogo[] colecaoGames;

	public GamesRepository() {
		colecaoGames = new Jogo[32];
	}

	public GamesRepository(int quatidadeDeJogos) {
		colecaoGames = new Jogo[quatidadeDeJogos];
	}
	public void gravarJogo(Jogo jogo, int posicao) {
		colecaoGames = new Jogo[posicao];
	}
	public Jogo listarJogos(int posicao) {
		return colecaoGames[posicao];
	}
	public Jogo[] listatTodosJogos() {
		return colecaoGames;
	}
}
