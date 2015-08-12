package com.mykhaylenko.knightquest.quest;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
public class DifficultQuest implements Quest {

    private String questEnemy;

    public DifficultQuest(String questEnemy) {
        this.questEnemy = questEnemy;
    }

    @Override
    public void startQuest() {
        System.out.printf("Difficult quest is started. Enemy: %s\n", questEnemy);
    }
}
