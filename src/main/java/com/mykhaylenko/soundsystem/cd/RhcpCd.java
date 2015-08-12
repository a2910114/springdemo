package com.mykhaylenko.soundsystem.cd;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Created by pavlo.mykhaylenko on 8/6/2015.
 */
@Component("redHot")
//@Qualifier("red") // set a qualifier for class
public class RhcpCd implements CompactDisc {
    @Override
    public void play() {
        System.out.println("Red Hot Chili Peppers CD is playing");
    }
}
