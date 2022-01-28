package br.com.caelum.funcionarios.modelo;

public class Gerente extends Funcionario {
	
	private int senha;
	private int numeroFuncionariosGerenciados;
	
	public boolean autentica(int senha) {
		if(this.senha == senha) {
			System.out.println("Acesso Permitido!");
			return true;
		} else {
			System.out.println("Acesso Negado!");
			return false;
		}
	}
	
	// reescrita do método chamando o método criado na classe mãe com a palavra chave 'super' e 
	// adicionando 1000.0 reais a ele
	@Override 
	public double getBonificacao() {
		return super.getBonificacao() + 1000.0;
	} 

	public int getSenha() {
		return senha;
	}

	public void setSenha(int senha) {
		this.senha = senha;
	}

	public int getNumeroFuncionariosGerenciados() {
		return numeroFuncionariosGerenciados;
	}

	public void setNumeroFuncionariosGerenciados(int numeroFuncionariosGerenciados) {
		this.numeroFuncionariosGerenciados = numeroFuncionariosGerenciados;
	}
	
	
	
}
