// Basic character operation
import java.util.Scanner;

public class character {

    public static char printAlphabet(char Letter)
    {
        char givenLetter = Letter;
        System.out.println("Alphabets are :");
            if(Letter>='A'&& Letter<='Z')
            {
            for(char alphabet=givenLetter; alphabet<='Z';alphabet++)
            {
                System.out.print(alphabet+" ");
             givenLetter = alphabet;
                }
            }
            else 
            {
            for(char alphabet=givenLetter; alphabet<='z';alphabet++)
            {
                System.out.print(alphabet+" ");
                givenLetter = alphabet;
                }
            }
        return  givenLetter;
    }

    public static char charTOvalue(char Letter) // convert the char to its predefined value(ASCII)
    {
        char character = Letter;
        int charValue = (int) character;
        System.out.println("\nValue of given character :"+charValue);
        return character;
    }
    
    public static char charChange(char Letter, int addon) // increment the char by using an addon value || a+2=c
    {
        char givenChar = Letter;
        int givenaddon = addon;
        int updatedvalue = (int) givenChar + givenaddon; // a = 97 + 2(addon) = 99 || c - 99
        char updatedchar = (char) updatedvalue;
        int updatedcharValue = (int) updatedchar;
        System.out.println("Updated Character is :"+updatedchar);
        System.out.println("Updated CharacterValue is :"+updatedcharValue);
        return givenChar;
    }
   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char givenChar ;
        int addon;
        System.out.println("Enter a character :");
        givenChar = sc.next().charAt(0);// read a char from user
        System.out.println("Enter a addon number :");
        addon = sc.nextInt();
        printAlphabet(givenChar);
        charTOvalue(givenChar);
        charChange(givenChar,addon);

    }
}