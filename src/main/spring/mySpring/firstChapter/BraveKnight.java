package mySpring.firstChapter;

/**
 * Created by Dmitry on 29.03.2017.
 */
//public class BraveKnight implements Knight {
//    private Quest quest;
//
//    public BraveKnight(Quest quest) {
//        this.quest = quest; // Внедрение сценария подвига
//    }
//
//    public void embarkOnQuest() throws QuestException {
//        quest.embark();
//    }
//}


public class BraveKnight implements Knight {
    private Quest quest;
    private Minstrel minstrel;

    public BraveKnight(Quest quest, Minstrel minstrel) {
        this.quest = quest;
        this.minstrel = minstrel;
    }

    public void embarkOnQuest() throws QuestException {
        minstrel.singBeforeQuest(); // Должен ли рыцарь руководить
        quest.embark(); // своим менестрелем?
        minstrel.singAfterQuest();
    }
}
