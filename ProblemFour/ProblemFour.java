/*
	Name: Ronald Zielaznicki
	Date: 5/21/2014
	Problem: Find the largest palindrome made from the product of two 3-digit numbers.
	
	Thoughts: Starts from 999 * 999 and iterates down each side. Breaks from
	the number if the number is lower than previously generated number.
*/

public class ProblemFour{

	public boolean isPalindrome(int num){
		boolean returnValue = false;
		int modNum = 0;
		int tempNum = num;
		
		do{
			modNum = modNum * 10;
			modNum += tempNum % 10;
			tempNum = (int)tempNum / 10;
		} while(tempNum > 9);
		modNum = modNum * 10;
		modNum += tempNum % 10;
		
		if(modNum == num)
			returnValue = true;
			
		return returnValue;
	}
	
	public int findGreatestPalindromeProduct3Digit(){
		int returnValue = -1;
		int num = 0;
		
		for(int i = 999; i > 0; i--)
			for(int j = i; j > 0; j--){
				num = i * j;
				if(num < returnValue)
					break;
				if(isPalindrome(num))
					returnValue = num;
			}
		return returnValue;
	}

	public static void main(String[] args){
		ProblemFour fbp = new ProblemFour();
		System.out.println(fbp.findGreatestPalindromeProduct3Digit());
	}
}