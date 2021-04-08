import java.util.Scanner;
import java.util.ArrayList;
public class project {
    /*static String passwordc(){
        System.out.println("Create the user name and password ");
        String username=s.next();
        String password =s.next();
        return password;
    }*/
    public static void main(String[] args){
        System.out.println("Welcome to the food app ");
        System.out.println("Are u new to this app say yes or no ");
        Scanner s= new Scanner(System.in);
        String p="12345";
        String ans=s.next();
        if (ans.equals("yes")){
            //System.out.println("Do not forget the password "+passwordc());
            //String p= passwordc();
            //System.out.println("Do not forget the password "+);
        }
        System.out.println("Enter the password :");
        String pass=s.next();
        while(pass.equals(p)){
            System.out.println("Would u like to order some thing Say yes or no");
            String ans1=s.next();
            
            if (ans1.equals("yes")){
                System.out.println("ok, say what u want ");
                System.out.println("Can u say how many dish do u want : ");
                int n=s.nextInt();
                ArrayList<String> order = new ArrayList<>();
                for (int i=0;i<n;i++){
                    System.out.println("Enter the dish "+(i+1)+" : ");
                    String a = s.next();
                    order.add(a);
                }
        
            System.out.println("Ordered list is ");
            System.out.println(order);
            System.out.println("Anythings else do u need to order say yes or no ");
            ans1=s.next();
            if(ans1.equals("yes")){
                break;
            }
            
            }  
            else {
                System.out.println("Thank u sir have a nice day");
            }
        }
        
        

    }
    
}
