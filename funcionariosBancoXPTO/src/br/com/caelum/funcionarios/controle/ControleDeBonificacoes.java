package br.com.caelum.funcionarios.controle;

import br.com.caelum.funcionarios.modelo.Funcionario;

public class ControleDeBonificacoes {
	
	private double totalDeBonificacoes = 0;
	
	public void registra(Funcionario funcionario) {
		this.totalDeBonificacoes += funcionario.getBonificacao();
	}
	
	public double getTotalDeBonificacoes() {
		return this.totalDeBonificacoes;	
	}
}
