package org.coderearth.scheduled;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by kunal_patel on 21/11/17.
 */
@Component
public class UpdatingService implements InitializingBean {

    private static final Logger LOGGER = LoggerFactory.getLogger(UpdatingService.class);

    public void update() {
        LOGGER.info("Starting UpdatingService !!");
        LOGGER.info("Stoping UpdatingService !!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        LOGGER.info("Initialized UpdatingService !!");
    }
}
