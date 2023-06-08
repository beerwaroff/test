package threads;

public class MyRunnable implements Runnable {
    @Override
    public void run() {
        for (int i = 1000; i <= 2000; i ++) {
            System.out.println("#: " + i);
        }
    }
}
