package threads;

public class MyThread extends Thread {

    private volatile boolean running = true;

    @Override
    public void run() {
        int i = 0;
        while (running){
            System.out.println("#: " + i++);
        }
    }

    public void shutdown() {
        this.running = false;
    }
}
