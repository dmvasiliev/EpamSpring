package inAction4.chapter1.test;

import inAction4.chapter1.BraveKnight;
import inAction4.chapter1.Quest;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by Dmitry on 28.04.2017.
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() {
        Quest mockQuest = mock(Quest.class);
        BraveKnight knight = new BraveKnight(mockQuest);
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}