package com.desofme.springbootaop.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AspectService {

    @Before("execution(* com.desofme.springbootaop.service.*.*(..))")
    public void beforeSendMessage(JoinPoint joinPoint){
        System.out.println("Before method param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

    @After("execution(* com.desofme.springbootaop.service.*.*(..))")
    public void afterSendMessage(JoinPoint joinPoint){
        System.out.println("After method param: " + joinPoint.getArgs()[0]);
        System.out.println(joinPoint.getSignature());
    }

}
