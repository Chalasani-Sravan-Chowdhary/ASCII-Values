import java.util.Scanner;
public class ASCII {
    public static void main(String[] args){
        Scanner sc= new Scanner (System.in);
        System.out.print("Enter Character ");
        char ch=sc.next().charAt(0);
        System.out.print("ASCII value :"+(int)ch);
        
    }    
}
