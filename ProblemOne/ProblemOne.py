#	Project Euler - Problem One.
#	Author: Ronald Zielaznicki
#	Problem: If we list all the natural numbers below 10 that are multiples 
#		of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
#		Find the sum of all the multiples of 3 or 5 below 1000

#finds the sum of the multiples of 3 or 5 up to number x
def sumOfMultiples(x):
	sumReturn = 0
	
	i = 3
	while (i < x):
		sumReturn += i
		i += 3
	
	i = 5
	while (i < x):
		if(i % 3 != 0):
			sumReturn += i
		i += 5;
	
	return sumReturn

print "Answer: ", sumOfMultiples(1000)