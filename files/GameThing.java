import java.util.Scanner;
import java.lang.Math;
import java.time.LocalTime;

//whats up diggity dogs, we actually commenting code
public class GameThing{
  String[][] ticTacToeBoard = {{"", "", ""}, {"", "", ""},{"", "", ""}};
  boolean isGameWonVar = false;
  boolean isLegalMoveVar = false;
  boolean isBoardFullVar = false;
  byte playerTurn = 1;
  int[] nextMove = {0, 0};

  Scanner scan = new Scanner(System.in);
  InputChecker inputChecker = new InputChecker();


// /!\ START OF TIC-TAC-TOE CODE /!\
  public void ticTacToe(){

    //reset the board so that if someone is trying to play multiple times, it wont not work.
    resetBoard();

    System.out.println("Tic-Tac-Toe!");
      while(!isGameWonVar){
        //first-er we gotta print the heckin board
        System.out.println();
        printBoard();

        //first find out who's turn it is
        if(playerTurn == 1){
          System.out.println("It is Player 1's turn!");
        }
        else {
          System.out.println("It is Player 2's turn!");
        }

        //if it aint a legal move, keep asking them for a move until they
        //give us one. trust me, they'll speak eventually
        //thats the magic of waterboarding
        while(!isLegalMoveVar){
          //prompt user for an input
          System.out.println("\nEnter your move! (Format it like so: \"row,column\")\n(Due to the way programming works, rows and columns start at 0. So if you want to go in the top-left corner, you would input \"0,0\" and so on.)");

          //get the next move, and hopefully split it into an array
          //with correct regex. how the hell do i even regex????
          String[] nextMoveOne =  scan.nextLine().split("[,]");
          try {
            nextMove[0] = Integer.parseInt(nextMoveOne[0]);
            nextMove[1] = Integer.parseInt(nextMoveOne[1]);
          } catch (NumberFormatException | ArrayIndexOutOfBoundsException e) {
            isLegalMoveVar = false;
            continue;
          }

          //check if its a legal move
          isLegalMove(nextMove);

          //gonna let the user know they did a bad
          if(isLegalMoveVar == false){
            System.out.println("\nThat is an illegal move. Please enter a legal move.");
          }
        }

        //do the move, you know
        if(playerTurn == 1){
          ticTacToeBoard[nextMove[0]][nextMove[1]] = "O";
          playerTurn = 2;
        }
        else {
          ticTacToeBoard[nextMove[0]][nextMove[1]] = "X";
          playerTurn = 1;
        }

        //check if anyone has won
        isGameWonFunction();

        //check if the board is full. if so, break out of the loop
        isBoardFullFunction();
        if(isBoardFullVar){
          break;
        }

        //reset the legality stuff, because otherwise it gets caught in a loop
        isLegalMoveVar = false;
      }

      //someone won!
      if(!isBoardFullVar){
        if(playerTurn == 1){
          System.out.println("Player 2 has won!");
        } else {
          System.out.println("Player 1 has won!");
        }
      }else{
        System.out.println("Draw!");
      }
    }

  public void resetBoard(){
    for(int x = 0; x < ticTacToeBoard.length; x++){
      for(int y = 0; y < ticTacToeBoard[x].length; y++){
        ticTacToeBoard[x][y] = "";
      }
    }
    isGameWonVar = false;
    isLegalMoveVar = false;
    isBoardFullVar = false;
    playerTurn = 1;
  }

  public void isLegalMove(int[] nextMoveParam){
    try{
      if(ticTacToeBoard[nextMoveParam[0]][nextMoveParam[1]] == ""){
        isLegalMoveVar = true;
      } else {
        isLegalMoveVar = false;
      }
    } catch (ArrayIndexOutOfBoundsException e){
      isLegalMoveVar = false;
    }
  }

  public void printBoard(){
    System.out.println(ticTacToeBoard[0][0] + " | " + ticTacToeBoard[0][1] + " | " + ticTacToeBoard[0][2]);
    System.out.println("------");
    System.out.println(ticTacToeBoard[1][0] + " | " + ticTacToeBoard[1][1] + " | " + ticTacToeBoard[1][2]);
    System.out.println("------");
    System.out.println(ticTacToeBoard[2][0] + " | " + ticTacToeBoard[2][1] + " | " + ticTacToeBoard[2][2]);
  }

