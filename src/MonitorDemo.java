/**
 * Java 锁
 */
public class MonitorDemo {
    public static void main(String[] args) {
        Printer printer = new Printer();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (printer.num < 10) {
                    printer.printNum();
                }
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                while (printer.num < 10) {
                    printer.printNum();
                }
            }
        });

        t1.start();
        t2.start();
    }

    static class Printer {

        public int num = 0;

        public synchronized void printNum() {
            System.out.println(Thread.currentThread().getName() + " ---- " + num++);
            notify();
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
