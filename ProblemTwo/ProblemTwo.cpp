/*
	Project Euler - Problem Two.
	Author: Ronald Zielaznicki
	Problem: By considering the terms in the Fibonacci sequence whose 
	values do not exceed four million, find the sum of the even-valued 
	terms.
*/

#include <iostream>
using namespace std;

class ProblemTwo{
	public:
		int sumOfEvenFibs(int);
};


int ProblemTwo::sumOfEvenFibs(int limit){
	int sumReturn = 0;
	
	int j = 0;
	for(int i = 1; i <= limit; i += j){
		j = i-j;
		if(i % 2 == 0)
			sumReturn += i;
	}
	
	return sumReturn;
}

int main(){
	ProblemTwo prob2;
	
	cout << "Answer: " << prob2.sumOfEvenFibs(4000000);
	
	return 0;
}