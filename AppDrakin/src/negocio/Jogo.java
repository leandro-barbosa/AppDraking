package negocio;

import java.util.List;

import interfaces.IExibido;

public class Jogo implements IExibido {
	private String nomeJogo;
	private String generoJogo;
	private List <Cadastro> cadastros;
	
	public void exibir() {
		System.out.println("=============Jogo==========");
		System.out.printf("nome do jogo: %s\ngenero do jogo: %s\n\n",
				nomeJogo,
				generoJogo);
		
	}

	public String getNomeJogo() {
		return nomeJogo;
	}

	public void setNomeJogo(String nomeJogo) {
		this.nomeJogo = nomeJogo;
	}

	public String getGeneroJogo() {
		return generoJogo;
	}

	public void setGeneroJogo(String generoJogo) {
		this.generoJogo = generoJogo;
	}	
	
	
}
