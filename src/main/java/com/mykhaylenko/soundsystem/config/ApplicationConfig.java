package com.mykhaylenko.soundsystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
@Configuration
//@ComponentScan look in this package and all packages under this
//@ComponentScan("com.mykhaylenko.soundsystem") look in specified package and all packages under it
//@ComponentScan(basePackageClasses = { CompactDisc.class}) look for specified classes, and scan packages
// in which classes are
@ComponentScan(basePackages = {"com.mykhaylenko.soundsystem"})
public class ApplicationConfig {
}
