package com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * Describe class.
 *
 * @author daniel
 */
@Component
public class Main implements CommandLineRunner {
    private static final Logger LOGGER = LoggerFactory.getLogger(Main.class);
    @Override
    public void run(String... strings) throws Exception {
        LOGGER.info("=== Hello! ===");
    }
}
