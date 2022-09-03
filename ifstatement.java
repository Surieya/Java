import java.util.Scanner;

public class ifstatement {
  public static void main(String args[]){
    int age;
    System.out.println("Enter your Age :");
    Scanner in = new Scanner(System.in);
    age = in.nextInt();
    if(age>=18)
    {
      System.out.println("You are Eligible For Vote...");
    }
    else{
      System.out.println("Sorry,You are not Eligible to vote");
    }

  }
  
}
