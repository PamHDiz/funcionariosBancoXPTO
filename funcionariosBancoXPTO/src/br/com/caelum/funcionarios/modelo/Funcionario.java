package br.com.caelum.funcionarios.modelo;

public class Funcionario {
	
	protected String nome;
	protected String cpf;
	protected double salario;
	// um atributo com o modificador protected pode ser acessado pela própria classe
	// suas subclasses ou classes filhas ou classes do mesmo pacote.
	
	public double getBonificacao() {
		return this.salario * 0.1;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	

}
