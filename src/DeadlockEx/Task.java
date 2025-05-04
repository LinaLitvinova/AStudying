package DeadlockEx;

class Task implements Runnable {
    private final DeadProg deadprog1;
    private final DeadProg deadprog2;

    public Task(DeadProg deadprog1, DeadProg deadprog2) {
        this.deadprog1 = deadprog1;
        this.deadprog2 = deadprog2;

    }

    @Override
    public void run() {
        synchronized (deadprog1) {
            System.out.println(Thread.currentThread().getName() + deadprog1.getName());

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (deadprog2) {
                System.out.println(Thread.currentThread().getName() + deadprog2.getName());
            }

        }
    }
}
