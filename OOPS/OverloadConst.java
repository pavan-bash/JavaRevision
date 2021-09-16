public class OverloadConst {
    float b, h;

    OverloadConst() {
        b = 4.0f;
        h = 4.0f;
    }

    OverloadConst(float b, float h) {
        this.b = b;
        this.h = h;
    }

    float findArea() {
        return 0.5f * b * h;
    }

    public static void main(String args[]) {
        OverloadConst o = new OverloadConst();
        System.out.println(o.findArea());
        OverloadConst o1 = new OverloadConst(2.0f, 2.0f);
        System.out.println(o1.findArea());
    }
}
