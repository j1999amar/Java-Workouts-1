import java.util.Scanner;

public class FibonacciSeries {
    static int  fiboanaicCalculation(int number){
        if(number==0){
            return 0;
        }
        if(number==1||number==2){
            return 1;
        }
    return fiboanaicCalculation(number-2)+fiboanaicCalculation(number-1);
    }
    public static void main(String []args){
      FibonacciSeries fibonacciSeries=new FibonacciSeries();
      Scanner scanner=new Scanner(System.in);
      System.out.println("Fibonacci Series");
        System.out.print("Enter the number for Fibonacci Series : ");

        int userInput=scanner.nextInt();

        for (int i = 0; i < userInput; i++) {
            System.out.print(fiboanaicCalculation(i)+" ");

        }
    }
}
