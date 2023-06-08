package tr.medipol.edu.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class CikarmaTest {

	@Test
	public void testCikarmaIkiPozitif() {
		int sayi1 = 100;
		int sayi2 = 2;
		
		int gerceksonuc = Cıkarma.Cikar(sayi1, sayi2);
		
		assertEquals(98,gerceksonuc);
	}
	
	@Test
	public void testCikarmaIkiNegatif() {
		int sayi1 = -100;
		int sayi2 = -2;
		
		int gerceksonuc = Cıkarma.Cikar(sayi1, sayi2);
		
		assertEquals(-98,gerceksonuc);
	}
	@Test
	public void testCikarmaBirPozitifBirNegatif() {
		int sayi1 = 100;
		int sayi2 = -2;
		
		int gerceksonuc = Cıkarma.Cikar(sayi1, sayi2);
		
		assertEquals(102,gerceksonuc);
	}
	
}
