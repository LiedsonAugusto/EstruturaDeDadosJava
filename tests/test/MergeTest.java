package test;

import org.junit.Before;
import org.junit.Test;

import src.MergeSortJoseff;

public class MergeTest extends InitTest {

	@Before
	public void bubbleSetup() {
		this.sort = new MergeSortJoseff<Integer>();
	}
	
	@Test
	public void test() {
		preencheArray(5);
		testeGlobal(arrayGigante, giganteOrdenado);
	}
}
