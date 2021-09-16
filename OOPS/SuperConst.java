class Super {
    Super() {
        System.out.println("Super Const");
    }
}

class Sub extends Super {
    // Sub() {
    // System.out.println("Sub Const");
    // }

    Sub(int x) {
        System.out.println("Sub Const");
    }
}

public class SuperConst extends Sub {
    SuperConst() {
        super(6);
        System.out.println("Main Const");
    }

    public static void main(String args[]) {
        SuperConst s = new SuperConst();
    }
}
