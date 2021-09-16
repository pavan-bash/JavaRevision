class Cat extends Thread {
    Cat(String s) {
        super(s);
    }

    public void run() {
        try {
            sleep(5000);
        } catch (InterruptedException a) {
            a.printStackTrace();
        }
        for (int i = 1; i <= 3; i++) {
            System.out.println(getName() + i);
        }
    }
}

class Rat extends Thread {
    public void run() {
        for (int i = 40; i <= 43; i++) {
            System.out.println(getName() + i);
        }
    }
}

public class SleepPrg {
    public static void main(String args[]) {
        Cat c = new Cat("Cat");
        Rat r = new Rat();
        r.setName("Rat");
        c.start();
        r.start();
    }
}
