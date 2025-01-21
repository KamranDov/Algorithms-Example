package HackerRank.Java;

import java.util.Scanner;

public class Java_Abstract_Class {
    public static void main(String[] args) {
        MyBook myBook = new MyBook();
        Scanner scanner = new Scanner(System.in);
        String title = scanner.nextLine();
        myBook.setTitle(title);
        System.out.println("The title is: " + myBook.getTitle());
    }

    abstract static class Book {
        String title;

        abstract void setTitle(String param);

        String getTitle() {
            return title;
        }
    }

     static class MyBook extends Book {

        @Override
        void setTitle(String param) {
            title = param;
        }
    }
}
