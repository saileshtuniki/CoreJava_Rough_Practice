import java.util.Scanner;

public class Javaminiproj {
    public static void main(String[] args) {
        //Mini Project//
        Scanner sc = new Scanner(System.in);
        int myNumber = (int)(Math.random()*100);
        int userNumber = 0;

        do{
            System.out.println("Guess My Number(1-100):");
            userNumber = sc.nextInt();

            if(userNumber == myNumber){
                System.out.println("You won! The Number is Correct");
                break;
            }
            else if(userNumber > myNumber){
                System.out.println("The Number is too large");
            }
            else{
                System.out.println("your number is too small");
            }
        } while(userNumber >= 0);

        System.out.println("My number was");
        System.out.println(myNumber);
    }
}
