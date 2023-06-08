package tr.medipol.edu.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToplamaTest {

	@Test
	public void testToplamaIkiPozitif() {
		int sayi1 = 100;
		int sayi2 = 2;
		
		int gerceksonuc = Toplama.topla(sayi1, sayi2);
		
		assertEquals(102,gerceksonuc);
	}
	@Test
	public void testToplamaIkiNegatif() {
		int sayi1 = -100;
		int sayi2 = -2;
		
		int gerceksonuc = Toplama.topla(sayi1, sayi2);
		
		assertEquals(-102,gerceksonuc);
	}
	@Test
	public void testToplamaBirNegatifBirPozitif() {
		int sayi1 = 100;
		int sayi2 = -2;
		
		int gerceksonuc = Toplama.topla(sayi1, sayi2);
		
		assertEquals(98,gerceksonuc);
	}
}