  public void isBoardFullFunction(){
    //dear lord, this if statement looks like a stroke
    if(ticTacToeBoard[0][0] != "" && ticTacToeBoard[0][1] != "" && ticTacToeBoard[0][2] != "" && ticTacToeBoard[1][0] != "" && ticTacToeBoard[1][1] != "" && ticTacToeBoard[1][2] != "" && ticTacToeBoard[2][0] != "" && ticTacToeBoard[2][1] != "" && ticTacToeBoard[2][2] != ""){
      isBoardFullVar = true;
    } else {
      isBoardFullVar = false;
    }
  }

  public void isGameWonFunction(){
    //if first row is equal
    if(ticTacToeBoard[0][0] == ticTacToeBoard[0][1] && ticTacToeBoard[0][1] == ticTacToeBoard[0][2] && ticTacToeBoard[0][0] == ticTacToeBoard[0][2] && ticTacToeBoard[0][0] != "" && ticTacToeBoard[0][1] != "" && ticTacToeBoard[0][2] != ""){
      isGameWonVar = true;
    }
    //if second row is equal
    else if(ticTacToeBoard[1][0] == ticTacToeBoard[1][1] && ticTacToeBoard[1][1] == ticTacToeBoard[1][2] && ticTacToeBoard[1][0] == ticTacToeBoard[1][2] && ticTacToeBoard[1][0] != "" && ticTacToeBoard[1][1] != "" && ticTacToeBoard[1][2] != ""){
      isGameWonVar = true;
    }
    //if third row is equal
    else if(ticTacToeBoard[2][0] == ticTacToeBoard[2][1] && ticTacToeBoard[2][1] == ticTacToeBoard[2][2] && ticTacToeBoard[2][0] == ticTacToeBoard[2][2] && ticTacToeBoard[2][0] != "" && ticTacToeBoard[2][1] != "" && ticTacToeBoard[2][2] != ""){
      isGameWonVar = true;
    }
    //if first column is equal
    else if(ticTacToeBoard[0][0] == ticTacToeBoard[1][0] && ticTacToeBoard[1][0] == ticTacToeBoard[2][0] && ticTacToeBoard[0][0] == ticTacToeBoard[2][0] && ticTacToeBoard[0][0] != "" && ticTacToeBoard[1][0] != "" && ticTacToeBoard[2][0] != ""){
      isGameWonVar = true;
    }
    //if second column is equal
    else if(ticTacToeBoard[0][1] == ticTacToeBoard[1][1] && ticTacToeBoard[1][1] == ticTacToeBoard[2][1] && ticTacToeBoard[0][1] == ticTacToeBoard[2][1] && ticTacToeBoard[0][1] != "" && ticTacToeBoard[1][1] != "" && ticTacToeBoard[2][1] != ""){
      isGameWonVar = true;
    }
    //if third column is equal
    else if(ticTacToeBoard[0][2] == ticTacToeBoard[1][2] && ticTacToeBoard[1][2] == ticTacToeBoard[2][2] && ticTacToeBoard[0][2] == ticTacToeBoard[2][2] && ticTacToeBoard[0][2] != "" && ticTacToeBoard[1][2] != "" && ticTacToeBoard[2][2] != ""){
      isGameWonVar = true;
    }
    //if top-left to bottom-right diagonal is equal
    else if(ticTacToeBoard[0][0] == ticTacToeBoard[1][1] && ticTacToeBoard[1][1] == ticTacToeBoard[2][2] && ticTacToeBoard[0][0] == ticTacToeBoard[2][2] && ticTacToeBoard[0][0] != "" && ticTacToeBoard[1][1] != "" && ticTacToeBoard[2][2] != ""){
      isGameWonVar = true;
    }
    //if top-right to bottom-left diagonal is equal
    else if(ticTacToeBoard[0][2] == ticTacToeBoard[1][1] && ticTacToeBoard[1][1] == ticTacToeBoard[2][0] && ticTacToeBoard[0][2] == ticTacToeBoard[2][0] && ticTacToeBoard[0][2] != "" && ticTacToeBoard[1][1] != "" && ticTacToeBoard[2][0] != ""){
      isGameWonVar = true;
    }
    else{
      isGameWonVar = false;
    }
    //im so sorry to all my programming friends who had to scroll through a thousand if statements
  }

