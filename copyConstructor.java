class complex{
  private int real,img;
  public complex(){
    this.real = 5;
    img = 2;
  }
  public complex(int real,int img){
    this.real = real;
    this.img = img;
  }
  //copy constructor
  public complex(complex o)
  {
    this.real = o.real;
    this.img  = o.img;
  }
  public String toString(){
    return "(" + real + "+" + img+"i)";
  }

}
public class copyConstructor{
  public static void main(String args[])
  {
      complex o1 = new complex();
      System.out.println("Object 1 " +o1);

      complex o2 = new complex(o1);
      System.out.println("Object2:" +o2);

  }
}