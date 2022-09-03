import java.util.Scanner;

public class groupswitch {
  public static void main(String args[])
  {
    char a ;
    Scanner in = new Scanner(System.in);
    System.out.println("Enter a Character :");
    a = in.next().charAt(0);
    switch(a)
    {
      case 'a':
      case 'e':
      case 'i':
      case 'o':
      case 'u':
         System.out.println(a +" is a Vowels");
         break;
      default:
          System.out.println(a +" is Consonant");
          break;
    }

    
  }
}
