/*
	Project Euler - Problem One.
	Author: Ronald Zielaznicki
	Problem: If we list all the natural numbers below 10 that are multiples 
		of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		Find the sum of all the multiples of 3 or 5 below 1000
*/

#include<stdio.h>

int sumOfMultiples(int x);

int main(){
	int answer = sumOfMultiples(1000);
	printf("Answer: %2d\n", answer);
	
	system("PAUSE");
	return 0;
}

int sumOfMultiples(int x){
	int sumReturn = 0;
	int i = 0;
	for(i = 3;i < x; i += 3)
		sumReturn +=i;
	for(i = 5;i < x; i += 5)
		if((i % 3) != 0)
			sumReturn += i;
	
	return sumReturn;
}