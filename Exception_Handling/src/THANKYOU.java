public class THANKYOU {
    public static void main(String args[]) {
        try {

            int answer = 100 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception Caught..");
        } finally {
            System.out.println("Thank You!!");
        }
    }
}
