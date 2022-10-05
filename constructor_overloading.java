class Box{
  float length,breath;
  // constructor overloading
  public Box(int l,int b){
    this.length = l;
    this.breath = b;
  }
  public Box(int l){
    this.length  = l;
    this.breath = l;
  }
  float area(){
    return length*breath;
  }
}

public class constructor_overloading {
  public static void main(String[] args){
     Box o = new Box(20,30);
     Box o1 = new Box(10);
     System.out.println(o.area());
     System.out.println(o1.area());

  }
}
