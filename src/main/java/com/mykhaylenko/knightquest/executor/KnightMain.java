package com.mykhaylenko.knightquest.executor;

import com.mykhaylenko.knightquest.config.ApplicationConfig;
import com.mykhaylenko.knightquest.knight.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
public class KnightMain {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Knight knight = context.getBean(Knight.class);
//        knight.embarkOnQuest();
        knight.embarkOnQuest(2);
    }
}
