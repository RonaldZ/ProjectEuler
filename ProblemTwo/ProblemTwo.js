/*
	Project Euler - Problem Two.
	Author: Ronald Zielaznicki
	Problem: By considering the terms in the Fibonacci sequence whose 
	values do not exceed four million, find the sum of the even-valued 
	terms.
*/

function sumOfEvenFibs(limit){
	var sumReturn = 0;
	
	for(var i = 1, j = 0; i < limit; i +=j, j = i - j){
		if(i % 2 == 0)
			sumReturn += i;
	}
	
	return sumReturn;
}

console.log("Answer: " + sumOfEvenFibs(4000000));