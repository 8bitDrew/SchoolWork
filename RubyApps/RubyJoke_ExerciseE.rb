# Andrew Cox
# WEB312
# Assignment 1.1
# Bellevue University
# Ruby Joke Program - it tells jokes!

class Screen
	def cls #Define a method that clears the screen
		puts ("\n" * 50) #Scrolls the screen 50 times
	end
end

Console_Screen = Screen.new 
Console_Screen.cls #Clear the screen

puts "Would you like to hear some Dad jokes? (y/n)" #Ask the user if they want to hear some bad jokes
answer = STDIN.gets #receive input
answer.chop! #remove extra characters

if answer == "n" #validate for 'n' input
	Console_Screen.cls 
	puts "Sorry to hear that.  Please return and play again soon." #bye-bye
else #validate for all other input
	Console_Screen.cls #clear the screen
	puts "What time did the man go to the dentist? (press enter)" #output joke
	pause = STDIN.gets #user presses enter (or really any key at all)
	puts "Tooth Hurt-y (press enter)" #output the punch line
	pause = STDIN.gets #user presses enter 
	
	#each iteration of a joke follows the same process as above until all jokes are told
	
	Console_Screen.cls
	puts "Did you hear about the guy who invented LifeSavers? (press enter)"
	pause = STDIN.gets
	puts "They say he made a mint! (press enter)"
	pause = STDIN.gets
	
	Console_Screen.cls
	puts "Why do chicken coops have two doors? (press enter)"
	pause = STDIN.gets
	puts "Because if they had four doors, they'd be chicken sedans! (press enter)"
	pause = STDIN.gets
	
	Console_Screen.cls
	puts "Why did the clydesdale give the pony a glass of water? (press enter)"
	pause = STDIN.gets
	puts "Because he was a little horse! (press enter)"
	pause = STDIN.gets
	
	Console_Screen.cls
	puts "How do you make a Kleenex dance? (press enter)"
	pause = STDIN.gets
	puts "Put a little boogie in it! (press enter)"
	pause = STDIN.gets
	
	Console_Screen.cls
	puts "What is Beethovens favorite fruit? (press enter)"
	pause = STDIN.gets
	puts "Ba-na-na-na! (press enter)"
	pause = STDIN.gets
	
	Console_Screen.cls
	puts "What is Forrest Gumps computer password? (press enter)"
	pause = STDIN.gets
	puts "1forrest1 (press enter)"
	pause = STDIN.gets

	Console_Screen.cls
	puts "What did the pirate say on his 80th birthday? (press enter)"
	pause = STDIN.gets
	puts "Aye Matey! (press enter)"
	pause = STDIN.gets	
	
	Console_Screen.cls
	puts "Did you hear about the cheese factory that blew up in France? (press enter)"
	pause = STDIN.gets
	puts "There was nothing left but de Brie! (press enter)"
	pause = STDIN.gets	
	
	Console_Screen.cls #clear the screen
	puts "Thanks you playing my game." #thank the user for listening to bad jokes
end #end the program