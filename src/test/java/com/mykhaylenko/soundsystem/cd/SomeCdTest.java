package com.mykhaylenko.soundsystem.cd;

import com.mykhaylenko.soundsystem.config.ApplicationConfig;
import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = ApplicationConfig.class)
public class SomeCdTest extends TestCase {

    @Autowired
    private CompactDisc cd;

    @Test
    public void testPlay() throws Exception {
        cd.play();
        assertNotNull(cd);
    }
}