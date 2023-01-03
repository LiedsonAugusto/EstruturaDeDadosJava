package src;

public class Util {

	public static <T> void swap(T[] array, int indice1, int indice2) {
		
		T aux = array[indice1];
		array[indice1] = array[indice2];
		array[indice2] = aux;

	}
	
	public static <T> void validation(T[] array, int leftIndex, int rightIndex) {
		if (leftIndex > rightIndex) throw new IllegalArgumentException("leftIndex menor que rightIndex");
		if (array == null) throw new IllegalArgumentException("Array nulo");
		if (rightIndex > array.length | leftIndex < 0) throw new IllegalArgumentException("Valores dos indices errados");
		if (array.length == 0) throw new IllegalArgumentException("Array vazio");
	}
}
