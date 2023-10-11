import java.util.Scanner;
/**
 * Large
 */
public class Large {

    public static void main(String[] args) {
        int a,b,c;
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a:");
        a=input.nextInt();
         System.out.print("Enter b:");
         b=input.nextInt();
          System.out.print("Enter c:");
          c=input.nextInt();

          if(a>b && a>c)
          {
            System.out.println("The large num is:"+a);

          }
          else if(b>a && b>c)
          {
                 System.out.println("The large num is:"+b);
          }
          else
          {
                 System.out.println("The large num is:"+c);
          }
    }
}