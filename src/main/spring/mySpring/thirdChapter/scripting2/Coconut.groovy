package mySpring.thirdChapter.scripting2

/**
 * Created by Dmitry on 07.04.2017.
 */
class Coconut implements ICoconut {
    public void drinkThemBothUp() {
        println "You put the lime in the coconut..."
        println "and drink ‘em both up..."
        println "You put the lime in the coconut..."
        lime.drink()
    }
    mySpring.thirdChapter.scripting.Lime lime;
}