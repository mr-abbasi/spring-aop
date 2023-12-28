package com.abbasi.springAopAround.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

import java.util.logging.Level;
import java.util.logging.Logger;

@Aspect
@Component
public class LogReturningAspect {

    private final Logger logger = Logger.getLogger(getClass().getName());

    @AfterReturning(value = "execution(* com.abbasi.springAopAround.service.*.*(..))", returning = "retVal")
    public void logReturn(JoinPoint joinPoint, Object retVal) {
        logger.log(Level.INFO, "return value from " + joinPoint.getSignature().getName() + ": " + retVal);
    }
}
