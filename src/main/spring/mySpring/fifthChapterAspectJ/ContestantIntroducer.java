package mySpring.fifthChapterAspectJ;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;

@Aspect
public class ContestantIntroducer {

    @DeclareParents(
            value = "mySpring.fifthChapterAspectJ.Performer+",
            defaultImpl = GraciousContestant.class)
    public static Contestant contestant;
}