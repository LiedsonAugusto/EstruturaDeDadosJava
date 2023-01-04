package src;

public class QuickSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(T[] array) {
		sort(array, 0, array.length - 1);
	}

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		Util.validation(array, leftIndex, rightIndex);
		quickSort(array, leftIndex, rightIndex);
	}
	
	private int changePivo(int leftIndex, int rightIndex) {
		int lenghtArray = (rightIndex + leftIndex);
		return (int) (lenghtArray / 2);
	}

	private void quickSort(T[] array, int leftIndex, int rightIndex) {
		if (leftIndex >= rightIndex) {return;}
		int pivoIndex = changePivo(leftIndex, rightIndex);
		Util.swap(array, pivoIndex, leftIndex);
		int emptySlotIndex = leftIndex+1;
		for (int i = emptySlotIndex; i <= rightIndex; i++) {
			if (array[leftIndex].compareTo(array[i]) == 1) {
				Util.swap(array, emptySlotIndex, i);
				emptySlotIndex++;
			}
		}
		emptySlotIndex--;
		Util.swap(array, leftIndex, emptySlotIndex);
		quickSort(array, leftIndex, emptySlotIndex - 1); // LEFT
		quickSort(array, emptySlotIndex + 1, rightIndex); // RIGHT
	}
}
