package Static_elements;

public class TestStatic {
    // if we use static keyword, a specific variable is shared between all the objects.
    private static int staticVariable = 0;

    //int staticVariable = 0;
    public static int getStaticVariable() {
        return staticVariable;
    }

    public static void setStaticVariable(int staticVariable) {
        TestStatic.staticVariable = staticVariable;
    }
}
