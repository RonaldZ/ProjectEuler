#	Project Euler - Problem Two.
#	Author: Ronald Zielaznicki
#	Problem: By considering the terms in the Fibonacci sequence whose 
#	values do not exceed four million, find the sum of the even-valued 
#	terms.

def sumOfEvenFibs(limit):
	sumReturn = 0
	i = 1
	j = 0
	
	while(i < limit): 
	 if(i % 2 == 0):
	  sumReturn += i
	 i += j
	 j = i -j
	
	return sumReturn

print("Answer: ", sumOfEvenFibs(4000000))