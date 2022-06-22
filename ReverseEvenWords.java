package week2.day1.assignments;

public class ReverseEvenWords {
	
	public void reverseEvenWordsInString()
	{
	String strText="I am a software tester";
	String[] strArray= strText.split(" ");// split each string and storing in Array
	String strArrayConcatinate="";//declare temporary variable
	for(int i=0;i<strArray.length;i++)//index start with zero
	{
		if((i%2)!=0)//check the index is odd
		{
			String strArrayOddIndex=strArray[i].toString();//storing the odd index value in a string
			String strRevText="";//declare temporary variable for inner loop
			for(int j=strArrayOddIndex.length()-1;j>=0;j--)//create the loop for the string reverse
			{
				strRevText=strRevText+strArrayOddIndex.charAt(j);//appending the text in reverse by each character
			}
			strArray[i]=strRevText;//storing the reverse text in same index
			strArrayOddIndex=null;
		}
		strArrayConcatinate=strArrayConcatinate+strArray[i]+" ";//Concatenate each string from the array both index 
	}
	System.out.println("Reverse Even Index in a String as "+strArrayConcatinate);//printing the output
	}

	public static void main(String args[])
	{
		ReverseEvenWords objReverseEvenWords=new ReverseEvenWords();
		objReverseEvenWords.reverseEvenWordsInString();
	}
}
