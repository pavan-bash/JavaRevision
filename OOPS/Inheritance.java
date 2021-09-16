class Super {
    int x = 2;
    private int y = 3;
    static int z = 4;
}

class Inheritance extends Super {
    int x = 3;

    void printX() {
        System.out.println(x);
        System.out.println(super.x);
    }

    public static void main(String args[]) {
        Inheritance i = new Inheritance();
        i.printX();
        System.out.println(i.y); // private
        System.out.println(z);
    }
}