package com.ycf.maven.spring.sound;

import static org.junit.Assert.assertNotNull;

import org.apache.log4j.Logger;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = CDPlayerConfig.class)
@TestPropertySource("classpath:conf.properties") // 声明属性源
// @ActiveProfiles("dev")
public class CDPlayerTest {

    private Logger logger = Logger.getLogger(CDPlayerTest.class);
    @Autowired
    // @Qualifier("sgtPeppers")
    // @Qualifier("compactDisc")
    private CompactDisc cd;

    @Autowired
    Environment env;

    @Value("${setimeout}")
    private int setTimeout;

    @Autowired
    private MediaPlayer player;

    @Autowired
    private MediaPlayer player1;
    @Rule
    public final SystemOutRule log = new SystemOutRule().enableLog();

    @Test
    public void cdShouldNotBeNull() {
        logger.info(System.getProperties());
        cd.play();
        logger.info(((SgtPeppers) cd).getArtist());
        logger.info("message");
        assertNotNull(cd);
    }

    @Test
    public void play() {

        // MockHttpServletRequest request = new MockHttpServletRequest();
        // MockHttpSession session = new MockHttpSession();
        // request.setSession(session);
        // RequestContextHolder.setRequestAttributes(new
        // ServletRequestAttributes(request));
        player.play();
        SgtPeppers sgtPeppers = (SgtPeppers) player.getCompactDisc();
        sgtPeppers.ip = 3;
        player1.play();
        // System.out.print("1");
        // assertEquals("1", log.getLog());
    }

    @Test
    public void properties() {
        logger.info(env.getProperty("setimeout"));
        logger.error(setTimeout);
    }
}