package week2.day1.assignments;

public class FindTypes {
	public void findEachCharacterType() {
		String strTest = "$$ Welcome to 2nd Class of Automation $$ ";
		char[] strTestCharArray = strTest.toCharArray();// Convert the String to character array
		char checkType;
		int letter = 0, space = 0, num = 0, specialChar = 0;
		for (int i = 0; i < strTest.length(); i++) {
			checkType = strTestCharArray[i];// storing each character value in 'checkType' character
			// check the letter count
			if ((Character.isLetter(checkType))) {// check the character is a letter
				letter++;
			} else if (Character.isDigit(checkType))// check the character is a digit
			{
				num++;
			} else if (Character.isSpaceChar(checkType))//// check the character is a space
			{
				space++;
			} else {
				specialChar++;// consider remaining all are special character
			}

		}
		System.out.println("letter: " + letter);
		System.out.println("space: " + space);
		System.out.println("number: " + num);
		System.out.println("specialCharcter: " + specialChar);
	}

	public static void main(String[] args) {
		FindTypes objFindType = new FindTypes();
		objFindType.findEachCharacterType();
	}

}
