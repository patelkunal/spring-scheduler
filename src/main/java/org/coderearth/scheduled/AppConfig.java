package org.coderearth.scheduled;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by kunal_patel on 21/11/17.
 */
@Configuration
@ImportResource("classpath:application-context.xml")
@ComponentScan(basePackages = "org.coderearth.scheduled")
public class AppConfig {
}
