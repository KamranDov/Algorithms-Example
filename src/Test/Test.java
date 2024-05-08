package Test;

public class Test {
    public static void main(String[] args) {
        test(1);
    }
    public static int test(int data){
        return test(data + 1);
    }
}
