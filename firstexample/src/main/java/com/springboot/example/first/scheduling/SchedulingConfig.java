package com.springboot.example.first.scheduling;

import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * Created by yz on 2017/12/16.
 */
@Configuration
@EnableScheduling
public class SchedulingConfig {

    @Scheduled(cron = "0 0/1 * * * ?")
    public void scheduler() {
        System.out.printf(">>>>>>>>>>");
    }
}
