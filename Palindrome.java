package week2.day1.assignments;

public class Palindrome {
	public void ispalindrome() {
		String strFirst = "madam";
		String strTemp = "";
		char[] strFirstCharArrray = strFirst.toCharArray();// storing each character in char array
		for (int i = strFirstCharArrray.length - 1; i >= 0; i--) {// reduce from the length size to reverse the string
			strTemp = strTemp + strFirstCharArrray[i];// storing the each character in reverse
		}
		if (strFirst.equalsIgnoreCase(strTemp)) {// checking both string matches
			System.out.println("The given string " + strFirst + " is palindrome");
		} else {
			System.out.println("The given string " + strFirst + " is not palindrome");
		}
	}

	public static void main(String[] args) {
		Palindrome objPali = new Palindrome();

		objPali.ispalindrome();
	}

}
