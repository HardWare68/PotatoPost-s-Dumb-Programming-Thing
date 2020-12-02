import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalTime;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to PotatoPost's dumb programming thing!");
    System.out.println("Loading..."); // this doesnt actually load anything, i just do it so it looks cool lmao

    try {
      Thread.sleep(3000);
    } catch (Exception IntteruptedException) { // I have no idea what these two lines do, but program doesn't work without it.
      System.out.println("Heck.");
    } finally {
      System.out.println("Done!");
    }

    //just importing objects from files or something
    MathStuff mathStuff = new MathStuff();
    Scanner scan = new Scanner(System.in);
    StringJazz stringJazz = new StringJazz();
    GameThing gameThing = new GameThing();

    int userInput = 0; // this is the thing the scanner object uses to get the input
    int adder = 0; // this is what we add (look at case 2)
    int imStupid; // this variable is because i was stupid and concatenated two numbers together.
    byte programType = 0; // this variable is used to determine what the program is gonna do. like, you know, it chooses the stuff. you know.
    String stringThing = ""; // its a string thing
    boolean continueLoop = true; // determines if we want to continue the loop or not
    boolean validInput = false; //checks to make sure the user inputs a string when we want a string, int when we want int, etc.

    try {
      //continue the loop while the user keeps putting in "true"
      while (continueLoop) {
        System.out.println("\nSelect what you want to do (Enter the number):\n1.)Calculator Stuff\n2.)Cool Things with Strings™\n3.)Epic Gaming");

        //input check. i promise, eventually I'll put this into a function so it's simpler.
        //pinky promise
        validInput = false;
        while(!validInput){
          try{
            programType = Byte.parseByte(scan.next());
            validInput = true;
          } catch (Exception InputMismatchException){
            System.out.println("Please enter an integer.");
            validInput = false;
          }
        }

        //switch case for which option the user wants to do
        switch (programType) {
        case 1:
          System.out.println("\nSelect what you want to do (Enter the number):\n1.)Add two numbers\n2.)Add two numbers, but even cooler\n3.)Multiply two numbers\n4.)Summation");

          validInput = false;
          while(!validInput){
            try{
              programType = Byte.parseByte(scan.next());
              validInput = true;
            } catch (Exception InputMismatchException){
              System.out.println("Please enter an integer.");
              validInput = false;
            }
          }

          switch (programType) {
            case 1:
              //this complicated mess asks for two numbers and adds them together
              System.out.println("\nEnter a number:");
              validInput = false;
              while(!validInput){
                try{
                  userInput = Integer.parseInt(scan.next());
                  validInput = true;
                } catch (Exception InputMismatchException){
                  System.out.println("Please enter an integer.");
                  validInput = false;
                }
              }
              mathStuff.setValue(userInput, 1);

              System.out.println("\nEnter another number:");
              while(!validInput){
                try{
                  userInput = Integer.parseInt(scan.next());
                  validInput = true;
                } catch (Exception InputMismatchException){
                  System.out.println("Please enter an integer.");
                  validInput = false;
                }
              }
              mathStuff.setValue(userInput, 2);

              imStupid = mathStuff.x + mathStuff.y;
              System.out.println("\nThe two numbers added together are: " + imStupid);
              break;

            //this even more complicated mess is just glorified addition with four numbers.
            //heck, most of this calculator stuff is just glorified jazz
            case 2:
              System.out.println("\nEnter a number:");
              while(!validInput){
                try{
                  userInput = Integer.parseInt(scan.next());
                  validInput = true;
                } catch (Exception InputMismatchException){
                  System.out.println("Please enter an integer.");
                  validInput = false;
                }
              }

              System.out.println("\nWhat number do you want to add by?");
              while(!validInput){
                try{
                  adder = Integer.parseInt(scan.next());
                  validInput = true;
                } catch (Exception InputMismatchException){
                  System.out.println("Please enter an integer.");
                  validInput = false;
                }
              }
              mathStuff.thisFunctionThatIUseALot(userInput, adder, 1);

              System.out.println("\nEnter another number:");
              while(!validInput){
                try{
                  userInput = Integer.parseInt(scan.next());
                  validInput = true;
                } catch (Exception InputMismatchException){
                  System.out.println("Please enter an integer.");
                  validInput = false;
                }
              }

              System.out.println("\nWhat Number do you want to add by?");
              while(!validInput){
                try{
                  adder = Integer.parseInt(scan.next());
                  validInput = true;
                } catch (Exception InputMismatchException){
                  System.out.println("Please enter an integer.");
                  validInput = false;
                }
              }
              mathStuff.thisFunctionThatIUseALot(userInput, adder, 2);

              imStupid = mathStuff.x + mathStuff.y;
              System.out.println("The two numbers added together are: " + imStupid);
              break;
              //never before has adding together four numbers been so needlessly complicated

            //never before has multiplication been needlessly more complicated as well.
            //why the heck did i not just do "x*y"
            //why the hell did i make a function for this
            case 3:
              System.out.println("\nEnter a number:");
              while(!validInput){
                try{
                  mathStuff.x = Integer.parseInt(scan.next());
                  validInput = true;
                } catch (Exception InputMismatchException){
                  System.out.println("Please enter an integer.");
                  validInput = false;
                }
              }

              System.out.println("\nEnter another number:");
              while(!validInput){
                try{
                  mathStuff.y = Integer.parseInt(scan.next());
                  validInput = true;
                } catch (Exception InputMismatchException){
                  System.out.println("Please enter an integer.");
                  validInput = false;
                }
              }

              mathStuff.multiplyNumber();
              System.out.println(mathStuff.x);
              mathStuff.x = mathStuff.temp;
              break;

            //summation, but this time it's not overcomplicated
            //see, i promise I'm smart!
            case 4:
              System.out.println("\nWhat number do you want to add up to?");
              while(!validInput){
                try{
                  mathStuff.summation(Integer.parseInt(scan.next()));
                  validInput = true;
                } catch (Exception InputMismatchException){
                  System.out.println("Please enter an integer.");
                  validInput = false;
                }
              }
              System.out.println("All integers from 0 to that number added up is: " + mathStuff.x);
              break;
          }
          break;

        //this is just random stuff with strings
        case 2:
          System.out.println("\nSelect what you want to do (Enter the number):\n1.)Idk how to describe this one, it just yells at you a bunch\n2.)Display the date\n3.)Prints a random thing that I would say");

          validInput = false;
          while(!validInput){
            try{
              programType = Byte.parseByte(scan.next());
              validInput = true;
            } catch (Exception InputMismatchException){
              System.out.println("Please enter an integer.");
              validInput = false;
            }
          }

          switch (programType) {
          //yell function.
          //never before has yelling been so amazing.
          case 1:
            System.out.println("\nEnter a string: ");
            stringThing = scan.next();
            stringJazz.yellFunction(stringThing);
            break;

          //did you accidentally forget what day it is and only have access to this program and nothing else?
          //well fear no more! now your life will no longer be at stake due to not knowing the date
          //now with 100% more time
          case 2:
            LocalDate todayDate = LocalDate.now();
            System.out.println("\nToday's date is: " + todayDate);
            LocalTime todayTime = LocalTime.now();
            System.out.println("The time is: " + todayTime);
            break;

          //just prints out a random thing i'd say.
          case 3:
            stringJazz.randomSayings();
            break;
          }
          break;

          //gaming stuff
          case 3:
          System.out.println("\nSelect what you want to do (Enter the number):\n1.)Play Tic-Tac-Toe!");
          validInput = false;
          while(!validInput){
            try{
              programType = Byte.parseByte(scan.next());
              validInput = true;
            } catch (Exception InputMismatchException){
              System.out.println("Please enter an integer.");
              validInput = false;
            }
          }
          
          switch(programType){
            case 1:
              //i made tic-tac-toe! heck yeah fellas!
              gameThing.ticTacToe();
              break;
          }
          break;
        }
        //ask if the user wants to continue or not
        System.out.println("If you want to continue, type \"true\". Otherwise, type \"false\".");
        continueLoop = scan.nextBoolean();
      }
    } finally {
      //close the scanner because otherwise it yells at me
      scan.close();
    }
  }
}