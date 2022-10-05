public class stringBuffer_stringBuilder {
  public static void main(String args[]){
    StringBuffer buffer = new StringBuffer("surieya");
    System.out.println(buffer);
    buffer.append(" N");
    System.out.println(buffer);
    buffer.insert(9,"llll");
    System.out.println(buffer);
    buffer.replace(7,10,"$$$");
    System.out.println(buffer);
    System.out.println(buffer.delete(9,11)); 
    System.out.println(buffer.reverse());
    System.out.println(buffer.charAt(2));
    System.out.println(buffer.length());
    System.out.println(buffer.substring(0,5));
    buffer.setCharAt(0, 'S');
    System.out.println(buffer);
    System.out.println(buffer.capacity());
  }
}
