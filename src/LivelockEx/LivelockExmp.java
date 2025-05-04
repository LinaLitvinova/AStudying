package LivelockEx;

public class LivelockExmp {

    public static void main(String[] args) {
        final Witcher witcher1 = new Witcher("Geralt");
        final Witcher witcher2 = new Witcher("Lambert");

        Thread thread1 = new Thread(() -> move(witcher1, witcher2), "Thread 1");
        Thread thread2 = new Thread(() -> move(witcher2, witcher1), "Thread 2");

        thread1.start();
        thread2.start();
    }

    public static void move(Witcher from, Witcher to) {
        while (true) {
            System.out.println(from.getName() + " wants to move away from " + to.getName());

            if (Math.random() > 0.5) {
                System.out.println(from.getName() + " is moving away.");
                break;
            } else {
                System.out.println(from.getName() + " is not moving.");
            }
        }
    }
}
