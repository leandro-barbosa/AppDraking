package negocio;

public abstract class Cadastro {
	
	private String login;
	private String senha;
	private String email;
	private String confirmaSenha;
	private int idade;
	private boolean sexo;
	private Localizacao localizacao;
	
	public void exibirMae() {
		System.out.printf("login: %s\n"
				+ "senha: %s\n"
				+ "email: %s\n"
				+ "confirmar senha: %s\n"
				+ "idade: %d\n"
				+ "genero: %s\n",
				login,
				senha,
				email,
				confirmaSenha,
				idade,
				sexo ? "masculino" : "femenino");
		validarUsuario();
		localizacao.exibir();
	}
	
		protected final void player() {
			System.out.print("=============Player==========\n");		
		}

		protected final  void administrador() {
			System.out.print("=============Administrador==========\n");		
		}
		
		abstract public void exibir();
		
		public boolean validarUsuario() {
			if(this.senha.length() < 6) {
				System.out.println("Sua senha tem menos de 6 digitos");
				return false;
			}
			else {
				return true;
			}	
	}
		
	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getConfirmaSenha() {
		return confirmaSenha;
	}

	public void setConfirmaSenha(String confirmaSenha) {
		this.confirmaSenha = confirmaSenha;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public Localizacao getLocalizacao() {
		return localizacao;
	}

	public void setLocalizacao(Localizacao localizacao) {
		this.localizacao = localizacao;
	}



	
}
