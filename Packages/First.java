package MyPack;

public class First {
    public void publicFirst() {
        System.out.println("Public First");
    }

    protected void protectedFirst() {
        System.out.println("Protected First");
    }

    void defaultFirst() {
        System.out.println("Default First");
    }

    private void privateFirst() {
        System.out.println("Private First");
    }
}

// Compilation Command
// javac -d . First.java