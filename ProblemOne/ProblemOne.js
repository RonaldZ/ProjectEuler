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