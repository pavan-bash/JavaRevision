public class OverloadMain {
    void main(String args[]) {
        for (String string : args) {
            System.out.println(string);
        }
    }

    public static void main(String args[]) {
        OverloadMain o = new OverloadMain();
        String a[] = { "Pavan", "Bhanu", "Madhav" };
        o.main(a);
    }
}
