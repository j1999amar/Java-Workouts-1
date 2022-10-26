import java.util.Scanner;

public class Palindrome
{
    public static void main(String [] agrs)

    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the string to check ");
        String userInput=scanner.nextLine();
        if (isPalindrome(userInput))
        {
            System.out.println(userInput+" is a palindrome. ");
        }
        else
        {
            System.out.println(userInput+" is not a palindrome. ");
        }
    }
    public static boolean isPalindrome(String str)
    {
        int left=0,rignt=str.length()-1;
        while (left<rignt)
        {
            if(str.charAt(left)!=str.charAt(rignt))
            {
                return false;
            }
            left++;
            rignt--;
        }
        return true;
    }
}
