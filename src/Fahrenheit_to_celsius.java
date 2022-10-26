import java.util.Scanner;
class Celisus_Convertion{
     void convertion(float fahrenheit){
       float celisus= (float) ((fahrenheit-32.0)*5/9);
       System.out.println( "Celisus of given fahrenheit is : "+ String.format("%.3f",celisus));
    }
}
public class Fahrenheit_to_celsius {
    public static void main(String [] args){
        System.out.println("\nFahrenheit to Celisus Convertion\n");
        System.out.println("Enter the Fahrenheit degree : ");
        Scanner scanner=new Scanner(System.in);
        float fahrenheit = scanner.nextFloat();
        Celisus_Convertion celisusConvert = new Celisus_Convertion();
        celisusConvert.convertion(fahrenheit);
    }
}
