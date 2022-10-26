import java.util.Scanner;
public class Triangle {
    void triangleCreate(int userInput){
        for(int i=1;i<=userInput;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println("");
            }
    }
    public  static void main(String []ags){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Triangle Creation\n");

        System.out.println("Enter the number : ");

        int userInput=scanner.nextInt();
        Triangle triangle=new Triangle();
        triangle.triangleCreate(userInput);

    }
}
