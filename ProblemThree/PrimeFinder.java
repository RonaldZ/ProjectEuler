import java.util.ArrayList;

public class PrimeFinder{
	ArrayList<Integer> primeNumbers = new ArrayList<Integer>();

	public PrimeFinder(){
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		primeNumbers.add(7);
	}
	
	//Input n: 0 corresponds to the first element in the array.
	//Output: The nth prime number.
	//If the nth prime does not exist in the list, findNthPrime will be invoked to find it;
	public int getNthFib(int n){
		if(n > primeNumbers.size() -1)
			findNthPrime(n);
			
		return primeNumbers.get(n);
	}
	
	//Input n: 0 corresponds to the first prime number.
	//Finds the nth prime number and adds it to the end of the arraylist.
	private void findNthPrime(int n){
		int newPrime = 0;
		boolean isPrime = false;
		for(int i = primeNumbers.size() - 1; i < n; i++){
			newPrime = primeNumbers.get(i);
			while(!isPrime){
				newPrime += 2;
				for(int j = 0; j < primeNumbers.size(); j++){
					if(newPrime % primeNumbers.get(j) == 0){
						isPrime = false;
						break;
					}
					else
						isPrime = true;
				}
				
				if(isPrime){
					primeNumbers.add(newPrime);
				}
			}
			isPrime = false;
		}
	}

	//Input num: The number to be factored out
	//Return: The largest prime factor, or if the number itself is prime: -1.
	public long findGreatestPrimeFactor(long num){
		long temp = num;
		int primeNum = 0;
		int newPrimeNum = 0;
		for(int i = 0;primeNum <= temp;i++){
			newPrimeNum = getNthFib(i);
			if(temp % newPrimeNum == 0){
				temp = temp / newPrimeNum;
				if(newPrimeNum > primeNum)
					primeNum = newPrimeNum;
			} else if(newPrimeNum >= num/2)
				return -1;
		}
		
		return primeNum;
	}
}