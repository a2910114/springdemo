package com.mykhaylenko.soundsystem.player;

import com.mykhaylenko.soundsystem.cd.CdExistsCondition;
import com.mykhaylenko.soundsystem.cd.CompactDisc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
@Component
@Profile("dev")
@Conditional(CdExistsCondition.class)
public class CdPlayer implements MediaPlayer {

    @Autowired(required = false) // if no existing bean which can satisfy DI, there won't be error
//    @Qualifier("redHot") // can't be used for constructor
    private CompactDisc cd;

//    public CdPlayer(CompactDisc cd) {
//        this.cd = cd;
//    }

    @Override
    public void play() {
        System.out.println("Player is on");
        cd.play();
        System.out.println("Player is off");
    }
}
