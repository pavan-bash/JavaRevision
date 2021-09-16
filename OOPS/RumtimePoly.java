class Super {
    void mtd(int x) {
        System.out.println("Super mtd " + x);
    }
}

public class RumtimePoly extends Super {
    void mtd(int x) {
        System.out.println("Sub mtd " + x);
    }

    public static void main(String args[]) {
        RumtimePoly r = new RumtimePoly();
        r.mtd(5);
        Super s = new RumtimePoly();
        s.mtd(5);
    }
}
