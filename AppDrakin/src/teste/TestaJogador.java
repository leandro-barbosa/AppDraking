package teste;

import negocio.Localizacao;
import negocio.Player;

public class TestaJogador {
	public static void main(String[] args) {
		
		Localizacao localPlayer = new Localizacao();
		localPlayer.setCep("xxxxxx");
		localPlayer.setCidade("sao paulo");
		localPlayer.setComplemento("apartamento 402");
		localPlayer.setEstado("sao paulo");
		localPlayer.setNumero(40);
		localPlayer.setPais("Brasil");
			
		Player player = new Player();
		player.setLogin("tamadog");
		player.setSenha("1234");			
		player.setLogin("tamadog");
		player.setConfirmaSenha("1234");
		player.setEmail("likeabozidade@gmail.com");
		player.setSexo(true);
		player.setIdade(18);
		player.setLocalizacao(localPlayer);
		player.exibir();
	}
}

	

