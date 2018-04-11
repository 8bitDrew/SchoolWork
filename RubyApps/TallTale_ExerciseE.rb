# Andrew Cox
# Web312
# Assignment 1.2
# Bellevue University
# TallTale.rb - it tells a story!

#define a class representing the console window
class Screen
	def cls
		puts ("\n" * 50) #scroll the screen 50 times
		puts "\a" #give a little beep
	end
end

#define a class representing the story
class Tale

	#Define the story elements
	attr_accessor :monster, :villain, :object, :place, :location
	
	#Define the paragraphs
	attr_accessor :p1, :p2, :p3, :p4
	
	#Define a method to output the paragraphs
	def tell_Story(paragraph)
		puts paragraph
	end
end

Console_Screen = Screen.new #new screen object

Console_Screen.cls #clear that screen!

#Ask if the user wants to hear a story
print "Would you like hear a tale of action and adventure? (y/n)\n\n: "
answer = STDIN.gets #receive input
answer.chomp! #remove extra characters

#validate for 'n' answer
if answer == "n" 
	Console_Screen.cls
	puts "Well, perhaps another time.\n\n" #bye-bye
	
#validate all other input	
else
	Story = Tale.new #new story object
	Console_Screen.cls
	
	#prompt user for input, each time receiving input, removing extra characters, and clearing the screen before grabbing the next piece of input
	print %Q{Type the name of a horrifying monster (press enter)\n\n: }
	monster = STDIN.gets
	monster.chomp!
	
	Console_Screen.cls
	
	print %Q{Type the name of your favorite movie star (press enter)\n\n: }
	villain = STDIN.gets
	villain.chomp!
	
	Console_Screen.cls
	
	print %Q{Type the name of an object (press enter)\n\n: }
	object = STDIN.gets
	object.chomp!

	Console_Screen.cls
	
	print %Q{Type the name of a good hiding place (press enter)\n\n: }
	place = STDIN.gets
	place.chomp!	
	
	Console_Screen.cls
	
	print %Q{Type the name of a popular vacation spot (press enter)\n\n: }
	location = STDIN.gets
	location.chomp!	
	
	#Story.p1 - Story.p4 represent each paragraph of the story
	Story.p1 = %Q{ Once upon a time in a faw away land, jhust on the outskits of #{location}, there lived three very brave young children named Alexander, William, and Molly.  These children were known far and wide as the heroes who once saved the inhabitants of #{location} from an evil #{monster}. One day dark clouds descended over #{location}.  For 5 nights and 5 days, a great storm raged, flooding all of the land in #{location}, driving its inhabitants into the hills. (press enter)}
	 
	Story.p2 = %Q{ The good people of #{location} were not the only ones driven into the hills. An evil monster named #{villain} was also awoken from a 1,000 year slumber and forced from its lair by the torrential floods that followed the storm into #{location}. #{villain}, having been asleep for so long, was now hungry and soon began to prey upon the helpless people. By the time the water began to recede, over half of the inhabitants had become meals for #{villain}. (press enter)}
	
	Story.p3 = %Q{ Desperate for help, the remaining inhabitants of #{location} sent word to Alexander, William, and Moly that their help was once again needed. The three children soon arrived on the scene only to find that #{villain} had cornered the last inhabitant inside a #{place} and was preparing to eat one last meal before returning to their secret lair in #{location}. (press enter)}
	
	Story.p4 = %Q{ Immediately, Alexander, William, and Molly flew into action.  Alexander threw a #{object} and hit #{villain} to get his attention. At the same time, William and Molly crept up behind the villain.  William then threw a rope around the feet of #{villain}, momentarily tying them up and allowing Molly to move in and spray #{villain} with a can of bug spray, immediately immobilizing and killing #{villain}. The remaining inhabitants returned their homes and soon life in #{location} was back to normal. Alexander, William, and Molly returned to their homes, quietly living on the edge of #{location}, waiting until the day they would be needed again. (press enter)}
	
	#The following 4 sections clear the screen, displays a story paragraph, and forces the user to hit a key to continue
	Console_Screen.cls
	Story.tell_Story Story.p1
	STDIN.gets
	
	Console_Screen.cls
	Story.tell_Story Story.p2
	STDIN.gets	
	
	Console_Screen.cls
	Story.tell_Story Story.p3
	STDIN.gets

	Console_Screen.cls
	Story.tell_Story Story.p4
	STDIN.gets	
	
	#good-bye and thanks for playing
	Console_Screen.cls
	puts "Thanks for helping tell this story!\n\n"
	
end























