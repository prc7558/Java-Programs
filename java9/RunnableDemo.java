package java9;

class MyRunnable implements Runnable {

    public void run() {
        System.out.println("Thread is running...");
    }
}

public class RunnableDemo {

    public static void main(String[] args) {

        MyRunnable obj = new MyRunnable();
        Thread t = new Thread(obj);

        t.start();
    }
}