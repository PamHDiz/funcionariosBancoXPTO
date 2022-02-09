package br.com.caelum.funcionarios.modelo;

import java.util.Comparator;

public class ComparadorPorTamanhos implements Comparator<String> {
	
	@Override
	public int compare(String s1, String s2) {
		return Integer.compare(s1.length(), s2.length());
		// método estático Integer.compare que compara dois inteiros
	}

}
