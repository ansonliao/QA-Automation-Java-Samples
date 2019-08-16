This is the sample project that configurate AspectJ plugin for a normal Gradle project (non-Android project, non-SpringMVC project)

## How to run

1.
 
In `src/main/java/example/MyApp.java` includes a main method, can run this main method by Gradle command:

```shell script
gradle clean runMyApp
```

and then will get the output from the console similar as below:

```shell script
gradle clean runMyApp

> Task :runMyApp
before around advice...
Hello World!
after around advice...

BUILD SUCCESSFUL in 5s
4 actionable tasks: 4 executed
```

2. 

In `src/test/java/example/MyTestMainApp.java` includes a main method, can run this main method by Gradle command:

```shell script
gradle clean runMyTestMainApp
```

and then will get the output from the console similar as below:

```shell script
> Task :runMyTestMainApp
before around advice...
Hello World!
after around advice...

BUILD SUCCESSFUL in 4s
4 actionable tasks: 4 executed
```

3. 

In `src/test/java/example/MyTest` includes some TestNG test method, can run this by Gradle command:

```shell script
gradle clean test
```

and then will get the output from the console similar as below:

```shell script
gradle clean test

> Task :test

Gradle suite > Gradle test > example.MyTest > f1 STANDARD_OUT
    before around advice...
    Hello World!
    after around advice...

Gradle suite > Gradle test > example.MyTest > f1 PASSED

BUILD SUCCESSFUL in 6s
4 actionable tasks: 4 executed
```
