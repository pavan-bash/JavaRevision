interface Super1 {
    int x = 0;

    void p();
}

interface Super2 {
    int x = 1;

    void p();
}

public class MultipleInher implements Super1, Super2 {
    public void p() {

    }

    public static void main(String args[]) {
        // MultipleInher m = new MultipleInher();
        System.out.println(Super1.x);
        System.out.println(Super2.x);
        // System.out.println(m.x);
        // MultipleInher.java:14: error: reference to x is ambiguous
        // System.out.println(m.x);
        // ^
        // both variable x in Super1 and variable x in Super2 match
        // 1 error
    }
}
