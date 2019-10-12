package com.ycf.maven.spring.sound;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

@Component
// @Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) //原型
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.INTERFACES)
public class CDPlayer implements MediaPlayer {
    private CompactDisc cd;

    // @Autowired
    // @Qualifier("sgtPeppers") //@Qualifier not application to constructor
    // public CDPlayer(CompactDisc cd) {
    // this.cd = cd;
    // }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        cd.play();
    }

    @Autowired
    @Qualifier("sgtPeppers")
    public void setCompactDisc(CompactDisc cd) {
        this.cd = cd;
    }

    public CompactDisc getCompactDisc() {
        return this.cd;
    }
}