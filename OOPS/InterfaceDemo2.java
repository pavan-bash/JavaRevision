interface Sample {
    int x = 0;

    int sum(int x, int y);
}

class InterfaceDemo2 implements Sample {
    public int sum(int x, int y) {
        return x + y;
    }

    public static void main(String args[]) {
        InterfaceDemo2 i = new InterfaceDemo2();
        System.out.println(i.sum(10, 20));
    }
}

// Possible Combinations
// class extends class
// class extends abstract class
// class implements interface
// abstract class extends class
// abstract class extends abstract class
// abstract class implements interface
// interface extends interface1, interface2, interface3
