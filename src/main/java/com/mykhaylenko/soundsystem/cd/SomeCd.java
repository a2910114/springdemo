package com.mykhaylenko.soundsystem.cd;

import org.springframework.stereotype.Component;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
@Component
public class SomeCd implements CompactDisc {

    String title = "Some cd title";
    String artist = "Some artist";

    @Override
    public void play() {
        System.out.printf("Playing: Title - %s; Artist - %s\n", title, artist);
    }
}
