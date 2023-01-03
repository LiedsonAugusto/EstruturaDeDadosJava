package src;

public class InsertionSort<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(T[] array) {
		sort(array, 0, array.length - 1);
	}

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		Util.validation(array, leftIndex, rightIndex);
		for (int i = leftIndex; i < rightIndex; i++){
			int leftKey = i;
			int rightKey = leftKey +1;
			if (array[rightKey].compareTo(array[leftKey]) == -1) {
				Util.swap(array, leftKey, rightKey);
				for (int j = leftKey; j > 0; j--) {
					if (array[j].compareTo(array[j-1]) == -1) {
						Util.swap(array, j, j-1);
					} else {
						break;
					}
				}
			} else {
				continue;
			}
		}
	}

}
