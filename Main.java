import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to PotatoPost's dumb programming thing!");
    System.out.println("Version 4.0: Now with loops!");
    System.out.println("Loading..."); // this doesnt actually load anything, i just do it so it looks cool lmao

    try {
      Thread.sleep(3000);
    } catch (Exception IntteruptedException) { // I have no idea what these two lines do, but program doesn't work without it.
      System.out.println("Heck.");
    } finally {
      System.out.println("Done!");
    }

    MathStuff mathStuff = new MathStuff();
    Scanner scan = new Scanner(System.in);
    StringJazz stringJazz = new StringJazz();
    long userInput; // this is the thing the scanner object uses to get the input
    long adder; // this is what we add (look at case 2)
    long imStupid; // this variable is because i was stupid and concatenated two numbers together.
    byte programType; // this variable is used to determine what the program is gonna do. like, you know, it chooses the stuff. you know.
    String stringThing = ""; // its a string thing
    boolean continueLoop = true; // determines if we want to continue the loop or not

    try {
      while (continueLoop) {
        System.out.println("\nSelect what you want to do (Enter the number):\n1.)Calculator Stuff\n2.)Cool Things with Strings™");
        programType = scan.nextByte();
        switch (programType) {
        case 1:
          System.out.println("\nSelect what you want to do (Enter the number):\n1.)Add two numbers\n2.)Add two numbers, but even cooler\n3.)Multiply two numbers");
          programType = scan.nextByte();
          switch (programType) {
            case 1:
              System.out.println("\nEnter a number:");
              userInput = scan.nextLong();
              mathStuff.setValue(userInput, 1);

              System.out.println("\nEnter another number:");
              userInput = scan.nextLong();
              mathStuff.setValue(userInput, 2);

              imStupid = mathStuff.x + mathStuff.y;
              System.out.println("\nThe two numbers added together are: " + imStupid);
              break;

            case 2:
              System.out.println("\nEnter a number:");
              userInput = scan.nextLong(); //userInput is the scanner object to get input
              System.out.println("\nWhat number do you want to add by?");
              adder = scan.nextLong(); // adder adds the number, or something
              mathStuff.thisFunctionThatIUseALot(userInput, adder, 1);

              System.out.println("\nEnter another number:");
              userInput = scan.nextLong();
              System.out.println("\nWhat Number do you want to add by?");
              adder = scan.nextLong();
              mathStuff.thisFunctionThatIUseALot(userInput, adder, 2);

              imStupid = mathStuff.x + mathStuff.y;
              System.out.println("The two numbers added together are: " + imStupid);
              break;

            case 3:
              System.out.println("\nEnter a number:");
              mathStuff.x = scan.nextLong();
              System.out.println("\nEnter another number:");
              mathStuff.y = scan.nextLong();
              mathStuff.multiplyNumber();
              System.out.println(mathStuff.x);
              mathStuff.x = mathStuff.temp;
              break;
          }
          break;

        case 2:
          System.out.println(
              "\nSelect what you want to do (Enter the number):\n1.)Idk how to describe this one, it just yells at you a bunch");
          programType = scan.nextByte();
          switch (programType) {
          case 1:
            System.out.println("\nEnter a string: ");
            stringThing = scan.next();
            stringJazz.yellFunction(stringThing);
            break;
          }
        }
        System.out.println("If you want to continue, type \"true\". Otherwise, type \"false\".");
        continueLoop = scan.nextBoolean();
      }
    } finally {
      scan.close();
    }
  }
}