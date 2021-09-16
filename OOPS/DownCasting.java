class Super {

}

class Sub extends Super {

}

public class DownCasting {
    public static void main(String args[]) {
        Super sa = new Super();
        Sub sb = new Sub();

        sa = sb;
        // sb = sa;
        sb = (Sub) sa; // downcasting
    }
}