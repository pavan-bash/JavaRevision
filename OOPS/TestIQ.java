interface Test {
    // public abstract void method1();

    // void method2();

    // protected abstract void method3();
    // private abstract void method4();
    // default abstract void method5();
    default void method6() {
        System.out.println("HI");
    }

    // public static abstract void method7();
}

class TestIQ implements Test {
    public static void main(String args[]) {
        TestIQ t = new TestIQ();
        t.method6();
    }
}

// Compiled from "TestIQ.java"
// interface TestIQ {
// public abstract void method1();
// public abstract void method2();
// public default void method6();
// }
