import java.util.*;
public class GreatestNo {
public static void main(String args[])
 {
Scanner in = new Scanner(System.in);
System.out.print("Enter the 1 number: ");
int n1 = in.nextInt();
System.out.print("Enter the 2 number: ");
int n2 = in.nextInt();
System.out.print("Enter the 3 number: ");
int n3 = in.nextInt();
   
 if (n1 > n2)
 if (n1 > n3)
 System.out.println("The greatest: "+n1);
   
 if (n2 > n1)
 if (n2 > n3)
 System.out.println("The greatest: "+n2);
   
 if (n3 > n1)
 if (n3 > n2)
 System.out.println("The greatest: "+n3);
}
}