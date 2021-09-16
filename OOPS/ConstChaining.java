public class ConstChaining {
    ConstChaining() {
        System.out.println("Default");
    }

    ConstChaining(int x) {
        this();
        System.out.println("Para 1 " + x);
    }

    ConstChaining(int x, int y) {
        this(123);
        System.out.println("Para Double " + x + " " + y);
    }

    public static void main(String args[]) {
        ConstChaining c = new ConstChaining(3, 4);
    }
}
