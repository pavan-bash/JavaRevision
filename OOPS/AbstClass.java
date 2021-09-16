abstract class Shapes {
    float dim1, dim2;

    abstract float findArea();

    void set(float dim1, float dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }
}

class Rect extends Shapes {
    float findArea() {
        return dim1 * dim2;
    }
}

class Triangle extends Shapes {
    float findArea() {
        return 0.5f * dim1 * dim2;
    }
}

class AbstClass {
    public static void main(String args[]) {
        Rect r = new Rect();
        r.set(10, 10);
        System.out.println(r.findArea());
        Triangle t = new Triangle();
        t.set(10, 10);
        System.out.println(t.findArea());
    }
}
