public class ParaConst {
    float r;

    ParaConst(float r) {
        this.r = r;
    }

    float findArea() {
        return 3.14f * r * r;
    }

    public static void main(String args[]) {
        ParaConst p = new ParaConst(2.0f);
        System.out.println(p.findArea());
    }
}
