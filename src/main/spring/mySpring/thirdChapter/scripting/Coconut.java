package mySpring.thirdChapter.scripting;

/**
 * Created by Dmitry on 07.04.2017.
 */
public class Coconut {
    public Coconut() {
    }

    public void drinkThemBothUp() {
        System.out.println("You put the lime in the coconut...");
        System.out.println("and drink ‘em both up...");
        System.out.println("You put the lime in the coconut...");
        lime.drink(); // Вызов метода drink() интерфейса Lime
    }

    // Внедряемый компонент
    private mySpring.thirdChapter.scripting.groovy.Lime lime; // Для внедрения

    public void setLime(mySpring.thirdChapter.scripting.groovy.Lime lime) { // реализации
        this.lime = lime; // интерфейса Lime
    }
}