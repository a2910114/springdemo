package com.mykhaylenko.knightquest.minstrel;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by pavlo.mykhaylenko on 8/11/2015.
 */
@Aspect
public class QuestCounter {

    private Map<Integer, Integer> counter = new HashMap<>();

    @Pointcut("execution(* com.mykhaylenko.knightquest.knight.*.embark*(int)) && args(questIndex)")
    public void questStarted(int questIndex) {}

    @Before("questStarted(questIndex)")
    public void countQuest(int questIndex) {
        int currentCount = getCurrentCount(questIndex);
        counter.put(questIndex, currentCount + 1);
        System.out.printf("quest index %d count %d\n", questIndex, currentCount + 1);
    }

    private int getCurrentCount(int questIndex) {
        return counter.containsKey(questIndex) ? counter.get(questIndex) : 0;
    }
}
