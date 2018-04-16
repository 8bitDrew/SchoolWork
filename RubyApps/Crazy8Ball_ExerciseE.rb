#	Andrew Cox
#	WEB312
#	Assignment 2.1
#	Bellevue University
#	Its a Magic 8 Ball!

class Screen #define the Screen class

	def cls
		puts ("\n" * 50) #50 new lines
		puts "\a" #a nice little beep
	end
	
	def pause #pauses the screen to wait for the user
		STDIN.gets 
	end
end

class Ball #define the Ball class
	attr_accessor :randNum, :greeting, :question, :goodbye 
	 
	def get_fortune 
		randNum = 1 + rand(6) #grabs a random number for the case statement below
		
		case randNum #case that will execute based on the random number above
			when 1
				$prediction = "Yes"
			when 2
				$prediction = "No"
			when 3
				$prediction = "Maybe"
			when 4
				$prediction = "Hard to tell.  Ask me again later."
			when 5
				$prediction = "Unlikely"
			when 6
				$prediction = "Absolutely"
		end
	end
	
	def say_greeting #greets the user when the program executes
		greeting = "\t\t Welcome to Drew's Magic 8-Ball" +
		"game\n\n\n\n\n\n\nPress Enter to continue.\n\n: "
		print greeting
	end
	
	def get_question #prompts the user to ask a question
		question = "Type your question and and press Enter \n\n: "
		print question
	end
	
	def tell_fortune() #outputs the 'prediction'
		print "The answer is " + $prediction + ". \n\n: "
	end
	
	def say_goodbye #says goodbye when the program is closing
		goodbye = "Thanks for playing my Magic 8-Ball game\n\n"
		puts goodbye
	end
end

Console_Screen = Screen.new #new Screen 
Eight_Ball = Ball.new #new Ball

Console_Screen.cls #clear the screen
Eight_Ball.say_greeting #greet the user

Console_Screen.pause #pause until user presses a key

answer = "" #answer variable

until answer == "y" || answer == "n" #checks if the answer is either Y or N

  Console_Screen.cls #clear the screen again

  print "Would you like to have your fortune predicted? (y/n)\n\n: " 

  answer = STDIN.gets  
  answer.chop! 

end 

if answer == "n"  

  Console_Screen.cls  

  puts "Okay, perhaps another time. \n\n" #exits the program if the user doesn't want a fortune

else 

  gameOver = "No" 

  until gameOver == "Yes" 
  
    Console_Screen.cls  
    
    Eight_Ball.get_question
  
    Eight_Ball.get_fortune
  
    Console_Screen.pause 
  
  
    Console_Screen.cls 
  
    Eight_Ball.tell_fortune

    Console_Screen.pause
	
    Console_Screen.cls 

    print "Press Enter to ask another question or type q to quit. \n\n: "

    answer = STDIN.gets 
    answer.chop! 

    if answer == "q" #evaluates if the user enters Q, quits if they do
      gameOver = "Yes"
    end

  end

  Console_Screen.cls

  Eight_Ball.say_goodbye
  
end