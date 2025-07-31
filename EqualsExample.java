public class EqualsExample {
  public static void main(String[] args) {
    String str1 = "Hello";
    String str2 = "Hello";
    String str3 = "Hello";
    
    System.out.println("str1.equals(str2): " + str1.equals(str2));
    System.out.println("str1.equals(str3): " + str1.equals(str3));
    
    System.out.println("str1.equalsIgnoreCase(str2): " + str1.equalsIgnoreCase(str2));
  }
}