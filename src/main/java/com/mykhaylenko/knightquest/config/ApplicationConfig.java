package com.mykhaylenko.knightquest.config;

import com.mykhaylenko.knightquest.knight.BraveKnight;
import com.mykhaylenko.knightquest.knight.Knight;
import com.mykhaylenko.knightquest.minstrel.Minstrel;
import com.mykhaylenko.knightquest.minstrel.QuestCounter;
import com.mykhaylenko.knightquest.quest.DifficultQuest;
import com.mykhaylenko.knightquest.quest.Quest;
import com.mykhaylenko.knightquest.quest.SimpleQuest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
@Configuration
@EnableAspectJAutoProxy
@PropertySource("classpath:/quest.properties")
public class ApplicationConfig {

    @Autowired
    private Environment env;

    @Bean
    public Knight knight(Quest quest) { // inject Quest as a parameter
        //        return new BraveKnight(quest()); // inject quest from bean creation method
//        return new BraveKnight(quest);

        List<Quest> quests = new ArrayList<>();

        for (int i = 0; i < 5; i++) {
            quests.add(diffucultQuest());
        }

        return new BraveKnight(quest, quests);
    }

    @Bean
    public Quest quest() {
        //        return new DifficultQuest(env.getProperty("difficultEnemy"));
        return new SimpleQuest();
    }

    @Bean Quest diffucultQuest() {
        return new DifficultQuest("ork");
    }

    @Bean
    public Minstrel minstrel() {
        return new Minstrel();
    }

    @Bean
    public QuestCounter counter () {
        return new QuestCounter();
    }

    @Bean // this bean needed to fill property @Value("easyEnemy") of
    public PropertySourcesPlaceholderConfigurer placeholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
