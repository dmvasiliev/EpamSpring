package evBorisov.epamJava.three;

/**
 * Created by VasDA on 19.09.2016.
 */
public class MyClassLoader extends ClassLoader {

//    @Override
//    protected Class<?> findClass(String name) throws ClassNotFoundException {
//        System.out.println("print time before find class: " + System.currentTimeMillis());
//        return super.findClass(name);
//    }

    @Override
    public Class<?> loadClass(String name) throws ClassNotFoundException {
        System.out.println("print time before load class: " + System.currentTimeMillis());
        return super.loadClass(name);
    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader myClassLoader = new MyClassLoader();
        myClassLoader.loadClass("evBorisov.epamJava.three.Person").newInstance();
    }
}
