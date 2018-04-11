# Debug this!

class Screen
	def cls
		puts ("\n" * 25)
	end
end

Console_Screen = Screen.new

Console_Screen.cls #Changed to Console_Screen.cls

puts "Would you like to hear a few funny jokes? (y/n)"
answer = STDIN.gets #Changed to STDIN.gets
answer.chomp! #Changed to answer.chomp!

if answer == "n"
	Console_Screen.cls
else
	Console_Screen.cls
	puts "What is black and white and red all over? (press enter)"
	pause = STDIN.gets
	puts "An embarrassed Dalmation puppy! (press enter)"
end
 