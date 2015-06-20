public class ProblemSix{
	
	private int findSumofSquares(int num){
		int returnValue = 0;
		for(int i = 1; i <= num; i++)
			returnValue += i * i;
			
		return returnValue;
			
	}
	
	private int findSquareofSums(int num){
		int returnValue = 0;
		
		for(int i = 1; i <= num; i++)
			returnValue += i;
			
		returnValue = returnValue * returnValue;
		
		return returnValue;
	}
	
	public static void main(String[] args){
		ProblemSix test = new ProblemSix();
		
		System.out.println("Answer: " + (test.findSquareofSums(100) - test.findSumofSquares(100)));
		
	
	}
}