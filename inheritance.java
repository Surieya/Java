class Father{ // base class
  public void house(){
    System.out.println("Have own 2BHK House");
  }
}

class Son extends Father{// derived class
  public void car(){
    System.out.println("Have Own Audi Car.");
  }
}



public class inheritance {
  public static void main(String[] args){
   Son o = new Son();
   o.car();
   o.house();

   // with one object for derived class we can access both base abd derived class
   
  }
}
