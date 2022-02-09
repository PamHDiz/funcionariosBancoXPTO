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
		// como a vari�vel tempor�ria � usada apenas aqui, podemos escrev�-la diretamente no 
		// m�todo abaixo
		
		// Collections.sort(lista, new ComparadorPorTamanhos()); // ordena por tamanho da palavra
		
		// -------------------------------------------------------------------------------------
		
		// Podemos usar o recurso de classe an�nima para esse caso. Instancia tudo aqui
		// sem a necessidade de criar uma interface a parte.
		
		/*
		 * Comparator<String> comparador = new Comparator<String>() { public int
		 * compare(String s1, String s2) { return Integer.compare(s1.length(),
		 * s2.length()); } };
		 */
		
		// Ainda podemos simplificar mais ainda o c�digo, conforme abaixo:
		
		/*
		 * Collections.sort(lista, new Comparator<String>() { public int compare(String
		 * s1, String s2) { return Integer.compare(s1.length(), s2.length()); } });
		 */
		
		// -------------------------------------------------------------
		
		// Mais simples ainda, � usar o Lambda:
		
		Collections.sort(lista, (s1, s2) -> Integer.compare(s1.length(), s2.length()));
		
		System.out.println(lista);
	}

}
