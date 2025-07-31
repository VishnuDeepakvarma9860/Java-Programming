public class SubstringExample {
  public static void main(String[] args) {
    String text = ("1,2,3,4,5,6,7,8,9,10,11,12,13,14,15");
    
    String sub1 = text.substring(0,4);
    
    String sub2 = text.substring(5, 16);
    
    System.out.println("Original String: " + text);
    System.out.println("substring 1: " + sub1);
    System.out.println("substring 2: " + sub2);
  }
}
