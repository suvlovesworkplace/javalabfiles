public class TestMyException {
    public static void main(String[] args) {
        try {
            throw new MyException("This is a custom exception message.");
        } catch (MyException e) {
            System.out.println("Caught MyException: " + e.getMessage());
        }
    }
}