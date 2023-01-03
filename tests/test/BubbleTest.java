package test;

import org.junit.Before;
import org.junit.Test;

import src.BubbleSort;
public class BubbleTest extends InitTest {

	@Before
	public void bubbleSetup() {
		this.sort = new BubbleSort<Integer>();
	}
	
	@Test
	public void test() {
		preencheArray(20000);
		testeGlobal(arrayGigante, giganteOrdenado);
	}
	
}
