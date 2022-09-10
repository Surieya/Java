public class arrays {
  public static void main(String args[])
  {
    int array[] = {1,2,3,4,5,6};
    System.out.println(array);
    System.out.println(array.length);
    for(int number : array)
    {
      System.out.println(number);
    }
    //Creating array for storing 10 numbers
    // this 10 can be user specified (changable)
    int[] c = new int[10];
    for(int num : c)
    {
      System.out.println(num);
    }
  }
}
