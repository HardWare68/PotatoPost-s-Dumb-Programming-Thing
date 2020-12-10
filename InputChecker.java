import java.util.Scanner;

public class InputChecker{
  boolean validInput = false; //checks if the input is correct. ex int when we want int, string when we want string, etc.
  byte programType = 0; // this variable is used to determine what the program is gonna do. like, you know, it chooses the stuff. you know.
  int userInput = 0; // this is the thing the scanner object uses to get the input
  int adder = 0; // this is what we add (look at case 2)
  int returnVar = 0; //this is my workaround because i had troubles referencing other variables in files
  //this will set it to whatever, then Main will use that variable for whatever
  boolean continueLoop = true; // determines if we want to continue the loop or not

  Scanner scan = new Scanner(System.in);
  MathStuff mathStuff = new MathStuff();

  public void inputChecking(byte checkType){
    switch(checkType){

      // /!\ CASE 1 CHECKS FOR BYTES, PLACES IT INTO programType /!\
      case 1:
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
        break;

      // /!\ CASE 2 CHECKS FOR INTS, AND PLACES IT INTO userInput /!\
      case 2:
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
        break;

      // /!\ CASE 3 CHECKS FOR INTS, AND PLACES IT INTO adder /!\
      case 3:
        validInput = false;
          while(!validInput){
            try{
              adder = Integer.parseInt(scan.next());
              validInput = true;
            } catch (Exception InputMismatchException){
              System.out.println("Please enter an integer.");
              validInput = false;
            }
          }
        break;

        // /!\ CASE 4 CHECKS FOR INTS, AND PLACES IT INTO returnVar /!\
        case 4:
        validInput = false;
          while(!validInput){
            try{
              returnVar = Integer.parseInt(scan.next());
              validInput = true;
            } catch (Exception InputMismatchException){
              System.out.println("Please enter an integer.");
              validInput = false;
            }
          }
        break;

        // /!\ CASE 5 CHECKS FOR BOOLS, AND PLACES IT INTO continueLoop /!\
        case 5:
        validInput = false;
          while(!validInput){
            try{
              continueLoop = Boolean.parseBoolean(scan.next());
              validInput = true;
            } catch (Exception InputMismatchException){
              System.out.println("Please enter an integer.");
              validInput = false;
            }
          }
        break;
    }
  }
}