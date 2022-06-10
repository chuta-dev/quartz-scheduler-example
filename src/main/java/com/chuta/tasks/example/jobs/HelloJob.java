package com.chuta.tasks.example.jobs;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloJob implements Job {
    private final Logger logger = LoggerFactory.getLogger(HelloJob.class);

    public void execute(JobExecutionContext context)throws JobExecutionException {
        System.out.println("Hello! ┌( ಠ_ಠ)┘");

        logger.info("Hello! ┌( ಠ_ಠ)┘");
        logger.debug("Hello! ┌( ಠ_ಠ)┘");
    }
}
