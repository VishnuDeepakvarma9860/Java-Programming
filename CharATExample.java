public class CharATExample {
    public static void main(String[] args) {
      
      String text = "Java";
      
      char firstChar = text.charAt(0);
      char lastChar = text.charAt(text.length() - 1);
      
      System.out.println("String: " + text);
      System.out.println("First Character: " + firstChar);
      System.out.println("Last  Character: " + lastChar);
    }
}