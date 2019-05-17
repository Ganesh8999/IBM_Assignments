import java.util.Scanner;


class CheckNumberIsPowerOfTwo {
  public static void main(String args[]) {

    String again;

    do{


    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");

    int number = sc.nextInt();


    


    CheckNumberIsPowerOfTwo cn = new CheckNumberIsPowerOfTwo();
    boolean check = cn.checkNumberIsPowerOfTwo(number);

    if(check == true){

      System.out.println("yes it's power of two");
    }else{

      System.out.println("It's not a power of two ");
    }

      System.out.println("Do you want to continue the process  press Y");
      again = sc.next();



    }while(again.equalsIgnoreCase("y"));

  }

  public boolean checkNumberIsPowerOfTwo(int num){

          
      while(num > 1){

        if(num % 2 != 0){
          return false;
        }

        num = num / 2;
      }
      return true;

}

}

