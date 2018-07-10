package com.imocc.sell;

import lombok.extern.slf4j.Slf4j;
import org.apache.juli.logging.Log;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


/**
 * @author miss.ke
 * @date 2018-7-9
 */

@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {

    //private final Logger logger = LoggerFactory.getLogger(LoggerTest.class);

    @Test
    public void test1(){
        String name = "imooc";
        String pad = "123";
        log.info("info**********************");
        log.debug("debug*************************");
        log.error("error************************");
        log.info("name: {}, pad: {}", name, pad);
    }
}
