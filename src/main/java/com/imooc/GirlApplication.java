package com.imooc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GirlApplication {
    static Logger logger = LoggerFactory.getLogger(GirlApplication.class);

    public static void main(String[] args) {
        logger.debug("----> hahah");

        SpringApplication.run(GirlApplication.class, args);
    }
}
