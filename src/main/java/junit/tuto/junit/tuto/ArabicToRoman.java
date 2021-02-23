package junit.tuto.junit.tuto;

public class ArabicToRoman {

	public String getRomanNumber_FromArabicNumber (int arabicNumber) {
		
		String tens = "";
		String myResult = "";

		while (arabicNumber-1000 >= 0) {
			tens+="M";
			arabicNumber -= 1000;
		}
		while (arabicNumber-500 >= 0) {
			tens+="D";
			arabicNumber -= 500;
		}
		while (arabicNumber-100 >= 0) {
			tens+="C";
			arabicNumber -= 100;
		}
		 
		
		if (arabicNumber-90 >= 0 && arabicNumber-90 <= 9) {
			tens+="XC";
			arabicNumber -= 90;
		} else if (arabicNumber-80 >= 0 && arabicNumber-80 <= 9) {
			tens+="LXXX";
			arabicNumber -= 80;
		} else if (arabicNumber-70 >= 0 && arabicNumber-70 <= 9) {
			tens+="LXX";
			arabicNumber -= 70;
		} else if (arabicNumber-60 >= 0 && arabicNumber-60 <= 9) {
			tens+="LX";
			arabicNumber -= 60;
		} else if (arabicNumber-50 >= 0 && arabicNumber-50 <= 9) {
			tens+="L";
			arabicNumber -= 50;
		} else if (arabicNumber-40 >= 0 && arabicNumber-40 <= 9) {
			tens+="XL";
			arabicNumber -= 40;
		} else if (arabicNumber-30 >= 0 && arabicNumber-30 <= 9) {
			tens+="XXX";
			arabicNumber -= 30;
		} else if (arabicNumber-20 >= 0 && arabicNumber-20 <= 9) {
			tens+="XX";
			arabicNumber -= 20;
		} else if (arabicNumber-10 >= 0 && arabicNumber-10 <= 9) {
			tens+="X";
			arabicNumber -= 10;
		} 
		
		for (int i=1; i<=arabicNumber; i++) { // No 0 in roman numbers
			if 		(i<=3) 				myResult += "I";
			else if (i==4) 				myResult = "IV";
			else if (i==5) 				myResult = "V";
			else if (i>=6 && i<=8) 		myResult += "I";
			else if (i==9) 				myResult = "IX";
		}
		
		return tens+""+myResult;
	}
	
}
