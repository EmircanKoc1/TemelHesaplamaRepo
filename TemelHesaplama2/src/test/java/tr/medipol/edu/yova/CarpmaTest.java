package tr.medipol.edu.yova;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CarpmaTest {
	@Test
	public void testCarpmaIkiPozitif() {
		int sayi1 = 100;
		int sayi2 = 2;
		
		int gerceksonuc = Carpma.Carpma(sayi1, sayi2);
		
		assertEquals(200,gerceksonuc);
	}
	@Test
	public void testCarpmaIkiNegatif() {
		int sayi1 = -100;
		int sayi2 = -2;
		
		int gerceksonuc = Carpma.Carpma(sayi1, sayi2);
		
		assertEquals(200,gerceksonuc);
	}
	@Test
	public void testCarpmaBirNegatifBirPozitif() {
		int sayi1 = -100;
		int sayi2 = 2;
		
		int gerceksonuc = Carpma.Carpma(sayi1, sayi2);
		
		assertEquals(-200,gerceksonuc);
	}
}
