class MyRunnable implements Runnable {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getId() + " Value " + i);

            try {
                // Introduce a sleep of 100 milliseconds
                Thread.sleep(100);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }
}

public class multithreading {
    public static void main(String args[]) {
        for (int i = 0; i < 5; i++) {
            Thread t1 = new Thread(new MyRunnable());
            t1.start();
        }

        Thread t2 = new Thread(new MyRunnable());
        t2.start();
    }
}
