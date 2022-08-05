package org.example;

import java.time.LocalTime;
import java.util.Random;
import java.util.logging.Logger;

public class TaskSimulator {

    private static final Logger logger = Logger.getLogger(TaskSimulator.class.getName());

    public static void main(String[] str) {
        logger.info("TaskSimulator called...");
        LocalTime startTime = LocalTime.now();

        logger.info("Start time = " + startTime.toString());

        int sum = 0;

        while (!LocalTime.now().minusMinutes(15).isAfter(startTime))
            sum = new Random().nextInt(5);

        logger.info("Finish time = " + LocalTime.now().toString() + ", sum = " + sum);

        logger.info("TaskSimulator finished.");

    }
}
