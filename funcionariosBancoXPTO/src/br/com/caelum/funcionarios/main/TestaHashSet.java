package br.com.caelum.funcionarios.main;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestaHashSet {

	public static void main(String[] args) {
		
		Set<String> cargos = new HashSet<>();
		
		cargos.add("Gerente");
		cargos.add("Diretor");
		cargos.add("Presidente");
		cargos.add("Secretária");
		cargos.add("Diretor");
		
		//System.out.println(cargos);
		
		// retorna o iterador
		Iterator<String> i = cargos.iterator();
		while(i.hasNext()) {
			//recebe a palavra
			String palavra = i.next();
			System.out.println(palavra);
		}
		
		System.out.println();
		
		Set<String> conjunto = new HashSet<>();
		
		conjunto.add("java");
		conjunto.add("vraptor");
		conjunto.add("scala");
		
		for(String palavra : conjunto) {
			System.out.println(palavra);
		}
	}

}
