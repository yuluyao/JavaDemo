
public class YieldDemo implements Runnable {
    @Override
    public void run() {
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName() + ": " + i);
//            Thread.yield();
        }
    }

    public static void main(String[] args) {
        YieldDemo runn = new YieldDemo();
        Thread thread_A = new Thread(runn,"Thread-A");
        Thread thread_B = new Thread(runn,"Thread-B");

        thread_A.start();
        thread_B.start();

    }
}