package negocio;

import java.util.Calendar;
import auxiliar.Constante;
import interfaces.IExibido;

public class Sistema implements IExibido{
	private Calendar atualizacao;
	
	public void exibir() {
		System.out.printf("Ultima atualização: %s\nVersão: %s\n",Constante.obterDataFormatada(atualizacao.getTime()),Constante.VERSAO);
		
	}
	public Calendar getAtualizacao() {
		return atualizacao;
	}
	public void setAtualizacao(Calendar atualizacao) {
		this.atualizacao = atualizacao;
	}
	
	
}
