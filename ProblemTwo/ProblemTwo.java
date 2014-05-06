/*
	Project Euler - Problem Two.
	Author: Ronald Zielaznicki
	Problem: By considering the terms in the Fibonacci sequence whose 
	values do not exceed four million, find the sum of the even-valued 
	terms.
*/

public class ProblemTwo{
	public int sumOfEvenFibs(int limit){
		int sumReturn = 0;
		
		for(int i = 1, j = 0; i < limit; i += j, j = i - j){
			if(i % 2 == 0)
				sumReturn += i;
		}
		
		return sumReturn;
	}

	public static void main(String[] args){
		ProblemTwo problemTwo = new ProblemTwo();
		
		System.out.println("Answer: " + problemTwo.sumOfEvenFibs(4000000));
	}
}