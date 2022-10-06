class Student{
  public int roll_no;
  public String name;
  Student(int rn ,String n){
    this.roll_no = rn;
    this.name = n;
  }
  void print(){
    System.out.println("Name : "+name);
    System.out.println("Roll No :"+roll_no);
  }
}

public class arrayOfObjects {
  public static void main(String[] args){
    Student o = new Student(106 ,"Surieya");
    o.print();

    Student o1 = new Student(107 ,"Rust");
    o1.print();

    Student o2 = new Student(108 ,"Creamm");
    o2.print();

    Student[] arr; // array of type class Student;
    arr = new Student[5];
    arr[0] = o;
    arr[1] = o1;
    arr[2] = o2;
    arr[3] = new Student(101, "Rock");//direct object creation

    for(int i = 0 ; i < arr.length ;i++){
      arr[i].print();
    }



  }
}
