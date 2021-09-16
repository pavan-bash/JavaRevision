class Super {
    void mtd1() {
        System.out.println("MTD1 Super");
    }
}

public class CompilePoly extends Super {
    void mtd1(int x) {
        System.out.println("MTD1 SUB " + x);
    }

    public static void main(String args[]) {
        CompilePoly c = new CompilePoly();
        c.mtd1();
        c.mtd1(5);
        Super s = new CompilePoly();
        s.mtd1();
        // s.mtd1(5);
        // CompilePoly c2 = new Super();
    }
}
