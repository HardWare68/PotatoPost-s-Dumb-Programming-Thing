public class StringJazz{

  String[] Sayings = {"What's updog?", "Your mom!", "H-Hey! This isn't Minecraft!", "osu moment", "Joe mama!", "nap time", "Middle school for me was like Alex Post", "On that Mario Galaxy 2 grind", "Beethoven's Ninth Symphony moment"};

  String[] startJoke = {"Why did the chicken cross the road?", "Want to know something odd?", "What do you get when you cross a mentally ill person, with a society that abandons him and treats him like trash?", "Why was six afraid of seven?", "Is your refrigerator running?", "What do you call a cow with two legs?"};
  String[] endJoke = {"To get to the other side!", "Numbers that aren't divisible by 2.", "You get what you hecking deserve!", "Because seven eight nine!", "Then you better go catch it!", "Lean beef!"};


  //this function yells at you a lot
  public void yellFunction(String stringArg){
    for(int x = 0; x < stringArg.length(); x++){
      System.out.println("AAA");
    }
  }
  
  //prints a random saying that i'd say
  public void randomSayings(){
    byte randomNum = (byte) Math.round(Math.random()*Sayings.length);
    System.out.println(Sayings[randomNum]);
  }

  public void basedFunction(String stringArg){
    System.out.println("Based and " + stringArg + "pilled.");
  }

  public void randomJoke(){
    byte randomNum = (byte) Math.round(Math.random()*startJoke.length);
    System.out.println(startJoke[randomNum]);
     try {
      Thread.sleep(1500);
    } catch (Exception IntteruptedException) {
      System.out.println("Heck.");
    } finally {
      System.out.println(endJoke[randomNum]);
    }
  }

  public void randomerJoke(){
    byte randomNum = (byte) Math.round(Math.random()*startJoke.length);
    System.out.println(startJoke[randomNum]);
     try {
      Thread.sleep(1500);
    } catch (Exception IntteruptedException) {
      System.out.println("Heck.");
    } finally {
      randomNum = (byte) Math.round(Math.random()*startJoke.length);
      System.out.println(endJoke[randomNum]);
    }
  }
}