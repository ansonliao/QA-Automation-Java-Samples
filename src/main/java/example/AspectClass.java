package example;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class AspectClass {

    @Pointcut("execution(* example.MyApp.sayHi())")
    public void pointCut() {

    }

    // @After("pointCut()")
    // public void afterAdvice(JoinPoint joinPoint) throws Throwable {
    //     System.out.println("Before point cut...");
    //     System.out.println("After point cut.");
    // }

    @Around("pointCut()")
    public void aroundAdvice(ProceedingJoinPoint joinPoint) throws Throwable {
        System.out.println("before around advice...");
        joinPoint.proceed();
        System.out.println("after around advice...");
    }

}
