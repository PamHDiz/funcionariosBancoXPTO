package br.com.caelum.funcionarios.main;

import br.com.caelum.funcionarios.modelo.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("João da Silva");
		
		gerente.setSenha(4321);
		gerente.setSalario(5000.0);
		System.out.println(gerente.getBonificacao());

	}

}
