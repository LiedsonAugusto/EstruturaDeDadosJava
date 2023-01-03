package src;

public class BubbleSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(T[] array) {
		sort(array, 0, array.length - 1);
	}
	
	public void sort(T[] array, int leftIndex, int rightIndex) {
		// TODO 
		// Caso precise efetuar uma troca utilize o Swap como descrito abaixo
		// ele também deve ser implementado.
		// resultado 1 >> primeiro elemento maior
		// resultado -1 >> segundo elemento maior
		// resultado 0 >> iguais
		
		// 	Util.swap(leftIndex, rightIndex);
		Util.validation(array, leftIndex, rightIndex);
		boolean continuar = true;
		
		while (continuar) {
			
			continuar = false;

			for(int i = leftIndex; i <= rightIndex - 1; i++) {
				if (array[i].compareTo(array[i+1]) == 1) {
					Util.swap(array, i, i+1);
					continuar = true;
				}
			}
		}
	}
}
