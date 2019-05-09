import java.util.Scanner;

public class FirstNonRepeatingCharacter {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the string");
  String string = sc.nextLine();

   FirstNonRepeatingCharacter fnrc = new FirstNonRepeatingCharacter();
  
   new FirstNonRepeatingCharacter().findFirstNonRepeatCharacter(string);
  
 }

 public void findFirstNonRepeatCharacter(String str) {


      for (int i = 0;i < str.length() ;i++ ) {

        boolean check = true;

        for (int j = 0;j< str.length() ;j++ ) {

          if(i != j && str.charAt(i) == str.charAt(j)){
            check = false;
            break;
          }
          
        }

        if(check == true){
          System.out.println("First non repeated Character is "+str.charAt(i));
          break;
        }
        
      }


  
 }
}