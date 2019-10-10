package example;

import org.testng.Assert;
import org.testng.annotations.Test;


public class MyTest {

    @Test
    public void f1() {
        MyApp myApp = new MyApp();
        myApp.setString("This is testing the AspectJ plugin");
        myApp.sayHi();
    }

    @Test
    public void f2() {
        MyApp myApp = new MyApp();
        int index = 1;
        String string = "Hello World!";
        myApp.setIndex(index);
        myApp.setString(string);
        Assert.assertEquals(myApp.getIndex(), index, "Lombok setter looks like doesn't work");
        Assert.assertEquals(myApp.getString(), string, "Lombok setter looks like doesn't work");
    }
}
