/*
	Name: Ronald Zielaznicki
	Date: 5/22/2014
	Problem: What is the smallest positive number that is evenly divisible by all
	the numbers from 1 to 20.
	
	Thoughts: Fairly straight forward. I skipped checking 1,2, and 20 since my
	method has those numbers given as divisible. Other than that, I just iterate
	by 20 and check each number till the correct number is found. However, this
	method is extremely inefficient.
*/

public class ProblemFive{
	
	public void run(){
		int num = 20;
		boolean divisible = false;
		
		while(!divisible){
			for(int i = 3;i < 20;i++)
				if(num % i == 0)
					divisible = true;
				else{
					num += 20;	
					divisible = false;
					break;
				}
		}
		
		System.out.println(num);
	}

	public static void main(String[] args){
		ProblemFive test = new ProblemFive();
		
		test.run();
	}
}