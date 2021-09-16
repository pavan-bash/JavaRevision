class Super {
    int x = 2;
}

class Sub {
    int y = 3;
    Super s = new Super();
}

class HasA {
    public static void main(String args[]) {
        Sub b = new Sub();
        System.out.println(b.y);
        System.out.println(b.s.x);
    }
}
