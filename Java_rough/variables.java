// import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class variables {
    public static void main(String []args){
        
        // int [] marks = new int[3];
        // marks[0] = 92;
        // marks[1] = 90;
        // marks[2] = 99;

        // // System.out.println(marks[0]);
        // // System.out.println(marks.length);
        // System.out.println(marks[0]);
        // Arrays.sort(marks);
        // System.out.println(marks[0]);

        // int [] marks = {98,88,96};
        // int [][] finalmarks = {{98,88,96},{98,87,95}};
        // System.out.println(finalmarks[0][1]);

        // double price = 100.0;
        // double fprice = price+18;
        // System.out.println(fprice);

        // int p = 100;
        // int fp = p + (int)18.0;
        // System.out.println(fp);

        // double a = 8;
        // double b = 2;
        // double modulo = a%b;
        // System.out.println(modulo);

        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Input Age: ");
        // int age = sc.nextInt();
        // System.out.println(age);

        // boolean isSunup = false;
        // if (isSunup == true){
        //     System.out.println("day");
        // }else{
        //     System.out.println("night");
        // }

        int n = 5;
        switch(n) {
        case 1 :
            System.out.println("Monday");
        break;
        case 2 :
            System.out.println("Tuesday");
        break;
        case 3 :
            System.out.println("Wednesday");
        break;
        case 4 :
            System.out.println("Thursday");
        break;
        case 5:
            System.out.println("Friday");
        break;
        case 6 :
            System.out.println("Saturday");
        break;
        default :
            System.out.println("Sunday");
        }  

    }
}
