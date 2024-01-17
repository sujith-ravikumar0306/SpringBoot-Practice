package org.example;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;


@Aspect
@Component
public class SanitizeDataAspect {

    @After("execution(* org.example.ShoppingCart.checkOut(..))")
    public void sanitizeData()
    {
        System.out.println("Session data is sanitized...");
    }
}
