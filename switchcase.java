import java.util.Scanner;

public class switchcase {
  public static void main(String args[])
  {
    int a,b,c,choice;
    System.out.println("Enter Your Choice :");
    System.out.println("1.Addition \n 2.Subtraction \n 3.Multiplication \n 4.Division");
    Scanner in = new Scanner(System.in);
    choice = in.nextInt();
    System.out.println("Enter @ numbers");
    a = in.nextInt();
    b = in.nextInt();
    switch(choice)
    {
      case 1:
         System.out.println("Addition :" +(a+b));
         break;
      case 2:
        System.out.println("Subtraction :"+(a-b));
        break;
      case 3:
         System.out.println("Multiplication :"+(a*b));
      case 4:
          System.out.println("Division "+(a/b));
          break;
      default:
         System.out.println("Invalid Statement");
    }
  }
}
