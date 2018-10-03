package teste;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import negocio.Administrador;
import negocio.Cadastro;
import negocio.Jogo;
import negocio.Localizacao;
import negocio.Player;
import negocio.Sistema;

public class TestaJogo {
	
	public static void main(String[] args) {
		DateFormat df = null;
		
        Calendar dataAtualizacaoVersao = Calendar.getInstance();
        df = new SimpleDateFormat("dd/MM/yyyy");        
        try {
            Date dtAtualizacao = (Date)df.parse("01/10/2018");            
            dataAtualizacaoVersao.setTime(dtAtualizacao);
		} catch (ParseException e) {
			e.printStackTrace();
		}      
		
        Sistema system = new Sistema();
        system.setAtualizacao(dataAtualizacaoVersao);
        system.exibir();
        
        Jogo jogo = new Jogo();
        jogo.setNomeJogo("Draking");
        jogo.setGeneroJogo("RPG, Mundo aberto");
        jogo.exibir();
        
		Localizacao localAdm = new Localizacao();
		localAdm.setCep("12345-90");
		localAdm.setCidade("Rio de Janeiro");
		localAdm.setComplemento("apartamento 202");
		localAdm.setEstado("Rio de janeiro");
		localAdm.setNumero(90);
		localAdm.setPais("Brasil");

		Localizacao localPlayer = new Localizacao();
		localPlayer.setCep("xxxxxx");
		localPlayer.setCidade("sao paulo");
		localPlayer.setComplemento("apartamento 402");
		localPlayer.setEstado("sao paulo");
		localPlayer.setNumero(40);
		localPlayer.setPais("Brasil");

		Administrador adm = new Administrador();
		adm.setLogin("tamy");
		adm.setSenha("123456");
		adm.setEmail("tamy@gmail.com");				
		adm.setLogin("tamy");
		adm.setConfirmaSenha("123456");
		adm.setSexo(false);
		adm.setIdade(40);
		adm.setLocalizacao(localAdm);
		adm.setMesesGraduacao(5);
		adm.setMaiorIdade(true);
		adm.exibir();

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
 
		List<Cadastro> cadastros = new ArrayList<Cadastro>();
		cadastros.add(adm);
		cadastros.add(player);
    
	}
}
