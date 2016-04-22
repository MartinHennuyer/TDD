package iut.tdd;

import org.junit.Assert;
import org.junit.Test;

public class RomanNumeralsTest {

	@Test
	public void should_return_I_when_1 () {
		//Given
		String input = "1";
		String expected = "I";
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_II_when_2 () {		
		//Given
		String input = "2";
		String expected = "II"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_IV_when_4 () {		
		//Given
		String input = "4";
		String expected = "IV"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_V_when_5 () {		
		//Given
		String input = "5";
		String expected = "V"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_VI_when_6 () {		
		//Given
		String input = "6";
		String expected = "VI"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_VII_when_7 () {		
		//Given
		String input = "7";
		String expected = "VII"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_VIII_when_8 () {		
		//Given
		String input = "8";
		String expected = "VIII"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_IX_when_9 () {		
		//Given
		String input = "9";
		String expected = "IX"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_X_when_10 () {		
		//Given
		String input = "10";
		String expected = "X"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_XV_when_15 () {		
		//Given
		String input = "15";
		String expected = "XV"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_XX_when_20 () {		
		//Given
		String input = "20";
		String expected = "XX"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_XXX_when_30 () {		
		//Given
		String input = "30";
		String expected = "XXX"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_XL_when_40 () {		
		//Given
		String input = "40";
		String expected = "XL"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_L_when_50 () {		
		//Given
		String input = "50";
		String expected = "L"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_LX_when_60 () {		
		//Given
		String input = "60";
		String expected = "LX"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_LXX_when_70 () {		
		//Given
		String input = "70";
		String expected = "LXX"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_LXXX_when_80 () {		
		//Given
		String input = "80";
		String expected = "LXXX"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_XC_when_90 () {		
		//Given
		String input = "90";
		String expected = "XC"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_C_when_100 () {		
		//Given
		String input = "100";
		String expected = "C"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_CC_when_200 () {		
		//Given
		String input = "200";
		String expected = "CC"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_CCL_when_250 () {		
		//Given
		String input = "250";
		String expected = "CCL"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_CCLXXV_when_275 () {		
		//Given
		String input = "275";
		String expected = "CCLXXV"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_CD_when_400 () {		
		//Given
		String input = "400";
		String expected = "CD"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_D_when_500 () {		
		//Given
		String input = "500";
		String expected = "D"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_DC_when_600 () {		
		//Given
		String input = "600";
		String expected = "DC"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_CM_when_900 () {		
		//Given
		String input = "900";
		String expected = "CM"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_M_when_1000 () {		
		//Given
		String input = "1000";
		String expected = "M"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_MM_when_2000 () {		
		//Given
		String input = "2000";
		String expected = "MM"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_MMCDXLVI_when_2446 () {		
		//Given
		String input = "2446";
		String expected = "MMCDXLVI"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_MMM_when_3000 () {		
		//Given
		String input = "2446";
		String expected = "MMCDXLVI"; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
	@Test
	public void should_return_null_when_4000 () {		
		//Given
		String input = "4000";
		String expected = ""; 
		RomanNumerals romanNumeral = new RomanNumerals();
		//When
		String actual = romanNumeral.convertToRoman(input);
		//Then
		Assert.assertEquals(expected, actual);
	}
}
