--[[
	Project Euler - Problem One.
	Author: Ronald Zielaznicki
	Problem: If we list all the natural numbers below 10 that are multiples 
		of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23.
		Find the sum of all the multiples of 3 or 5 below 1000
		
--]]
	
-- finds the sum of the multiples of 3 or 5 up to number x
function sumOfMultiples(x)
	sumReturn = 0;
	for i = 3,x-1,3 do
		sumReturn = sumReturn + i
	end
	
	for i = 5,x-1,5 do
		if (i % 3 ~= 0) then
			sumReturn = sumReturn + i
		end
	end
	
	return sumReturn
end

print("Answer: ".. sumOfMultiples(1000))