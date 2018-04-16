print "Enter heads or tails?"

hort = gets.chomp

#Changed both comparisons to ==
unless hort == 'heads' || hort == 'tails'    
	print "I _said_ heads or tails.  Can't you read?\n"   
	exit(1)
end

# Added logic to generate a random number
def generate_random
	return randomNo = 1 + rand(2)
end

#Assigns the random number to a variable
number = generate_random

#Altered the logic to dictate whether the toss is heads or tails
if number == 1 then
	toss = "heads"
else
	toss = "tails"
end

print "Toss was #{toss}.\n"

print "You Win!\n" if hort == toss