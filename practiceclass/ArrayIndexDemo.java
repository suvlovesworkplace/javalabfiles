public class ArrayIndexDemo{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        try {
            // Attempting to access an index that is out of bounds
            System.out.println(arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of bounds. Please provide a valid index. " + e.getMessage());
        }
    }
}