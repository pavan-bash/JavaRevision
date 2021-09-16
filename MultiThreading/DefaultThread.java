class Rat extends Thread {
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Rat...." + i);
        }
    }
}

class Cat extends Thread {
    public void run() {
        for (int i = 20; i <= 30; i++) {
            System.out.println("Cat...." + i);
        }
    }
}

public class DefaultThread {
    public static void main(String args[]) {
        // for (int i = 40; i <= 50; i++) {
        // System.out.println("Main...." + i);
        // }

        Rat r = new Rat();
        Cat c = new Cat();
        r.start();
        c.start();

        for (int i = 40; i <= 50; i++) {
            System.out.println("Main...." + i);
        }
    }
}
