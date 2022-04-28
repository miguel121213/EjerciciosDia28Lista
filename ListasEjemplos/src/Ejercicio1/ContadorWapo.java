package Ejercicio1;

import java.util.List;
import java.util.stream.Collectors;

public class ContadorWapo {
	public static void main(String[] args) {
		List<Integer> num = List.of(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15);

		
		int count = 0;
		for (int numeros : num) {
			if (numeros > 10){
				count ++;
			}
		}
	
		Ivisualizar listaWapa = lista -> {
			lista.forEach(n-> System.out.println("goles del betis: " +n));
		};
	
		listaWapa.visualizarElementos(num);
		
		// COLORES
		
		List<String> colores = List.of("azul", "verde", "rojo", "amarillo", "rosa");
		
		Object quitarColorRojoyMayusculas = colores.stream()
				.filter(s -> !s.equals("rosa"))
				.map(j -> j.toString().toUpperCase())
				.collect(Collectors.toList());
		
		System.out.println("Resultado :" +quitarColorRojoyMayusculas);
	}	
	
	Ivisualizar mayoresde10 = (numeros) -> numeros.stream().filter(num -> num > 10).count();
		
	
}	
