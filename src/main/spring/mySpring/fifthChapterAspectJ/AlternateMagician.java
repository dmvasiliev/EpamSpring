package mySpring.fifthChapterAspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class AlternateMagician implements MindReader {
    private String thoughts;

    @Pointcut("execution(* mySpring.fifthChapterAspectJ."
            + "Thinker.thinkOfSomething(String))")
    public void thinking() {
    }

    @Before("thinking() && args(thoughts)")
    public void interceptThoughts(String thoughts) {
        System.out.println("Intercepting volunteer's thoughts : " + thoughts);
        this.thoughts = thoughts;
    }

    public String getThoughts() {
        return thoughts;
    }
}
