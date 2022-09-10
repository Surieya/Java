import java.util.Scanner;

public class reverse {
  public static void main(String args[]){
    try (Scanner in = new Scanner(System.in)) {
      System.out.println("Enter The number : ");
      int n = in.nextInt();
      int number=0,rem;
      while(n!=0)
      {
        rem = n%10;
        number = (number*10)+rem;
        n = n/10;
      }
      System.out.println("Reversed number : "+number);
    }
    
  }
}
