package com.mykhaylenko.soundsystem.player;

import com.mykhaylenko.soundsystem.config.ApplicationConfig;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { ApplicationConfig.class })
@ActiveProfiles("dev")
public class CdPlayerTest extends TestCase {

    @Autowired
    private MediaPlayer player;

    @Test
    public void testPlay() throws Exception {
        assertNotNull(player);
        player.play();
    }
}