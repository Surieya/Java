class rectangle{
  private int length,width;
  // Setting Details
  void setDetails(int x,int y){
    this.length = x;// this may or maynot be used its our wish
    this.width = y;
  }
  // getting details
  int getLength(){
    return length;
  }
  int getWidth(){
    return width;
  }

  int area(){
    int a = length * width;
    return a;
  }
}

class triangle{
  int side1 , side2, side3;

  triangle(int x, int y,int z){
    System.out.println("Constructor called");
    this.side1 = x;
    side2 = y;
    this.side3 = z;
  }
}

public class class_object{
  public static void main(String[] args){
    rectangle o1 = new rectangle();
    // triangle o = new triangle(10,20,30);

    o1.setDetails(10,20);

    System.out.println(o1.area());

    System.out.println(o1.getLength());

    o1.setDetails(20,5);

    System.out.println(o1.getWidth());
  }
}