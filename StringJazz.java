public class StringJazz{

  public void yellFunction(String stringArg){
    for(int x = 0; x < stringArg.length(); x++){
      System.out.println("AAA");
    }
  }
  
  /*potential sayings I can add:
    On that mario galaxy 2 grind
    references to classical music
  */
  public void randomSayings(){
    byte randomNum = (byte) Math.round(Math.random()*6);
    switch(randomNum){
      case 0:
        System.out.println("What's updog?");
        break;
      
      case 1:
        System.out.println("Your mom!");
        break;

      case 2:
        System.out.println("H-Hey! This isn't Minecraft!");
        break;

      case 3:
        System.out.println("osu moment");
        break;

      case 4:
        System.out.println("Joe mama!");
        break;

      case 5:
        System.out.println("nap time");
        break;

      case 6:
        System.out.println("Middle school for me was like Alex Post");
        break;
    }
  }
}