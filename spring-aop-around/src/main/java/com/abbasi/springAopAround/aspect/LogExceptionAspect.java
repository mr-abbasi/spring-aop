package com.abbasi.springAopAround.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Component
@Aspect
public class LogExceptionAspect {

    private final Logger logger = Logger.getLogger(LogExceptionAspect.class.getName());

    @AfterThrowing(value = "execution(* com.abbasi.springAopAround.service.*.*(..))", throwing = "ex")
    public void logException(JoinPoint joinPoint, Throwable ex) {
        logger.log(Level.SEVERE, "An exception happened in " + joinPoint.getSignature().getName() +
                "The Message is " + ex.getMessage()
        );
    }
}
