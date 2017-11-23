package org.coderearth.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.stereotype.Component;

/**
 * Created by kunal_patel on 21/11/17.
 */
@Component
public class AppPostInitializer implements ApplicationListener<ContextRefreshedEvent> {

    private static final Logger LOGGER = LoggerFactory.getLogger(AppPostInitializer.class);

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        LOGGER.debug("Starting ContextRefreshedEvent !!");

        final ThreadPoolTaskScheduler executorService = event.getApplicationContext().getBean("scheduler", ThreadPoolTaskScheduler.class);
        LOGGER.debug("{}", executorService.toString());
        executorService.destroy();
        LOGGER.debug("Finished ContextRefreshedEvent !!");
    }
}
