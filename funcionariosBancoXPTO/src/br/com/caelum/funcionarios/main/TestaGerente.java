package br.com.caelum.funcionarios.main;

import br.com.caelum.funcionarios.controle.ControleDeBonificacoes;
import br.com.caelum.funcionarios.modelo.Funcionario;
import br.com.caelum.funcionarios.modelo.Gerente;

public class TestaGerente {

	public static void main(String[] args) {
		
		ControleDeBonificacoes controle = new ControleDeBonificacoes();
		
		Gerente gerente = new Gerente();
		
		
		gerente.setSalario(5000.0);
		controle.registra(gerente);
		
		System.out.println(controle.getTotalDeBonificacoes());
		
		
		//System.out.println(funcionario.getBonificacao());
		// Por causa do Polimorfismo, o objeto funcionário que se referencia ao gerente
		// consegue chamar o método reescrito da classe Gerente
		
		/*
		 * gerente.setSenha(4321); gerente.setSalario(5000.0);
		 * System.out.println(gerente.getBonificacao());
		 */

	}

}
