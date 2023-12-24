package com.abbasi.springAopAround.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.logging.Logger;

@Component
@Aspect
@Order(1)
public class CheckVehicleStatusAspect {
    private final Logger logger = Logger.getLogger(CheckVehicleStatusAspect.class.getName());

    @Before("execution(* com.abbasi.springAopAround.service.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStatus(JoinPoint joinPoint, boolean vehicleStarted) throws Throwable {
        if (!vehicleStarted) {
            throw new RuntimeException("Vehicle not started to perform the operation");
        }
    }
}
