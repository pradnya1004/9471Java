import java.util.*;
public class CubeOfNumber {

   public static void main(String[] args)
{
    int i,n;
    System.out.print("Enter a Number : ");
    Scanner in = new Scanner(System.in);
    n = in.nextInt();
     for(i=1;i<=n;i++)
     {
     System.out.println("Number is : " +i+" and cube of " +i+" is : "+(i*i*i));     
    }
 }
}