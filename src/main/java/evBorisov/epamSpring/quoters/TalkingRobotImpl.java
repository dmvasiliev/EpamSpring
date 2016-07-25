package evBorisov.epamSpring.quoters;

import evBorisov.epamSpring.fraemwork.RunThisMethod;

import javax.annotation.PostConstruct;
import java.util.List;

/**
 * Created by VasDA on 22.07.2016.
 */
public class TalkingRobotImpl implements TalkingRobot {
    private List<Quoter> quoterList;

    @PostConstruct
    @RunThisMethod
    public void talk() {
        for (Quoter quoter : quoterList) {
            quoter.sayQuote();
        }
    }

    public List<Quoter> getQuoterList() {
        return quoterList;
    }

    public void setQuoterList(List<Quoter> quoterList) {
        this.quoterList = quoterList;
    }
}
