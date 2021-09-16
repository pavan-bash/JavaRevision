class Super {
    final void mtd1() {
        System.out.println("HI");
    }
}

class Sub extends Super {
    void mtd1() {
        System.out.println("HI Non Final");
    }
}

public class FinalMtd {
    public static void main(String args[]) {
        Sub s = new Sub();
        s.mtd1();
    }
}
