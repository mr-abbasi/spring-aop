package com.abbasi.springAopAround.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Aspect
@Order(1)
public class CheckVehicleStatusAspect {

    @Before("execution(* com.abbasi.springAopAround.service.*.*(..)) && args(vehicleStarted,..)")
    public void checkVehicleStatus(boolean vehicleStarted) {
        if (!vehicleStarted) {
            throw new RuntimeException("Vehicle not started to perform the operation");
        }
    }
}
