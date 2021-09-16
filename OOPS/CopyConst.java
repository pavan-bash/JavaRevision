public class CopyConst {
    int x;

    CopyConst(int x) {
        this.x = x;
    }

    CopyConst(CopyConst c) {
        x = c.x;
    }

    public static void main(String args[]) {
        CopyConst c1 = new CopyConst(10);
        System.out.println(c1.x);
        CopyConst c2 = new CopyConst(c1);
        System.out.println(c2.x);
    }
}
