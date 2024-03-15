public class whileloop {
    public static void main(String []args){
      //Break & Continue//
      int i = 0;
      while(true){
        if(i==3){  //Skips 3 and prints rest of the things
            i++;
            continue;
        }
        System.out.println(i);
        i++;
        // i=i+1;
        if(i>5){
            break;
        }
      }
    }
}
