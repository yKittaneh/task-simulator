package org.example;

import java.time.LocalTime;
import java.util.Random;
import java.util.logging.Logger;

public class TaskSimulator {

    private static final Logger logger = Logger.getLogger(TaskSimulator.class.getName());

    private static final Long RUN_TIME_IN_MINUTES = 60L;

    public static void main(String[] str) {
        logger.info("TaskSimulator called...");
        LocalTime startTime = LocalTime.now();

        logger.info("Start time = " + startTime.toString());

        long sum = 0;
        Random random = new Random();

        while (LocalTime.now().minusMinutes(RUN_TIME_IN_MINUTES).isBefore(startTime)) {
            if (sum > Long.MAX_VALUE - 100L) {
                logger.info("sum value reached [{}], going to reset it to 0 :)");
                sum = 0;
            }
            sum += random.nextInt(5);
        }

        logger.info("Finish time = " + LocalTime.now().toString() + ", sum = " + sum);

        logger.info("TaskSimulator finished.");

    }
}
