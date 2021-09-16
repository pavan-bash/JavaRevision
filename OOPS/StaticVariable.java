class Super {
    static int y = 10;
}

public class StaticVariable {
    static int s = 9;

    void get() {
        System.out.println(s);
    }

    void set(int x) {
        s = x;
    }

    public static void main(String args[]) {
        StaticVariable sv = new StaticVariable();
        StaticVariable sv1 = new StaticVariable();
        sv.get();
        sv.set(6);
        sv1.get();

        System.out.println(Super.y);
    }
}
