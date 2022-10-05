public class str {
  
  public static void main(String args[]){
    String a = "Surieya";
    String b = "Surieya";
    String c = "surieya";
    System.out.println(a.hashCode());
    System.out.println(b.hashCode());
    System.out.println(a.equals(b));
    System.out.println(a.equalsIgnoreCase(c));
    System.out.println(a.length());
    System.out.println(a.charAt(0));
    System.out.println(a.toUpperCase());
    System.out.println(a.replace("Surieya","surieya"));
    System.out.println(a.contains("surieya"));
    System.out.println(a.isEmpty());
    System.out.println(b.endsWith("a"));
    System.out.println(c.startsWith("s"));
    System.out.println(a.substring(4));

   char []carray = a.toCharArray();
   for(char d :carray) {
     System.out.println(d);
   }

   String str1 = " surieya ";
   System.out.println(str1.trim().length());
 }
}

 