package test;

import org.junit.Before;
import org.junit.Test;

import src.SelectionSort;

public class SelectionTest extends InitTest {

	
	@Before
	public void bubbleSetup() {
		this.sort = new SelectionSort<Integer>();
	}
	
	@Test
	public void test() {
		preencheArray(40000);
		testeGlobal(arrayGigante, giganteOrdenado);
	}
}
