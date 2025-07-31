public class ReplaceExample {
  public static void main(String[] args) {
    String massage = "Java is funl  Java is powerful.";
    
    String resulth1 = massage.replace('a' , '0');
    System.out.println("After replacing 'a' with '0' : " + resulth1);
    
    String resulth2 = massage.replace("Java","Python");
    System.out.println("After replacing 'Java' with 'Python': " + resulth2);
  }
}