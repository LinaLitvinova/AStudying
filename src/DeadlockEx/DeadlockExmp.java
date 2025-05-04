package DeadlockEx;

public class DeadlockExmp {
    private static final DeadProg deadprog1 = new DeadProg("DeadProg1");
    private static final DeadProg deadprog2 = new DeadProg("DeadProg2");

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Task(deadprog1, deadprog2), "Thread1");
        Thread thread2 = new Thread(new Task(deadprog2, deadprog1), "Thread2");

        thread1.start();
        thread2.start();
    }
}
