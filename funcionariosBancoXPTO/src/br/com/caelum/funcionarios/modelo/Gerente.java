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
	
	@Override
	public double getBonificacao() {
		return this.salario * 0.15;
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
