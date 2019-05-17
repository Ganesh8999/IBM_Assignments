import java.util.Scanner;


class CheckNumber {
  public static void main(String args[]) {

    String again;

    do{


    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a number");

    int number = sc.nextInt();


    


    CheckNumber cn = new CheckNumber();
    boolean check = cn.checkNumber(number);

    if(check == true){

      System.out.println("yes number is increasing ");
    }else{

      System.out.println("number isn't increasing");
    }

      System.out.println("Do you want to continue the process  press Y");
      again = sc.next();



    }while(again.equalsIgnoreCase("y"));

  }

  public boolean checkNumber(int num){

    int previous = 10;

    while(num != 0){

               int remainder = num%10;
                num /= 10;

      if (remainder > previous) {

        return false;
      }
      previous = remainder;
    }

    return true;
  }

}

