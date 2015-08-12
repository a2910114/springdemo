package com.mykhaylenko.knightquest.quest;

import org.springframework.beans.factory.annotation.Value;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
public class SimpleQuest implements Quest {

    @Value("${easyEnemy}")
    private String questEnemy;

    @Value("${lightReward}")
    private String questReward;

    @Override
    public void startQuest() {
        System.out.printf("Simple quest. Enemy:\"%s\"; Reward \"%s\" \n", questEnemy, questReward);
    }
}
