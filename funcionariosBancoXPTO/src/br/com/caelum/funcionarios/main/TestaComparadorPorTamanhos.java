package br.com.caelum.funcionarios.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.caelum.funcionarios.modelo.ComparadorPorTamanhos;

public class TestaComparadorPorTamanhos {

	public static void main(String[] args) {
		
		List<String> lista = new ArrayList<>();
		lista.add("Ricardo");
		lista.add("Fernanda");
		lista.add("Guilherme");
		lista.add("Giulia");
		
		// invocando o sort passando o comparator
		// ComparadorPorTamanhos comparador = new ComparadorPorTamanhos();
		// como a variável temporária é usada apenas aqui, podemos escrevê-la diretamente no 
		// método abaixo
		
		// Collections.sort(lista, new ComparadorPorTamanhos()); // ordena por tamanho da palavra
		
		// -------------------------------------------------------------------------------------
		
		// Podemos usar o recurso de classe anônima para esse caso. Instancia tudo aqui
		// sem a necessidade de criar uma interface a parte.
		
		/*
		 * Comparator<String> comparador = new Comparator<String>() { public int
		 * compare(String s1, String s2) { return Integer.compare(s1.length(),
		 * s2.length()); } };
		 */
		
		// Ainda podemos simplificar mais ainda o código, conforme abaixo:
		
		/*
		 * Collections.sort(lista, new Comparator<String>() { public int compare(String
		 * s1, String s2) { return Integer.compare(s1.length(), s2.length()); } });
		 */
		
		// -------------------------------------------------------------
		
		// Mais simples ainda, é usar o Lambda:
		
		Collections.sort(lista, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(lista);
	}

}
