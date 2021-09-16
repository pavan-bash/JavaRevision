public class Overloading {
    void mtd1() {
        System.out.println("MDT1");
    }

    void mtd1(int x) {
        System.out.println("MTD1 + " + x);
    }

    public static void main(String args[]) {
        Overloading o = new Overloading();
        o.mtd1();
        o.mtd1(6);
    }
}
