#	Andrew Cox
#	WEB312
#	Assignment 3.1
#	Bellevue University
# 	Lets go typing!

#Console window class
class Screen

  def cls  #clear the display area when called
    puts ("\n" * 50)  #Scroll the screen 50 times
    puts "\a"  #BEEP!
  end
  
  def pause    #pauses the display area when called
    STDIN.gets                  
  end
  
end

#Lets define the typing test
class Test
 
  #Method to display a greeting
  def display_greeting
  
    Console_Screen.cls  #CLEAR SCREEN!!
  
    #Now lets show the welcome screen
    print "\t\t  Welcome to 8bit_Drew's Typing Challenge!" +
    "\n\n\n\n\n\n\n\n\n\n\n\n\nPress Enter to " +
               "continue. \n\n: "
  
  Console_Screen.pause       #Lets pause and reflect

  end
 
  #Lets define the instructions
  def display_instructions
    
    Console_Screen.cls       #CLEAR SCREEN!!
    puts "\t\t\tInstructions:\n\n"  #And now we output the instructions
    puts %Q{    This test consists of a series of 5 typing challenges. 
    The challenge sentences are presented one at a time. To respond 
    correctly, you must retype each sentence exactly as shown and press 
    the Enter key. Your grade will be displayed at the end of the test.
    \n\n\n\n\n\n\n\n\n
    Press Enter to continue.\n\n}

    Console_Screen.pause       #Lets pause and reflect
    
  end
 
  #Here come the typing challenges
  def present_test(challenge)
    
    Console_Screen.cls       #CLEAR SCREEN!!
    print challenge + "\n\n: "  #Show that challenge sentence!!
    result = STDIN.gets  #Show me what ya got, user
    result.chop!         #Chop the end of line marker!
    
    #Lets see if the user is correct
    if challenge == result then
    
      #Gotta keep track of where the user is correct
      $noRight += 1  
      Console_Screen.cls       #CLEAR SCREEN!!
      #Gotta press enter
      print "Correct!\n\nPress Enter to continue." 
      Console_Screen.pause       #Lets pause and reflect
      
    else  
    
      Console_Screen.cls       #CLEAR SCREEN!!
      #Gotta press enter
      print "Incorrect!\n\nPress Enter to continue."
      Console_Screen.pause       #CLEAR SCREEN!!
      
    end
    
  end

  #Lets find out how the user did
  def determine_grade
  
    Console_Screen.cls       #CLEAR SCREEN!! 
  
    #3 or more and you win!
    if $noRight >= 3 then
    
      #Good job, user!!
      print "You retyped " + $noRight.to_s + " sentence(s) correctly. "
      puts "You have passed the typing test!  Good Job!\n\nPress Enter to continue."
      
    else  #Didn't get 3 or more right?
    
      #Gotta work on those typing skills
      print "You retyped " + $noRight.to_s + " sentence(s) correctly. "
      puts "You have failed the typing test!  Better luck next time!\n\nPress Enter to continue."
      
    end
    
  end

end

#This tracks the number of correct sentences
$noRight = 0

Console_Screen = Screen.new  #NEW SCREEN!!
Typing_Test = Test.new       #NEW TEST!!

#Show that greeting!
Typing_Test.display_greeting

Console_Screen.cls			#CLEAR SCREEN!!

#Do you want to play a game?
print "Would you like to test your typing skills? (y/n)\n\n: "

answer = STDIN.gets  #Show me what you got
answer.chop!  #SLAP-CHOP
  
until answer == "y" || answer == "n" #C'mon, only two options here.

  Console_Screen.cls  #CLEAR SCREEN!!

  #Do you want to play a game?
  print "Would you like to test your typing skills? (y/n)\n\n: "

  answer = STDIN.gets  #Show me what you got
  answer.chop!  #SLAP-CHOP

end 

#Checking the response
if answer == "n"  #Well then I'll just take my program and go home

  Console_Screen.cls  #CLEAR SCREEN!!

  #Maybe later, buddy?
  puts "Okay, perhaps another time.\n\n"

else  #TEST TIME!!

  #Lets show those instructions!
  Typing_Test.display_instructions
  
  #Lets show those sentences one at a time!
  Typing_Test.present_test "May the Force be with you."
  Typing_Test.present_test "I love the smell of napalm in the morning."
  Typing_Test.present_test "You're gonna need a bigger boat."
  Typing_Test.present_test "Where we're going, we don't need roads."
  Typing_Test.present_test "I find your lack of faith disturbing."

  #Lets show that grade!!
  Typing_Test.determine_grade

  Console_Screen.pause       #Lets pause and reflect
  
  Console_Screen.cls  #CLEAR SCREEN!!
  #Thanks for playing, buddy
  puts "Thank you for taking 8bit_Drew's Typing Challenge.\n\n"

end


