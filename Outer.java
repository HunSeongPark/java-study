/**
 * Created by Hunseong on 2022/06/02
 */
public class Outer {

    public void instanceMethod() {
        Inner inner = new Inner();
        InnerStatic innerStatic = new InnerStatic();
    }

    public static void staticMethod() {
//        Inner inner = new Inner(); // 'Outer.this' cannot be referenced from a static context
        InnerStatic innerStatic = new InnerStatic();
    }

    class Inner {}

    static class InnerStatic {}
}
