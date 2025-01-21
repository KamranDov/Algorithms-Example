package HackerRank.Java;

public class Java_Inheritance_II {

  public static void main(String[] args) {
    Adder adder = new Adder();
    System.out.println("My superclass is: Arithmetic");
    System.out.print(adder.add(10, 32) + " ");
    System.out.print(adder.add(3, 10) + " ");
    System.out.print(adder.add(10, 10));
  }

}

  class Arithmetic{

    public int add(int a, int b){
        return a + b;
    }
  }

  class Adder extends Arithmetic{

  }