  // /!\ END OF ALL TIC-TAC-TOE CODE /!\

  // /!\ START OF IDLE GAME CODE /!\
  long totalGold = 0; //total gold
  int minMiningGold = 1; //minimum amount of gold that can be made from the mineGold() function
  int maxMiningGold = 10; //maximum amount of gold that can be made from the mineGold() function
  int miningGoldRange = maxMiningGold - minMiningGold + 1; //the range of gold that can be made from the mineGold function
  int goldGained; //how much gold was gained from the mineGold function

  long lastUpdate; //when the last time the idle game was updated
  long timeDifference; //what the time difference between the last update and current update would be

  short autoMiners = 0; //auto miners mine for you! wow!
  int autoMinerPrice = 50; //price of the auto miners
  
  int goldPerSecond = 0; //gold per second


  public void idleGame(){
    //reset programType, otherwise program breaks
    inputChecker.resetVars();

    //loop while they dont select 127
    while(inputChecker.programType != 127){

      //ask the user what they wanna do
      System.out.println("\nSelect what you want to do (Enter the number):\n1.)Mine for gold\n2.)Check how much gold you have\n3.)Shop\n127.)Exit");
      inputChecker.inputChecking((byte) 1);

      //selecct what they wanna do
      switch(inputChecker.programType){
        //mine gold
        case 1:
          mineGold();
          break;

        case 2:
          goldReturnValueThingy();
          break;

        case 3:
          buyStuff();
          break;
      }
    }
  }

  //updates gold
  public void updateGold(){
    timeDifference = (System.currentTimeMillis() - lastUpdate) / 1000;
    lastUpdate = System.currentTimeMillis();
    totalGold = totalGold + (timeDifference * goldPerSecond);
  }


  //returns how much gold you have
  //shoutout to the github issue! https://github.com/HardWare68/PotatoPost-s-Dumb-Programming-Thing/issues/17
  public void goldReturnValueThingy(){
    System.out.println("\nYou have " + totalGold + " gold!");
    updateGold();
  }

  public void buyStuff(){
    //just used to reset the program checker variable
    inputChecker.resetVars();

    //loop while they dont put in 127
    while(inputChecker.programType != 127){

      //the good ol' "ask what they want and do that"
      System.out.println("\nWhat do you want to buy (Enter the number):\n1.)Auto Miner. Cost: " + autoMinerPrice + " gold.\n127.)Exit");
      inputChecker.inputChecking((byte) 1);

      switch(inputChecker.programType){

        //auto miner stuff
        case 1:

          //if they have enough gold to afford an autominer
          if(totalGold >= autoMinerPrice){
            //update variables
            autoMiners += 1;
            totalGold -= autoMinerPrice;
            goldPerSecond += 5;
            autoMinerPrice = (int) Math.round(1.5 * autoMinerPrice);

            updateGold();
            System.out.println("\nSuccess! You now have " + totalGold + " gold and " + autoMiners + " Auto Miners!");
          } else {
            //how you look trying to buy stuff you dont have enough money for
            System.out.println("\nUh oh! You don't have enough gold!");
          }
          break;
      
      }

      //if i put this thing in enough spots the program will work
      updateGold();
    }

    //reset variables before returning to the main idle game loop (and update gold as well)
    inputChecker.resetVars();
    updateGold();
  }

  //this function increments totalGold by a random number
  public void mineGold(){
    System.out.println("\nMining for gold...");
    goldGained = (int)(Math.random() * miningGoldRange) + minMiningGold;
    totalGold = totalGold + goldGained;
    System.out.println("You made " + goldGained + " gold!");
    updateGold();
    System.out.println("Total gold is now: " + totalGold);
  }
}