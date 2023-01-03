package src;

public class SelectionSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(T[] array) {
		sort(array, 0, array.length - 1);
	}

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		// resultado 1 >> primeiro elemento maior
		// resultado -1 >> segundo elemento maior
		// resultado 0 >> iguais
		Util.validation(array, leftIndex, rightIndex);
		for (int i = leftIndex; i < rightIndex; i++) {
			T menor = array[i];
			int indiceMenor = 0;
			int trocar = 0;
			for (int j = i+1; j < rightIndex + 1; j++) {
				if (array[j].compareTo(menor) == -1) {
					menor = array[j];
					indiceMenor = j;
					trocar = 1;
				}
			}
			if (trocar == 1) {Util.swap(array, i, indiceMenor);}
		}
	}
}
