package com.mykhaylenko.knightquest.minstrel;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;

/**
 * Created by pavlo.mykhaylenko on 8/5/2015.
 */
@Aspect
public class Minstrel {

    @Pointcut("execution(public void embarkOnQuest())")
    public void questRun() {}

    @Before("questRun()")
    public void singBeforeQuest() {
        System.out.printf("La La La before quest!\n");
    }

    @After("execution(* com.mykhaylenko.knightquest.knight.*.embark*())")
    public void singAfterQuest() {
        System.out.println("Tu La La after quest\n");
    }

    @Around("questRun()")
    public void compliteQuest(ProceedingJoinPoint joinPoint) {
        try {
            System.out.println("Sing before to become brave");
            joinPoint.proceed();
            System.out.println("Sing after quest, we fight down all enemies ");
        } catch (Throwable throwable) {
            System.out.println("Some thing went wrong, your hero is dead.");
        }
    }
}
