# Andrew Cox
# Assignment 3.2 - Buggy Code
# Vacation Calculator

puts "\nWelcome to the bonus calculator.\n"
print "How many years have you been working here?\n\n"
answer = STDIN.gets
answer.chop!
answer = answer.to_i

case
	when (answer.between?(1 ,5))
		puts "You get 1 week of vacation per year."
	when (answer.between?(6, 10))
		puts "You get 2 weeks of vacation per year."
	when (answer.between?(11, 15))
		puts "You get 3 weeks of vacation per year."
	when (answer.between?(16, 20))
		puts "You get 4 weeks of vacation per year."
	else
		puts "You get 5 weeks of vacation per year."
end