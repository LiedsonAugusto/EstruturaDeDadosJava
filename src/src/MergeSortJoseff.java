package src;

public class MergeSortJoseff<T extends Comparable<T>> implements Sorting<T> {

	@Override
	public void sort(T[] array) {
		sort(array, 0, array.length - 1);
	}

	@Override
	public void sort(T[] array, int leftIndex, int rightIndex) {
		Util.validation(array, leftIndex, rightIndex);
		int middleIndex = (leftIndex + rightIndex) / 2;
		particiona(array, leftIndex, middleIndex);
		particiona(array, middleIndex + 1, rightIndex);
		merge(array, leftIndex, rightIndex, middleIndex);
	}
	
	private void particiona(T[] array, int leftIndex, int rightIndex) {
		if (leftIndex < rightIndex) {
			int middleIndex = (rightIndex + leftIndex) / 2;
			particiona(array, leftIndex, middleIndex);
			particiona(array, middleIndex+1, rightIndex);
			merge(array, leftIndex, rightIndex, middleIndex);
		}
	}
	
	private void merge(T[] array,  int leftIndex, int rightIndex, int middleIndex) {
		
	}

}
