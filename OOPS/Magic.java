public class Magic {
    public static void main(String args[]) {
        Object o = new Object();
        Number n;
        Integer i = new Integer(10);
        Float f = new Float(3.14f);
        String s = new String("Sai");
        o = i;
        i = (Integer) o;
        n = i;
        o = f;
        f = (Float) o;
        n = f;
        o = s;
        s = (String) o;
        n = s;
    }
}
