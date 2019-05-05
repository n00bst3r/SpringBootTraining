package de.rajic.springboot.training;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringBootTrainingApplication {

    private static final Logger LOGGER = LoggerFactory.getLogger(SpringBootTrainingApplication.class);
    @Autowired
    private ApplicationContext applicationContext;

    public static void main(String[] args) {
        SpringApplication.run(SpringBootTrainingApplication.class, args);
    }

    @Bean
    @Profile("dev")
    CommandLineRunner runner() {
        return args -> {
            System.out.println("This happens only in profile dev...");
            String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
            LOGGER.error("1. Error-Log");
            LOGGER.warn("2. Warn-Log");
            LOGGER.info("3. Info-Log");
            LOGGER.debug("4. Debug-Log");
            LOGGER.trace("5. Trace-Log");
        };
    }

}
