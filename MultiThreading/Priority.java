class Child extends Thread {
    public void run() {
        for (int i = 15; i <= 20; i++) {
            System.out.println("Child...." + i);
        }
    }
}

public class Priority {
    public static void main(String args[]) {
        Child c = new Child();
        int cp = c.getPriority();
        System.out.println("Priority of child " + cp);

        Thread t = Thread.currentThread();
        int pc = t.getPriority();
        System.out.println("Priority of main " + pc);

        c.setPriority(Thread.MIN_PRIORITY);
        System.out.println("Priority of child " + c.getPriority());

        c.start();
        for (int i = 30; i <= 35; i++) {
            System.out.println("Main...." + i);
        }
    }
}
