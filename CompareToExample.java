public class CompareToExample {
  public static void main(String[] args) {
    String str1 = "Apple";
    String str2 = "Bannana";
    String str3 = "Apple";
    
    int result1 = str1.compareTo(str2);
    System.out.println("str1.compareTo(str2): " + result1);
    
    int result2 = str2.compareTo(str1);
    System.out.println("str2.compareTo(str1): " + result2);
    
     int result3 = str1.compareTo(str3);
     System.out.println("str1.compareTo(str3): " + result3);
  }
}