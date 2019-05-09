import java.util.Scanner;

public class RemoveDuplicateCharacter {

 public static void main(String[] args) {

  Scanner sc = new Scanner(System.in);

  System.out.println("Enter the string");
  String str1 = sc.nextLine();

  System.out.println("The given string is: " + str1);

  System.out.println("After removing duplicates characters the new string is: "+ new RemoveDuplicateCharacter().removeDuplicateChars(str1));
 }

 public String removeDuplicateChars(String str) {

  char[] arr1 = str.toCharArray();

  String string = "";

  for (char value: arr1) {

   if (string.indexOf(value) == -1) {
    string += value;


   }
  }

  return string;
 }
}