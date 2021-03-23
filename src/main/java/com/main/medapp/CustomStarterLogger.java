package com.main.med_app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service

public class CustomStarterLogger {
    private Logger logger = LoggerFactory.getLogger(CustomStarterLogger.class);

    public void print(){
        logger.info("Application started successfully");
    }
}
