import java.util.Scanner;


//whats up diggity dogs, we actually commenting code
public class GameThing{
  String[][] ticTacToeBoard = {{"", "", ""}, {"", "", ""},{"", "", ""}};
  boolean isGameWonVar = false;
  boolean isLegalMoveVar = false;
  byte playerTurn = 1;
  int[] nextMove = {0, 0};

  Scanner scan = new Scanner(System.in);

  public void ticTacToe(){
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
          System.out.println("\nEnter your move! (Format it like so: \"row,column\")\n(Due to the way programming works, rows and columns start at 0. So if you want to go in the top-right corner, you would input \"0,0\" and so on.)");

          //get the next move, and hopefully split it into an array
          //with correct regex. how the hell do i even regex????
          String[] nextMoveOne =  scan.nextLine().split("[,]");
          try {
            nextMove[0] = Integer.parseInt(nextMoveOne[0]);
            nextMove[1] = Integer.parseInt(nextMoveOne[1]);
          } catch (NumberFormatException e) {
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

        //reset the legality stuff, because otherwise it gets caught in a loop
        isLegalMoveVar = false;
      }

      //someone won!
      if(playerTurn == 1){
        System.out.println("Player 2 has won!");
      } else {
        System.out.println("Player 1 has won!");
      }
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
    System.out.println(ticTacToeBoard[0][0] + " | " + ticTacToeBoard[0][1] + " | " + ticTacToeBoard[0][2] + " | ");
    System.out.println("---------");
    System.out.println(ticTacToeBoard[1][0] + " | " + ticTacToeBoard[1][1] + " | " + ticTacToeBoard[1][2] + " | ");
    System.out.println("---------");
    System.out.println(ticTacToeBoard[2][0] + " | " + ticTacToeBoard[2][1] + " | " + ticTacToeBoard[2][2] + " | ");
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
}