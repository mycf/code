package com.ycf.maven;

import com.ycf.maven.spring.sound.SgtPeppers;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 */
public final class App {

    static Logger logger = Logger.getLogger(App.class);
    private App() {
    }

    /**
     * Says hello to the world.
     * @param args The arguments of the program.
     */
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
        SgtPeppers sgtPeppers = (SgtPeppers) context.getBean("sgtPeppers");
        sgtPeppers.play();
        // logger.info("test");
        // System.out.println("Hello World!");
    }
}
