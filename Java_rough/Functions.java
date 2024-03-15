public class Functions {
    static void Myfunction_1(){
        System.out.println("Say 3 times, HI....");
    }
    static void printname(String name){
        System.out.println(name);
    }
    static void printSum(int a,int b){
        int sum = a+b;
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Myfunction_1();
        printname("sailesh");
        printSum(2, 8);
    }
}
