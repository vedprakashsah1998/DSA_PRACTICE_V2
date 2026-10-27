public class ThreadngQuestion {
    public static void main(String[] args) {
        Thread t1 = new MyThread();
        t1.run();
    }
}

class MyThread extends Thread {
    @Override
    public void run() {
        super.run();
        System.out.println("Running Thread");
    }
}
