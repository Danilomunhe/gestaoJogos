package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Consoles;
import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.repository.FabricanteRepository;
import br.senai.sp.jandira.repository.GamesRepository;
import br.senai.sp.jandira.ui.FrameFabricante;
//import br.senai.sp.jandira.model.Fabricante;
//import br.senai.sp.jandira.model.Jogo;
//import br.senai.sp.jandira.repository.GamesRepository;
import br.senai.sp.jandira.ui.FrameGames;

public class App {

	public static void main(String[] args) {
		
		FrameGames frame = new FrameGames();

//	    Fabricante fabricante = new Fabricante();
//	    fabricante.setNome("Activison");
//	    Jogo jogos = new Jogo();
//	    jogos.setTitulo("Assasins Creed");
//	    jogos.setDecimal(89.90);
//	    jogos.setObservacoes("Jogo Maravilhoso");
//	    jogos.setZerado(true);
//	    jogos.setFabricante(fabricante);
//	    
//	    Jogo jogo2 = new Jogo();
//	    jogo2.setTitulo("FIFA");
//	    
//	    GamesRepository colecaoGames = new GamesRepository(2);
//	    colecaoGames.gravarJogo(jogos, 0);
//	    colecaoGames.gravarJogo(jogo2, 1);
//	   
//	    FabricanteRepository fabricantes = new FabricanteRepository();
//	    fabricantes.gravarFabricante(fabricante, 0);
//	    System.out.println(fabricantes.listarFabricante(0).getNome());
//	    
//	    for(Fabricante f : fabricantes.listarTodosFabricantes()) {
//	    	System.out.println(f.getNome());
//	    }
//	    
//	    for(Jogo jogo : colecaoGames.listatTodosJogos()) {
//	    	System.out.println(jogo.getTitulo());
//	    }
   
	}

}
