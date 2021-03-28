package com.serverside.module.servicebazarbd.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class MathUtils {

   public static Logger logger = LoggerFactory.getLogger(MathUtils.class);

    @PostConstruct
    public void hello(){
        logger.info("MathUtils Application started ...");
    }

    public int add(int a, int b){
        int x = a+b;
        return x;
    }

    public Double computeCircleArea(Double radius){
        return Math.PI* radius * radius;
    }

    public int subtract(int a, int b){
        return a-b;
    }
}
