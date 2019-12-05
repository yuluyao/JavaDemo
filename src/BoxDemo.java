/**
 * 自动拆装箱
 */
public class BoxDemo {

    public static void main(String[] args) {
        Integer a = new Integer(10);
        Integer b = new Integer(10);

        Integer c = 20;
        Integer d = 20;

        System.out.println("a == b ?  "+(a == b));
        System.out.println("c == d ?  "+(c == d));
    }
}
