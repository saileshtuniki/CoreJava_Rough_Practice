/*Exception Handling is a mechanism to handle runtime errors such as
ClassNotFoundException, IOException, SQLException, RemoteException, etc.
*/

public class Exceptionhandling {
    public static void main(String[] args) {
        int marks[] = {98,95,99};
        try{
            System.out.println(marks[5]);
        }catch(Exception exception){
           //do things after catching
           System.out.println("Error occured");
        }
        System.out.println("Hi my name is sai");

    }
}
