package com.abbasi.springAopAround.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.time.Instant;
import java.util.logging.Logger;

@Component
@Aspect
@Order(2)
public class LoggerAspect {
    private final Logger logger = Logger.getLogger(LoggerAspect.class.getName());

    @Around("execution(* com.abbasi.springAopAround.service.*.*(..))")
    public Object timeLogger(ProceedingJoinPoint joinPoint) throws Throwable {
        Instant start = Instant.now();
        logger.info(joinPoint.getSignature().toShortString() + " method execution start");
        var result =joinPoint.proceed();
        logger.info(joinPoint.getSignature() + " method execution end");
        Instant finish = Instant.now();
        long timeElapsed = Duration.between(start, finish).toMillis();
        logger.info("Time took to execute the" + joinPoint.getSignature() + " method: " + timeElapsed +" MilliSecond");
        return result;
    }
}
