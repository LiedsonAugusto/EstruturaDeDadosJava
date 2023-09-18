package test;

import org.junit.Before;
import org.junit.Test;

import src.QuickSort;

public class QuickTest extends InitTest{

	@Before
	public void QuickSetup() {
		this.sort = new QuickSort<Integer>();
	}
	
	@Test
	public void test() {
		preencheArray(92500);
		testeGlobal(arrayGigante, giganteOrdenado);
	}
}