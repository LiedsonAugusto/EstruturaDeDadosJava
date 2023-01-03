package src;

public interface Sorting<T extends Comparable<T>> {

	public void sort(T[] array);
	
	public void sort(T[] array, int leftIndex, int rightIndex);
	
}
