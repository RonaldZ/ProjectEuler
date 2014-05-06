--[[
	Project Euler - Problem Two.
	Author: Ronald Zielaznicki
	Problem: By considering the terms in the Fibonacci sequence whose 
	values do not exceed four million, find the sum of the even-valued 
	terms.
--]]

function sumOfEvenFibs(limit)
	sumReturn = 0;
	j = 0
	i = 1
	while (i < limit)  do
		if(i % 2 == 0) then
			sumReturn = sumReturn + i;
		end
		i = i + j;
		j = i - j;
	end
	
	return sumReturn;
end

print("Answer: ".. sumOfEvenFibs(4000000));