import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to PotatoPost's dumb programming thing!");
    System.out.println("Version 3.0: Cool Things with Strings™");
    System.out.println("Loading..."); //this doesnt actually load anything, i just do it so it looks cool lmao

    try {
      Thread.sleep(3000);
    } catch (Exception IntteruptedException) { //I have no idea what these two lines do, but program doesn't work without it.
      System.out.println("Heck.");
    } finally {
      System.out.println("Done!");
    }

    MathStuff mathStuff = new MathStuff();
    Scanner scan = new Scanner(System.in);
    StringJazz stringJazz = new StringJazz();
    long thingy; //this is the thing the scanner object uses to get the input
    long adder; //this is what we add (look at case 2)
    long imStupid; //this variable is because i was stupid and concatenated two numbers together.
    byte programType; //this variable is used to determine what the program is gonna do. like, you know, it chooses the stuff. you know.
    String stringThing = ""; //its a string thing

    try {
      System.out.println("\nSelect what you want to do (Enter the number):\n1.)Calculator Stuff\n2.)Cool Things with Strings™");
      programType = scan.nextByte();
      switch(programType){
        case 1:
          System.out.println("\nSelect what you want to do (Enter the number):\n1.)Add two numbers\n2.)Add two numbers, but even cooler");
          programType = scan.nextByte();
          switch(programType){
            case 1:
              System.out.println("\nEnter a number:");
              thingy = scan.nextLong();
              mathStuff.setValue(thingy, 1);

              System.out.println("\nEnter another number:");
              thingy = scan.nextLong();
              mathStuff.setValue(thingy, 2);

              imStupid = mathStuff.x + mathStuff.y;
              System.out.println("\nThe two numbers added together are: " + imStupid);
              break;

            case 2:
              System.out.println("\nEnter a number:");
              thingy = scan.nextLong(); //thingy is the scanner object to get input
              System.out.println("\nWhat number do you want to add by?");
              adder = scan.nextLong(); //adder adds the number, or something
              mathStuff.thisFunctionThatIUseAlot(thingy, adder, 1);

              System.out.println("\nEnter another number:");
              thingy = scan.nextInt();
              System.out.println("\nWhat Number do you want to add by?");
              adder = scan.nextInt();
              mathStuff.thisFunctionThatIUseAlot(thingy, adder, 2);

              imStupid = mathStuff.x + mathStuff.y;
              System.out.println("The two numbers added together are: " + imStupid);
              break;
          }
          break;

        case 2:
          System.out.println("\nSelect what you want to do (Enter the number):\n1.)Idk how to describe this one, it just yells at you a bunch");
          programType = scan.nextByte();
          switch(programType){
            case 1:
              System.out.println("Enter a string: ");
              stringThing = scan.next();
              stringJazz.thisIsBad(stringThing);
              break;
          }

        }
    } finally {
      scan.close();
    }
  }
}