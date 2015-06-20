/*
	Project Euler - Problem Three.
	Author: Ronald Zielaznicki
	Problem: What is the largest prime factor of the number 600851475143?
	Thoughts: I've worked on this problem previously, and my approach remains the same.
	I created a Prime number finder, then used the primes I found to factor the given number
	until the number could no longer be factored further. I hit a small hitch in the program
	because I had forgotten to type the second 1 in 60081475143, which is either prime or has a
	very high prime factor. I stopped the program from continuing at 10 minutes of run time.
*/

public class ProblemThree{
	private PrimeFinder find = new PrimeFinder();
	
	public void run(){
		long num = 600851475143L;
		long answer = find.findGreatestPrimeFactor(num);
		
		System.out.println("Answer: " + answer);
	}
	
	public static void main(String[] args){
		ProblemThree runner = new ProblemThree();
		runner.run();
	}
}