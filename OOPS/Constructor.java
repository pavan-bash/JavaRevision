public class Constructor {
    float l, b;

    Constructor() {
        l = 0.4f;
        b = 4.0f;
    }

    float findArea() {
        return l * b;
    }

    public static void main(String args[]) {
        Constructor c = new Constructor();
        System.out.println(c.findArea());
    }
}
