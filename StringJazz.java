public class StringJazz{

  String[] Sayings = {"What's updog?", "Your mom!", "H-Hey! This isn't Minecraft!", "osu moment", "Joe mama!", "nap time", "Middle school for me was like Alex Post", "On that Mario Galaxy 2 grind", "Beethoven's Ninth Symphony moment"};

  public void yellFunction(String stringArg){
    for(int x = 0; x < stringArg.length(); x++){
      System.out.println("AAA");
    }
  }
  
  public void randomSayings(){
    byte randomNum = (byte) Math.round(Math.random()*Sayings.length);
    System.out.println(Sayings.length);
    System.out.println(Sayings[randomNum]);
  }
}