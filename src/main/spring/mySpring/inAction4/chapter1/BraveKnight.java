package mySpring.inAction4.chapter1;

/**
 * Created by Dmitry on 28.04.2017.
 */
public class BraveKnight implements Knight {
    private Quest quest;

    public BraveKnight(Quest quest) {
        this.quest = quest;
    }

    public void embarkOnQuest() {
        quest.embark();
    }
}