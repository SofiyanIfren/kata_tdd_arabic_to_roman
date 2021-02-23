package junit.tuto.junit.tuto;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;


public class ArabicToRomanTest {
	
	ArabicToRoman arabicToRoman;
	
	@Before
	public void getRomanToArabicClass() {
		arabicToRoman = new ArabicToRoman();
	}
	@Test
	public void getRomanFromArabicNumber_One () {
		assertEquals("I", arabicToRoman.getRomanNumber_FromArabicNumber(1));
	}
	@Test
	public void getRomanFromArabicNumber_Two () {
		assertEquals("II", arabicToRoman.getRomanNumber_FromArabicNumber(2));
	}
	@Test
	public void getRomanFromArabicNumber_Three () {
		assertEquals("III", arabicToRoman.getRomanNumber_FromArabicNumber(3));
	}
	@Test
	public void getRomanFromArabicNumber_Four () {
		assertEquals("IV", arabicToRoman.getRomanNumber_FromArabicNumber(4));
	}
	@Test
	public void getRomanFromArabicNumber_Five () {
		assertEquals("V", arabicToRoman.getRomanNumber_FromArabicNumber(5));
	}
	@Test
	public void getRomanFromArabicNumber_Six () {
		assertEquals("VI", arabicToRoman.getRomanNumber_FromArabicNumber(6));
	}
	@Test
	public void getRomanFromArabicNumber_Seven () {
		assertEquals("VII", arabicToRoman.getRomanNumber_FromArabicNumber(7));
	}
	@Test
	public void getRomanFromArabicNumber_Eight () {
		assertEquals("VIII", arabicToRoman.getRomanNumber_FromArabicNumber(8));
	}
	@Test
	public void getRomanFromArabicNumber_Nine () {
		assertEquals("IX", arabicToRoman.getRomanNumber_FromArabicNumber(9));
	}
	@Test
	public void getRomanFromArabicNumber_Ten () {
		assertEquals("X", arabicToRoman.getRomanNumber_FromArabicNumber(10));
	}
	@Test
	public void getRomanFromArabicNumber_Eleven () {
		assertEquals("XI", arabicToRoman.getRomanNumber_FromArabicNumber(11));
	}
	@Test
	public void getRomanFromArabicNumber_12 () {
		assertEquals("XII", arabicToRoman.getRomanNumber_FromArabicNumber(12));
	}
	
	@Test
	public void getRomanFromArabicNumber_15 () {
		assertEquals("XV", arabicToRoman.getRomanNumber_FromArabicNumber(15));
	}
	@Test
	public void getRomanFromArabicNumber_20 () {
		assertEquals("XX", arabicToRoman.getRomanNumber_FromArabicNumber(20));
	}
	@Test
	public void getRomanFromArabicNumber_25 () {
		assertEquals("XXV", arabicToRoman.getRomanNumber_FromArabicNumber(25));
	}
	@Test
	public void getRomanFromArabicNumber_27 () {
		assertEquals("XXVII", arabicToRoman.getRomanNumber_FromArabicNumber(27));
	}
	@Test
	public void getRomanFromArabicNumber_29 () {
		assertEquals("XXIX", arabicToRoman.getRomanNumber_FromArabicNumber(29));
	}
	@Test
	public void getRomanFromArabicNumber_30 () {
		assertEquals("XXX", arabicToRoman.getRomanNumber_FromArabicNumber(30));
	}
	
	@Test
	public void getRomanFromArabicNumber_40 () {
		assertEquals("XL", arabicToRoman.getRomanNumber_FromArabicNumber(40));
	}
	@Test
	public void getRomanFromArabicNumber_42 () {
		assertEquals("XLII", arabicToRoman.getRomanNumber_FromArabicNumber(42));
	}
	
	@Test
	public void getRomanFromArabicNumber_50 () {
		assertEquals("L", arabicToRoman.getRomanNumber_FromArabicNumber(50));
	}
	@Test
	public void getRomanFromArabicNumber_52 () {
		assertEquals("LII", arabicToRoman.getRomanNumber_FromArabicNumber(52));
	}
	
	@Test
	public void getRomanFromArabicNumber_60 () {
		assertEquals("LX", arabicToRoman.getRomanNumber_FromArabicNumber(60));
	}
	@Test
	public void getRomanFromArabicNumber_63 () {
		assertEquals("LXIII", arabicToRoman.getRomanNumber_FromArabicNumber(63));
	}
	
	
	@Test
	public void getRomanFromArabicNumber_95 () {
		assertEquals("XCV", arabicToRoman.getRomanNumber_FromArabicNumber(95));
	}
	@Test
	public void getRomanFromArabicNumber_195 () {
		assertEquals("CXCV", arabicToRoman.getRomanNumber_FromArabicNumber(195));
	}
	@Test
	public void getRomanFromArabicNumber_375 () {
		assertEquals("CCCLXXV", arabicToRoman.getRomanNumber_FromArabicNumber(375));
	}
	@Test
	public void getRomanFromArabicNumber_875 () {
		assertEquals("DCCCLXXV", arabicToRoman.getRomanNumber_FromArabicNumber(875));
	}
	@Test
	public void getRomanFromArabicNumber_1875 () {
		assertEquals("MDCCCLXXV", arabicToRoman.getRomanNumber_FromArabicNumber(1875));
	}
	@Test
	public void getRomanFromArabicNumber_3875 () {
		assertEquals("MMMDCCCLXXV", arabicToRoman.getRomanNumber_FromArabicNumber(3875));
	}

}
