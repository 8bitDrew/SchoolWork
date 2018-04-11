# Andrew Cox
# WEB312
# Assignment 2.2 - Debug
# Bellevue University

class Screen
	def cls
		puts ("\n" * 50)
	end
end

words = ['true', 'false', 'unknown']
secret = words[rand(3)]

puts "I'm thinking of a word.  Your options are true, false, and unknown."

print "Can you guess what I'm thinking of? "
while guess = STDIN.gets
  guess.chomp!
  if guess == secret
    puts "You win!"
	break
  else
    puts "Sorry, you lose."
  end
  print "guess? "
end
puts "The word was ", secret, "."