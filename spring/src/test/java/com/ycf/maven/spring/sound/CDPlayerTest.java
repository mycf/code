package com.ycf.maven.spring.sound;

import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
public class CDPlayerTest {

    private Logger logger = Logger.getLogger(CDPlayerTest.class);
    @Autowired
    private CompactDisc cd;

    @Test
    public void cdShouldNotBeNull() {
        logger.info("message");
        assertNotNull(cd);
    }
}