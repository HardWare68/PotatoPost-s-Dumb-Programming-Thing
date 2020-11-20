public class MathStuff{
  long x;
  long y;
  long temp;
  //TYPE 1 = X, TYPE 2 = Y

  public void setValue(long valArg, int type){
    switch(type){
      case 1:
        x = valArg;
        break;

      case 2:
        y = valArg;
        break;
    }
  }

  public void addNumber(long addNum, int type){
    switch(type){
      case 1:
        x = x + addNum;
        break;
      
      case 2:
        y = y + addNum;
        break;
    }
  }

  public void summation(int sumNum){
    x = 0;
    for(int i = 0; i < sumNum+1; i++){
      x = x + i;
    }
  }

  public void thisFunctionThatIUseALot(long valArg, long addNum, int type){ //I use this function a lot
    setValue(valArg, type);
    addNumber(addNum, type);
    getValue(type);
  }

  public void multiplyNumber(){
    temp = x;
    x = x * y;
  }

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