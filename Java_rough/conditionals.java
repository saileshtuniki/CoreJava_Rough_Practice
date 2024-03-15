import java.util.Scanner;

public class conditionals {
    public static void main(String[] args) {
        //Scanner used to take inputs from user//
        Scanner sc = new Scanner(System.in);
        int cash = sc.nextInt();

        if (cash < 10){
            System.out.println("Can't buy anything");
            System.out.println("Get more cash");
        }

        else if(cash >10 && cash < 50){
            System.out.println("Can get 1 thing more");
        }
        
        else{
            System.out.println("can get both");
        }
    }
}
