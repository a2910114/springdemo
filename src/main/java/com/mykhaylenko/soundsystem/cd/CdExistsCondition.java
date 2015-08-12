package com.mykhaylenko.soundsystem.cd;

import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
public class CdExistsCondition implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
//        implement some logic to check matches and return result
//        if true - bean will be created, if false - no. Example:
//        Environment environment = context.getEnvironment();
//        return environment.containsProperty("someCd");
        return true;
    }
}
