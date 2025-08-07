package com.example.spring_boot_rest.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class LoggingAspect {

    private static final Logger LOGGER = LoggerFactory.getLogger(LoggingAspect.class);

    //return type, class-name.method-name(args)
    //* -> all the methods
    //.. -> all the arguments
    @Before("execution(* com.example.spring_boot_rest.service.JobService.*(..))")
    public void logMethodCall(){

        LOGGER.info("Method called");
    }

}
