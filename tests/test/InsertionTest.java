package test;

import org.junit.Before;
import org.junit.Test;

import src.InsertionSort;

public class InsertionTest extends InitTest {

	@Before
	public void bubbleSetup() {
		this.sort = new InsertionSort<Integer>();
	}
	
	@Test
	public void test() {
		preencheArray(100000);
		testeGlobal(arrayGigante, giganteOrdenado);
	}
	
}
