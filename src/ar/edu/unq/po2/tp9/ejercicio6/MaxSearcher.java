package ar.edu.unq.po2.tp9.ejercicio6;

import java.util.ArrayList;

public class MaxSearcher {
	
	private ArrayList<Integer> numeros = new ArrayList<Integer>();

	public int max() {
		int max = 0;
		for(int number: numeros) {
			if(max < number) {
				max = number;
			}
		}
		return max;
	}

	public void add(int number) {
		numeros.add(number);
	}
}
