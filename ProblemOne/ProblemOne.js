/*
	Project Euler - Problem One.
	Author: Ronald Zielaznicki
	Problem: If we list all the natural numbers below 10 that are multiples 
		of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		Find the sum of all the multiples of 3 or 5 below 1000
*/

//finds the sum of the multiples of 3 or 5 up to number x
function sumOfMultiples(x){
	var sumReturn = 0;
	
	for(var i = 3; i < x; i += 3){
		sumReturn += i;
	}
	
	for(var i = 5; i < x; i += 5){
		if(i % 3 != 0)
			sumReturn += i;
	}
	
	return sumReturn;
}

console.log("Answer: " + sumOfMultiples(1000));