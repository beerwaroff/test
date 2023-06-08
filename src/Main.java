import threads.MyThread;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
//
//        MyThread myThread = new MyThread();
//        myThread.start();
//
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//        myThread.shutdown();

        Map<Integer, String> fruits = new HashMap<>();
        fruits.put(1, "Яблоко");
        fruits.put(2, "Арбуз");

        System.out.println(fruits);
    }
}