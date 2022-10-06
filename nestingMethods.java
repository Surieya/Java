class demo{
  private int m,n;
  demo(int x , int y){
    this.m = x;
    this.n = y;
  }

  int largest(){
    if(m > n){
      return m;
    }
    else {
      return n;
    }
  }

  void display(){
    System.out.println("The Greatest Number is :"+largest());
  }

}


public class nestingMethods {
  
  public static void main(String[] args){
    
    demo o = new demo(10,20);
    o.display();
  }
}
