package com.amankos.aspects;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {
    @Before("com.amankos.aspects.MyPointcuts.allGetMethods()")
    public void beforeGetLoggingAdvice() {
        System.out.println("beforeGetLoggingAdvice: writing log #1");
    }

    @AfterReturning(pointcut = "com.amankos.aspects.MyPointcuts.allGetMethods()", returning = "returnedValue")
    public void afterReturningGetLoggingAdvice(Object returnedValue) {
        String value = (String) returnedValue;
        System.out.println("afterReturningGetLoggingAdvice: writing log value is " + value);
    }
}
