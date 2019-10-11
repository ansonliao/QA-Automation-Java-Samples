package example;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class MyApp {
    private int index;
    private String string;

    public static void main(String[] args) {
        MyApp myApp = new MyApp();
        myApp.sayHi();
    }

    public void sayHi() {
        System.out.println(string);
    }

}
