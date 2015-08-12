package com.mykhaylenko.knightquest.knight;

import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
public interface Knight {

//    @Pointcut("embark") i can't remember why i wrote this ))
    void embarkOnQuest();

    void embarkOnQuest(int questIndex);
}
