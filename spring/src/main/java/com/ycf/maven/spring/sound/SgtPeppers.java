package com.ycf.maven.spring.sound;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

@Component
public class SgtPeppers implements CompactDisc {

    private Logger logger = Logger.getLogger(SgtPeppers.class);
    private String title = "这是个 title";
    private String artist = "这是个 artist";

    @Override
    public void play() {
        // TODO Auto-generated method stub
        logger.debug(title);
    }

    
}