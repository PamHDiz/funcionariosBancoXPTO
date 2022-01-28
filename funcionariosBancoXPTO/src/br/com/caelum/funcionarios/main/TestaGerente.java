package br.com.caelum.funcionarios.main;

import br.com.caelum.funcionarios.modelo.Funcionario;
import br.com.caelum.funcionarios.modelo.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente();
		
		gerente.setNome("Jo�o da Silva");
		Funcionario funcionario = gerente;
		funcionario.setSalario(5000.0);
		System.out.println(funcionario.getBonificacao());
		// Por causa do Polimorfismo, o objeto funcion�rio que se referencia ao gerente
		// consegue chamar o m�todo reescrito da classe Gerente
		
		/*
		 * gerente.setSenha(4321); gerente.setSalario(5000.0);
		 * System.out.println(gerente.getBonificacao());
		 */

	}

}
