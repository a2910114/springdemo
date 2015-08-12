package com.mykhaylenko.knightquest.knight;

import com.mykhaylenko.knightquest.quest.Quest;

import java.util.List;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
public class BraveKnight implements Knight {

    private Quest quest;

    private List<Quest> quests;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public BraveKnight(List quests) {
        this.quests = quests;
    }

    public BraveKnight(Quest quest, List<Quest> quests) {
        this.quest = quest;
        this.quests = quests;
    }

    @Override
    public void embarkOnQuest() {
        quest.startQuest();
    }

    @Override
    public void embarkOnQuest(int questIndex) {
        quests.get(questIndex).startQuest();
    }
}
