public class Methods {
    int x = 5;

    void get() {
        System.out.println(x);
    }

    void set(int x) {
        this.x = x;
    }

    public static void main(String args[]) {
        Methods m = new Methods();
        m.get();
        m.set(3);
        m.get();
    }
}
