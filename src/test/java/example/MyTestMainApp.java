package example;

import java.util.stream.Stream;


public class MyTestMainApp {

    public static void main(String[] args) {
        // Stream.of(args).forEach(System.out::println);
        MyApp myApp = new MyApp();
        myApp.sayHi();
    }
}
