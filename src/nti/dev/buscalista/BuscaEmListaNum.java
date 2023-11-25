package nti.dev.buscalista;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class BuscaEmListaNum {
 
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int[] numeros = new int[10];
		ArrayList<Integer> lista = new ArrayList<Integer>();
		
		for (int i = 0; i < numeros.length; i++) {
			int num = new Random().nextInt(60) + 1;
			lista.add(num);
		}
		Collections.sort(lista);
		
		System.out.print("Lista Ordenada: ");
		lista.forEach(num -> System.out.print(num+" "));
		
		System.out.print("\n\nInforme o núnero para buscar: ");
		int x = sc.nextInt();

		numPosition(lista, x);
		
		sc.close();
	}

	
	static void numPosition(ArrayList<Integer> lista, Integer num){
	    
		if(lista.contains(num)) {
			for (Integer x : lista) {
				if(x == num) {
					System.out.print("Posição do Número na lista: "+lista.indexOf(x));
				}
			}
		}else {
			System.out.println("O número '"+num+"' não está presente na lista!");
		}
	}
	
}
