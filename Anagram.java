package week2.day1.assignments;

import java.util.Arrays;

public class Anagram {
	public boolean isAnagram(String strTextFirst, String strTextSecond) {
		boolean countMatch = false;// initialize boolean value
		if (strTextFirst.length() == strTextSecond.length()) {// check both length equal
			char[] strTextFirstArray = strTextFirst.toCharArray();// convert first String in to char Array
			char[] strTextSecondArray = strTextSecond.toCharArray();// convert second String in to char Array
			Arrays.sort(strTextFirstArray);// sorting the first array
			Arrays.sort(strTextSecondArray);// sorting the second array
			for (int i = 0; i < strTextFirstArray.length; i++) {
				if (strTextFirstArray[i] == strTextSecondArray[i]) {// checking both index having same value
					countMatch = true;
				} else {
					countMatch = false;// if any index getting different character making as false and break the loop
					break;
				}
			}

		}
		return countMatch;
	}

	public static void main(String[] args) {
		Anagram objAnagram = new Anagram();
		String strTextFirst = "stops";
		String strTextSecond = "potss";
		boolean isCheck = objAnagram.isAnagram(strTextFirst, strTextSecond);
		if (isCheck) {
			System.out.println("The given strings " + strTextFirst + ", " + strTextSecond + " are Anagram");
		} else {
			System.out.println("The given strings " + strTextFirst + ", " + strTextSecond + " are not Anagram");
		}
	}

}
