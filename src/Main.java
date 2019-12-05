public class Main {

    public static void main(String[] args) {


        int result = getCount();
        System.out.println("result is "+result);

    }


    private static int getCount() {
        int number = 1;
        try {
            return ++number;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("finally x is "+number);
        }
        return 0;
    }


}











