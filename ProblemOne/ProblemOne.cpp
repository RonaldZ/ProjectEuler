/*
	Project Euler - Problem One.
	Author: Ronald Zielaznicki
	Problem: If we list all the natural numbers below 10 that are multiples 
		of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		Find the sum of all the multiples of 3 or 5 below 1000
*/

#include <iostream>
using namespace std;

class ProblemOne{
	public:
		int sumOfMultiples(int);
};

//finds the sum of the multiples of 3 or 5 up to number x
int ProblemOne::sumOfMultiples(int x){
	int sumReturn = 0;
	for(int i = 3; i < x; i +=3)
		sumReturn += i;
	
	for(int i = 5; i < x; i +=5)
		if(i % 3 != 0)
			sumReturn += i;
			
	return sumReturn;
}

int main(){
	ProblemOne prob1;
	
	cout << "Answer: " << prob1.sumOfMultiples(1000);
	
	return 1;
}

