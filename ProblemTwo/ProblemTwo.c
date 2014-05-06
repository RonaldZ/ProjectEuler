/*
	Project Euler - Problem Two.
	Author: Ronald Zielaznicki
	Problem: By considering the terms in the Fibonacci sequence whose 
	values do not exceed four million, find the sum of the even-valued 
	terms.
*/

#include <stdio.h>

int sumOfEvenFibs(int limit);

int main(){
	int answer = sumOfEvenFibs(4000000);
	
	printf("Answer: %2d\n", answer);
	return 0;
}

int sumOfEvenFibs(int limit){
	int sumReturn = 0;
	int i;
	int j;
	for(i = 1, j = 0; i <= limit; i += j){
		j = i-j;
		if(i % 2 == 0)
			sumReturn += i;
	}
	
	return sumReturn;
}
