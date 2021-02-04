public class MathStuff{
  int x;
  int y;
  int temp;
  //TYPE 1 = X, TYPE 2 = Y

  //just sets values of variables. pretty boring
  public void setValue(int valArg, int type){
    switch(type){
      case 1:
        x = valArg;
        break;

      case 2:
        y = valArg;
        break;
    }
  }

  //adding numbers has never been so needlessly complicated!
  public void addNumber(int addNum, int type){
    switch(type){
      case 1:
        x = x + addNum;
        break;
      
      case 2:
        y = y + addNum;
        break;
    }
  }

  //summation. pretty simple
  public void summation(int sumNum){
    x = 0;
    for(int i = 0; i < sumNum+1; i++){
      x = x + i;
    }
  }

  //i use this function a lot
  public void thisFunctionThatIUseALot(int valArg, int addNum, int type){
    setValue(valArg, type);
    addNumber(addNum, type);
    getValue(type);
  }

  //overcomplicating multiplcation?
  //wooo! hell yeah baby, that's what I'm talking about!
  public void multiplyNumber(){
    temp = x;
    x = x * y;
  }

  //just prints out what stuff is what
  public void getValue(int type){
    switch(type){
      case 1:
        System.out.println("X is: " + x);
        break;
      
      case 2:
        System.out.println("Y is: " + y);
        break;
    }
  }
}