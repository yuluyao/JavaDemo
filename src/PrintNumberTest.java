import com.sun.tools.javac.code.Attribute;

public class PrintNumberTest {

    private final static Object obj = new Object();
    private static int number = 0;

    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    while (number < 10) {
                        obj.notify();
                        System.out.println(Thread.currentThread().getName()+" --> "+number++);
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }


            }
        },"T-1");

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (obj) {
                    while (number < 10) {
                        obj.notify();
                        System.out.println(Thread.currentThread().getName()+" --> "+number++);
                        try {
                            obj.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        },"T-2");


//        t1.start();
//        t2.start();
    }




}
