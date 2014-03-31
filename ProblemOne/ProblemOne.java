public class ProblemOne{
	//finds the sum of the multiples of 3 or 5 up to number x
	public int sumofmultiples(int x){
		int sumReturn = 0;
		for(int i = 3; i < x;i += 3)
			sumReturn += i;
		for(int i = 5; i < x;i += 5)
			if(i % 3 != 0)
				sumReturn += i;
				
		return sumReturn;
	}
	public static void main(String[] args){
		ProblemOne prob1 = new ProblemOne();
		
		System.out.println(prob1.sumofmultiples(1000));
		
	}
}