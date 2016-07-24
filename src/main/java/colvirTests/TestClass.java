package colvirTests;

/**
 * Created by Dmitry on 24.07.2016.
 */
public class TestClass {
    // Declaring an Array which can hold primitives.
    int[] anArray;
    /**
     * CLASS LEVEL MEMBER <code>anAnotherArray</code>.
     *
     * Declaring an Array and allocating it size so as it
     * can store 10 int values anAnotherArray can store 10
     * integer but as of now any values are not stored in it.
     *
     * THOUGH, user has not assigned values to 10 indices but
     * compiler has assigned 0 (default value of int) as default.
     */
    int[] aClassLevelArray = new int[10];
    // This is an alternate way to declare and initialize and array
    int[] anInitializedArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
    char[] myArray = {'M', 'Y', 'C', 'O', 'U', 'N', 'T', 'R', 'Y' };
    // This is a multi-dimensional array
    String[][] aMultiDimensionalArray = {
            { "Name", "Surname", "Profession" },
            { "ABC", "XYZ", "DummyValueProvider" },
            { "ABC", "XYZ", "DummyValueProvider" }
    };
    public static void main(String[] args) {
        new TestClass().executeMethodForClassLevelArrays();
        new TestClass().executeMethodForLocalLevelArrays();
        new TestClass().executeMethodForMultiDimensionalLevelArrays();
        new TestClass().showCaseUsageOfSystemarraycopy();
    }
    private void executeMethodForClassLevelArrays() {
        // We have not initialized array but still it has 0 in it...
        // which is a default value of int i.e. 0
        System.out.println(
                "Value at 0th Indice of class level aClassLevelArray = "
                        + aClassLevelArray[0]);
    }
    private void executeMethodForLocalLevelArrays() {
        // Declaration and memory allocation of a local array..
        // (local to this method).
        // Initialization is still not done, but at the time of memory
        // allocation it has initialized all the indices with default
        // value for int i.e. 0
        int[] aLocalArray = new int[10];
        System.out.println(
                "Value at 0th Indice of local aLocalArray = " + aLocalArray[0]);
        // See what happens in the case of String Array :)
        String[] aLocalStringArray = new String[10];
        System.out.println("Value at 0th Indice of local aLocalArray = "
                + aLocalStringArray[0]);
        // See what happens in the case of Object Array ;)
        Object[] aLocalObjectArray = new Object[10];
        System.out.println("Value at 0th Indice of local aLocalArray = "
                + aLocalObjectArray[0]);
    }
    private void executeMethodForMultiDimensionalLevelArrays() {
        System.out.println(
                "Name Surname Profession : " + aMultiDimensionalArray[1][0]
                        + " " + aMultiDimensionalArray[1][1] + " "
                        + aMultiDimensionalArray[1][2]);
    }
    public void showCaseUsageOfSystemarraycopy() {
        char[] copyFrom = { 'I', 'L', 'O', 'V', 'E', 'M', 'Y', 'C', 'O', 'U',
                'N', 'T', 'R', 'Y' };
        char[] copyTo = new char[10];
        System.arraycopy(copyFrom, 5, copyTo, 1, 9);
        System.out.println(new String(copyTo));
    }
}
