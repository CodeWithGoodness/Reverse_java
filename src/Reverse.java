 import java.util.Scanner;
public class Reverse{
    public static void main(String[]args){
        //This program reverses a string and also checks if it's a palindrome
        Scanner input = new Scanner(System.in); //taking user input
        System.out.println("Enter a word: ");
        String word = input.next();
        String reversed_array = ""; //stores the reversed array
        //i is arrayindex

        for(int i=0; i< word.length(); i++){
            reversed_array = word.charAt(i) + reversed_array;}
        System.out.println(reversed_array);
        //checking if it's a palindrome
     if(word.equals(reversed_array))   {
         System.out.println("The word is a palindrome");//comparing
     }
     else{
     System.out.println("Not a palindrome");}
        }


}