package generics.exemplo2;

import java.util.List;

public class main {

	public static void main(String[] args) {
		
		List<Integer> numbers = List.of(5, 8, 1, 2);
		List<String> colors = List.of("Vermelho", "Verde", "Azul");
		
		int numberIndex = Utils.findIndexOfElement(numbers, 1);
		System.out.println("Índice: " + numberIndex);
		
		int colorIndex = Utils.findIndexOfElement(colors, "Verde");
		System.out.println("Índice: " + colorIndex);
	}

}
