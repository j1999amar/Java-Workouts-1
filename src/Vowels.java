import java.util.Scanner;

public class Vowels
{
    public static void main(String args[]) {
        boolean bool = false;
        System.out.println("Enter a character :");
        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);
        switch (ch) {
            case 'A':
            case 'E':
            case 'I':
            case 'O':
            case 'U':
            case 'a':
            case 'e':
            case 'o':
            case 'i':
            case 'u':
                bool = true;

        }
        if (bool == true)
        {
            System.out.println("Given character is a vowel ");
        }
        else
        {
            System.out.println("Given character is a consonant ");
        }
    }
}