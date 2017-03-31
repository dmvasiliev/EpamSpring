package mySpring.firstChapter.test;

import mySpring.firstChapter.BraveKnight;
import mySpring.firstChapter.Minstrel;
import mySpring.firstChapter.Quest;
import mySpring.firstChapter.QuestException;
import org.junit.Test;

import static org.mockito.Mockito.*;

/**
 * Created by Dmitry on 29.03.2017.
 */
public class BraveKnightTest {
    @Test
    public void knightShouldEmbarkOnQuest() throws QuestException {
        Quest mockQuest = mock(Quest.class); // Создание фиктивного
// объекта Quest
        BraveKnight knight = new BraveKnight(mockQuest, new Minstrel()); // Внедрение
        knight.embarkOnQuest();
        verify(mockQuest, times(1)).embark();
    }
}
