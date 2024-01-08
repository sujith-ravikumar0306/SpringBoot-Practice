package org.example;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AuthenticationAspect {

    @Pointcut("within(*org.example..*)")
    public void authenticationPointcut()
    {
        /* Logic for Authentication*/
    }

    @Pointcut("within(*org.example..*)")
    public void authorizationPointcut()
    {
        /* Logic for Authorization*/
    }

    @Before("authenticationPointcut() && authorizationPointcut()")
    public void authenticate()
    {
        System.out.println("Authenticating the request... \n (Authorization on the way...)");
    }
}
