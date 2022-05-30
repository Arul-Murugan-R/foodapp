import java.util.Scanner;
import java.util.ArrayList;
public class foodapp {
    static String passwordc(){
        Scanner s = new Scanner(System.in);
        System.out.println("Create your new password :");
        String pa= s.next();
        return pa;

    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String pa ="12345";
        System.out.println("Welcome to the food app ");
        System.out.println("Are you a new customer? yes or no ");
        String ans = s.next();
        if (ans.equals("yes")){
            pa =passwordc();
        }
        System.out.println("Enter your password of our app :");
        String p= s.next();
        while(!p.equals(pa)){
            System.out.println("Your entered password was wrong : ");
            System.out.println("\nAre u forget ur password yes or no : ");
            ans = s.next();
            if(ans.equals("yes")){
                System.out.println(pa);
            }
            System.out.println("\nEnter your password of our app :");
            p= s.next();

        }
        while(p.equals(pa)){
            System.out.println("Would u like to order some thing Say yes or no");
            ans=s.next();
            if (ans.equals("yes")){
                System.out.println("ok, say what you want ");
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
                ans=s.next();
                if(ans.equals("no")){
                    break;
                }
        
            }  
            else {
                System.out.println("Thank you sir have a nice day");
            }
        }
        
        
    }
    
}
