class method{
  // no return without argument 
   public void add(){
     int a = 100;
     int b = 2000;
     System.out.println("Addition :" +(a+b));
   }
   // no return with argumnets
   public void sub(int x,int y){
    System.out.println(Math.abs(x-y));
   }
//with return type without parameters
   public int mul(){
    int x = 100;
    int y = 2;
    return x*y;
   }
   //with return type and with parameters
   public float div (int x ,int y){
    return x/y;
   }

}


public class functions {
  //user defined function 
  public static int[] sendArray(){

    return new int[]{1,2,3};
  }
  public static void main(String[] args){
    method o = new method();
    o.add();
    o.sub(100,200);
    System.out.println(o.mul());
    System.out.println(o.div(100,2));
    int arr[] = sendArray();
    //System.out.println(arr);
    for(int i : arr){
      System.out.println(i);
    }
  }
}
