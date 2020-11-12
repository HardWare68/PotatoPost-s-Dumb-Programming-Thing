import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    System.out.println("Welcome to PotatoPost's dumb programming thing!");
    System.out.println("Version 1.0: It does a thing.");
    System.out.println("Loading..."); //this doesnt actually load anything, i just do it so it looks cool lmao

    try {
      Thread.sleep(3000);
    } catch (Exception IntteruptedException) { //I have no idea what these two lines do, but program doesn't work without it.
      System.out.println("Heck.");
    } finally {
      System.out.println("Done!");
    }

    OtherFile newOther = new OtherFile();
    Scanner scan = new Scanner(System.in);

    try {
      System.out.println("\nEnter a number:");
      int thingy = scan.nextInt(); //thingy is the scanner object to get input
      System.out.println("\nWhat number do you want to add by?");
      int adder = scan.nextInt(); //adder adds the number, or something
      newOther.thisFunctionThatIUseAlot(thingy, adder, 1);

      System.out.println("\nEnter another number:");
      thingy = scan.nextInt();
      System.out.println("\nWhat Number do you want to add by?");
      adder = scan.nextInt();
      newOther.thisFunctionThatIUseAlot(thingy, adder, 2);

    int imStupid = newOther.x + newOther.y;
      System.out.println("The two numbers added together are: " + imStupid);

    } finally {
      scan.close();
    }
  }
}