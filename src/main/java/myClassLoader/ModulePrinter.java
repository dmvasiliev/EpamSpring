package myClassLoader;

/**
 * Created by Dmitry on 23.02.2017.
 */
public class ModulePrinter implements Module {


    public void load() {
        System.out.println("Module " + this.getClass() + " loading ...");
    }

    public int run() {
        System.out.println("Module " + this.getClass() + " running ...");
        return Module.EXIT_SUCCESS;
    }

    public void unload() {
        System.out.println("Module " + this.getClass() + " inloading ...");
    }
}