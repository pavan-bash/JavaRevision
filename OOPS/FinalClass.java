final class Sample {
    int x = 111;
}

class FinalClass extends Sample {
    public static void main(String args[]) {
        FinalClass f = new FinalClass();
        System.out.println(f.x);
    }
}
