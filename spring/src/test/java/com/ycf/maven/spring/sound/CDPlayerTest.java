package com.ycf.maven.spring.sound;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
@ActiveProfiles("dev")
public class CDPlayerTest {

    private Logger logger = Logger.getLogger(CDPlayerTest.class);
    @Autowired
    @Qualifier("sgtPeppers")
    private CompactDisc cd;

    @Autowired
    private MediaPlayer player;
    
    @Autowired
    private MediaPlayer player1;
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void cdShouldNotBeNull() {
        logger.info("message");
        assertNotNull(cd);
        
    }

    @Test
    public void play() {
        player.play();
        SgtPeppers sgtPeppers = (SgtPeppers) player.getCompactDisc();
        sgtPeppers.ip = 3;
        player1.play();
        // System.out.print("1");
        // assertEquals("1", log.getLog());
    }

}