package tr.edu.medipol.yazilimort;

import static org.junit.Assert.*;

import org.junit.Test;

public class HesaplamalarTest {

	@Test
	public void testFaktoriyelRec() {
		int sonuc = Hesaplamalar.faktoriyelRec(5);
		assertEquals(sonuc, 120);
	}

	@Test
	public void testFaktoriyelLoop() {
		int sonuc = Hesaplamalar.faktoriyelLoop(5);
		assertEquals(sonuc, 120);
	}

	@Test
	public void testToplama() {
		assertEquals(2, Hesaplamalar.toplama(1, 1));
	}

	@Test
	public void testCikarma() {
		assertEquals(0, Hesaplamalar.cikarma(1, 1));
	}

	@Test
	public void testCarpma() {
		assertEquals(1, Hesaplamalar.carpma(1, 1));
	}

}
