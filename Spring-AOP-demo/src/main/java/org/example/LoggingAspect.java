package org.example;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class LoggingAspect {

    @Before("execution(* org.example.ShoppingCart.checkOut(..))")
    public void beforeLogging(JoinPoint jp)
    {
//        System.out.println("Signature:"+jp.getSignature());

        String args = jp.getArgs()[0].toString();
        System.out.println(" @Before logging method() with arguments: "+args);
    }

    @After("execution(* *.*.*.checkOut(..))")
    public void afterLogging()
    {
        System.out.println("@After logging method()...");
    }

    @Pointcut("execution(* org.example.ShoppingCart.quantity(..))")
    public void afterReturningPointcut() {}

    @AfterReturning(pointcut = "afterReturningPointcut()" ,returning = "returnVal")
    public void afterReturning(int returnVal)
    {
        System.out.println("After returning:"+returnVal);
    }

}
