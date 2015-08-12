package com.mykhaylenko.soundsystem.cd;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * Created by pavlo.mykhaylenko on 8/6/2015.
 */
@Component
@Primary
public class ProdigyCd implements CompactDisc {

    @Override
    public void play() {
        System.out.println("Prodigy CD is playing");
    }
}
