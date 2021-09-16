interface Shapes {
    float findArea(float x, float y);
}

class Rect implements Shapes {
    public float findArea(float x, float y) {
        return x * y;
    }
}

class Triangle implements Shapes {
    public float findArea(float x, float y) {
        return x * y * 0.5f;
    }
}

public class InterfaceDemo3 {
    public static void main(String args[]) {
        Rect r = new Rect();
        System.out.println(r.findArea(10, 20));
        Triangle t = new Triangle();
        System.out.println(t.findArea(10, 20));
    }
}
