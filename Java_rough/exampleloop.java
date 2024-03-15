import java.util.Scanner;
// Taking input from user repeatedly //
public class exampleloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do{
            System.out.println("Input num:");
            number = sc.nextInt();
            System.out.print("Here is your number:");
            System.out.println(number);
        }while(number >= 0);
        System.out.println("The End");
    }
}
