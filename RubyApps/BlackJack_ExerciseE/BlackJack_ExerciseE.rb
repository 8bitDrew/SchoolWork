# Andrew Cox
# WEB312
# Blackjack.rb
# Bellevue University


# Define the classes

# Screen class
class Screen

	def cls
		puts ("\n" * 50)
		puts "\a"
	end

	def pause
		STDIN.gets
	end

end

# Game class
class Game

	# Displays a greeting
	def display_greeting

		Console_Screen.cls

		File.new("BJ_Greeting.txt", "r").each do |line|
			puts line
		end


		Console_Screen.pause	

	end

	# Display the instructions
	def display_instructions

		Console_Screen.cls

		File.new("BJ_Instructions.txt", "r").each do |line|
			puts line
		end

		Console_Screen.pause

	end

	# Controls game play
	def play_game

		Console_Screen.cls

		# To deal the initial cards
		playerHand = get_new_card
		dealerHand = get_new_card

		# Call the method for dealing cards to the player
		playerHand = complete_player_hand(playerHand, dealerHand)
	
		# As long as under 21, call the method that controls the dealer hand
		if playerHand <= 21 then
			dealerHand = play_dealer_hand(dealerHand)
		end

		# Call the method to determine the winner
		determine_winner(playerHand, dealerHand)

	end

	# Method to deal cards
	def get_new_card

		# Assign random number between 1 & 13
		card = 1 + rand(13)
	
		# Ace's are worth 11
		return 11 if card == 1 

		# 10 or more is a face card, worth 10
		return 10 if card >= 10

		return card 

	end

	# Method to deal the players hand
	def complete_player_hand(playerHand, dealerHand)

		loop do

			Console_Screen.cls 

			# Displays the current hands of both player and dealer
			puts "Player's hand: " + playerHand.to_s + "\n\n"
			puts "Dealer's hand: " + dealerHand.to_s + "\n\n\n\n\n\n"
			print "Would you like another card? (Y/N) "

			reply = STDIN.gets
			reply.chop! 
	
			# Check if another card is wanted, call the proper method]
			if reply =~ /y/i then
				playerHand = playerHand + get_new_card
			end
	
			# Check if another is not wanted, end the loop
			if reply =~ /n/i then
				break 
			end

			# Check if player busted, end the loop
			if playerHand > 21 then
				break 
			end

		end
	
		# Return value of players hand
		return playerHand

	end

	# Method that manages the dealer hand
	def play_dealer_hand(dealerHand)

		loop do 

			# Check if the dealer hand is less than 17
			if dealerHand < 17 then
				dealerHand = dealerHand + get_new_card
			else
				break
			end

		end

		return dealerHand

	end 

	# Method to determine the winner
	def determine_winner(playerHand, dealerHand)

		Console_Screen.cls 

		#Show the value of the player and dealer's hands
		puts "Player's hand: " + playerHand.to_s + "\n\n"
		puts "Dealer's hand: " + dealerHand.to_s + "\n\n\n\n\n\n"

		if playerHand > 21 then  #See if the player has gone bust
				puts "You have gone bust!\n\n"
				print "Press Enter to continue."    
			else  #See if the player and dealer have tied
			if playerHand == dealerHand then
				puts "Tie!\n\n"
				print "Press Enter to continue."
			end
			#See if the dealer has gone bust
			if dealerHand > 21 then
					puts "The Dealer has gone bust!\n\n"
					print "Press Enter to continue."
				else
				#See if the player's hand beats the dealer's hand
				if playerHand > dealerHand then
					puts "You have won!\n\n"
					print "Press Enter to continue."
				end
				#See if the dealer's hand beats the player's hand
				if playerHand < dealerHand then
					puts "The Dealer has won!\n\n"
					print "Press Enter to continue."
				end
			end  
		end

		Console_Screen.pause      

	end

	# Method to display credits
	def display_credits

		Console_Screen.cls

		File.new("BJ_Credits.txt", "r").each do |line|
			puts line
		end

	end

end


# Main Script

Console_Screen = Screen.new  # New screen object
BJ = Game.new  # New game object

# Show the greeting
BJ.display_greeting

answer = ""  # Empty variable for player answer

# oop until the player enters y or n and do not accept any other input
loop do

	Console_Screen.cls 

	# Ask if the player wants to play
	print "Are you ready to play Ruby Blackjack? (y/n): "

	answer = STDIN.gets 
	answer.chop!
 
	# Terminate the loop if valid input was provided
	break if answer =~ /y|n/i 

end 

# Analyze the player's answer
if answer =~ /n/i  

	Console_Screen.cls 

	# Maybe some other time
	puts "Okay, perhaps another time.\n\n"

	else

	# Display the instructions
	BJ.display_instructions

	playAgain = ""  # Empty variable, for playing again

	loop do 

		# Lets play the game
		BJ.play_game

		loop do 

			Console_Screen.cls
			# Ask to play again
			print "Would you like to play another hand? (y/n): "

			playAgain = STDIN.gets
			playAgain.chop! 

			break if playAgain =~ /n|y/i

		end

		break if playAgain =~ /n/i

	end

	# Display credits
	BJ.display_credits

end
