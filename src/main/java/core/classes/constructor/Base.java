package core.classes.constructor;

/**
 * Created by Dmitry on 02.05.2017.
 */

//в качестве аргумента при вызове конструктора суперкласса нельзя передавать нестатические поля класса,
// результат выполнения нестатического метода или ссылку this. Т.о. в следующем примере вызовы конструктора
// предка (1) и (2) вызовут ошибку компиляции, а (3) и (4) будут работать правильно:

class Base {
    public Base(String s) {
        System.out.println("Base(" + s + ")");
    }
}

class Sub extends Base {

    private static final String CLASS_DUMMY_STRING = "CLASS_DUMMY_STRING";
    private final String INSTANCE_DUMMY_STRING = "INSTANCE_DUMMY_STRING";

    public Sub() {
//        super(INSTANCE_DUMMY_STRING); //(1)
//        super(getInstanceString());   //(2)
//        super(CLASS_DUMMY_STRING);    //(3)
        super(getClassString());     // (4)
    }

    private static String getClassString() {
        return CLASS_DUMMY_STRING;
    }

    private String getInstanceString() {
        return INSTANCE_DUMMY_STRING;
    }
}
