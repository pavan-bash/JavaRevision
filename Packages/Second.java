import MyPack.First;

class Use extends First {
    void use() {
        First f = new First();
        Use u = new Use();
        f.publicFirst();
        // f.protectedFirst();
        // protectedFirst() has protected access in First
        // f.defaultFirst();
        // It is not public in First; cannot be accessed from outside package
        // f.privateFirst();
        // privateFirst() has private access in First

        u.protectedFirst();
    }
}

public class Second {
    public static void main(String args[]) {
        Use u = new Use();
        u.use();
    }
}
