package evBorisov.epamSpring.bestService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by VasDA on 25.07.2016.
 */
public class BetterThanBestService extends BestService {
    private List cache = new ArrayList();

    @Override
    public void chuckNorrisMethod() {
        cache.add(1);
    }
}
