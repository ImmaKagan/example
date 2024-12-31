package tr.edu.medipol.yova;

import org.junit.Test;
import static org.junit.Assert.*;

public class MetinDuzenleyiciTest {

	@Test
	
	public void boslukVarsaOnlariTemizlemeli() {
	//GIVEN - ÖN KOŞULLAR
	String orjinal = " Y  A  Z  I L I M";
	//WHEN - BU AKSİYON GERÇEKLEŞTİĞİNDE
	String sonuc = 	MetinDuzenleyici.bosluklariTemizle(orjinal);
	
	
	//THEN - BUNLAR OLMALI 
	assertEquals("beklenmedik sonuc","YAZILIM",sonuc);
	}
	
	
@Test
	
	public void boslukYoksaAyniSonucuVermeli() {
	//GIVEN - ÖN KOŞULLAR
	String orjinal = "DENEME";
	//WHEN - BU AKSİYON GERÇEKLEŞTİĞİNDE
	String sonuc = 	MetinDuzenleyici.bosluklariTemizle(orjinal);
	
	
	//THEN - BUNLAR OLMALI 
	assertEquals("beklenmedik sonuc",orjinal,sonuc);
	}
	/////////////////////////////////////////Derste Yapılan Örnekler

@Test
void testReverseString_NormalInput() {
    String input = "hello";
    String expected = "olleh";
    String actual = MetinDuzenleyici.reverseString(input);
    assertEquals(expected, actual, "Metin ters çevrilmedi!");
}

@Test
void testReverseString_EmptyInput() {
    String input = "";
    String expected = "";
    String actual = MetinDuzenleyici.reverseString(input);
    assertEquals(expected, actual, "Boş string hatalı döndü!");
}

@Test
void testReverseString_NullInput() {
    String input = null;
    String actual = MetinDuzenleyici.reverseString(input);
    assertNull(actual, "Null değer doğru işlenmedi!");

}

}
