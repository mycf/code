package com.ycf.maven.spring.sound;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
// import org.springframework.stereotype.Component;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

// @Component // 表明该类作为组件类
@PropertySource("classpath:conf.properties") // 声明属性源
// @Primary //设置为首选bean
// @Qualifier("peppers") // 自定义限定符
// @Peppers //自定义注解
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class SgtPeppers implements CompactDisc {

    private String title;

    private String artist;

    private Logger logger = Logger.getLogger(SgtPeppers.class);
    // private String title = "这是个 title";
    public int ip = 1;

    public SgtPeppers() {

    }

    public SgtPeppers(@Value("${setimeout}") int setimeout) {
        this.ip = setimeout;
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        logger.debug(ip);
    }

    /**
     * @param artist the artist to set
     */
    public void setArtist(String artist) {
        this.artist = artist;
    }

    /**
     * @param title the title to set
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * @return the artist
     */
    public String getArtist() {
        return artist;
    }

    /**
     * @return the title
     */
    public String getTitle() {
        return title;
    }
    // public void play(@Value("${setimeout}") String setimeout) {
    // logger.info(setimeout);
    // }

}