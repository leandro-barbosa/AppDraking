package teste;

import negocio.Administrador;
import negocio.Localizacao;

public class TestaAdm {
	public static void main(String[] args) {
		
		Localizacao localAdm = new Localizacao();
		localAdm.setCep("12345-90");
		localAdm.setCidade("Rio de Janeiro");
		localAdm.setComplemento("apartamento 202");
		localAdm.setEstado("Rio de janeiro");
		localAdm.setNumero(90);
		localAdm.setPais("Brasil");

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
	}
}
