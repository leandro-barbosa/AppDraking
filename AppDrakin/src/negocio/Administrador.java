package negocio;

public class Administrador extends Cadastro {
	private boolean maiorIdade;
	int mesesGraduacao;
	
	public void exibir() {
		super.administrador();
		super.exibirMae();
		System.out.printf("Meses de graduação: %d\n",mesesGraduacao);
		System.out.printf("%s",(maiorIdade ? "O usuario tem mais de 18 anos\n" : "O usuário não tem 18 anos\n"));
		validarCadastro();
}
		
	private void validarCadastro(){
		if(maiorIdade){
			if(mesesGraduacao > 2){
				System.out.println("cadastro feito\n");
			}
		}
		else{
			System.out.println("cadastro impossivel de ser feito\n");
		}
	}

	public boolean isMaiorIdade() {
		return maiorIdade;
	}

	public void setMaiorIdade(boolean maiorIdade) {
		this.maiorIdade = maiorIdade;
	}

	public int getMesesGraduacao() {
		return mesesGraduacao;
	}

	public void setMesesGraduacao(int mesesGraduacao) {
		this.mesesGraduacao = mesesGraduacao;
	}
	
}

	
