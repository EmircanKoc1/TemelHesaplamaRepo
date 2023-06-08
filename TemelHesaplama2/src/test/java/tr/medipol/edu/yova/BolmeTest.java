package tr.medipol.edu.yova;

import static org.junit.Assert.*;

import org.junit.Test;

public class BolmeTest {

	@Test
	public void testBolmeIkiPozitif() {
		int sayi1 = 100;
		int sayi2 = 2;
		
		int gerceksonuc = Bolme.Bolme(sayi1, sayi2);
		
		assertEquals(50,gerceksonuc);
	}
	@Test
	public void testBolmeIkiNegatif() {
		int sayi1 = -100;
		int sayi2 = -2;
		
		int gerceksonuc =  Bolme.Bolme(sayi1, sayi2);
		
		assertEquals(50,gerceksonuc);
	}
	@Test
	public void testBolmeBirNegatifBirPozitif() {
		int sayi1 = -100;
		int sayi2 = 2;
		
		int gerceksonuc = Bolme.Bolme(sayi1, sayi2);
		
		assertEquals(-50,gerceksonuc);
	}


}
