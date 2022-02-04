package br.com.caelum.funcionarios.main;

import java.util.HashSet;
import java.util.Set;

public class TestaHashSet {

	public static void main(String[] args) {
		
		Set<String> cargos = new HashSet<>();
		
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Diretor");
		
		System.out.println(cargos);
		
		Set<String> conjunto = new HashSet<>();
		
		conjunto.add("java");
		conjunto.add("vraptor");
		conjunto.add("scala");
		
		for(String palavra : conjunto) {
			System.out.println(palavra);
		}
	}

}
