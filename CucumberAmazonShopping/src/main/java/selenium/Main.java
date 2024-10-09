package selenium;

public class Main {
  public int addNumbers(int a, int b){
     return addNum(a,b);
  }
  public int addNum(int a, int b){
    return 0;
  }
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Main main = new Main();
    System.out.println(main.addNumbers(12,34));

  }
}