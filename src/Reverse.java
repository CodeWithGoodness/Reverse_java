 import java.util.Scanner;
public class Reverse{
    public static void main(String[]args){
        //This program reverses a string
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = input.next();
        String reversed_array = "";
        //i is arrayindex

        for(int i=0; i< word.length(); i++){
            reversed_array = word.charAt(i) + reversed_array;}
        System.out.println(reversed_array);
        }


}