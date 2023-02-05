import java.util.Arrays;

class MyExampleClass {

    public static int sumOfElements(int[] arr) {
        int n = arr.length;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int productOfElements(int[] arr) {
        int n = arr.length;
        int product = 1;
        for (int i = 0; i < n; i++) {
            product *= arr[i];
        }
        return product;
    }

    public static void printFibonacciSeries(int n) {
        int a = 0, b = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            int c = a + b;
            a = b;
            b = c;
        }
    }

    public static void reverseElements(int[] arr) {
        int n = arr.length;
        int start = 0;
        int end = n - 1;
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String args[]) {

        // change array values for different results
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int sum = sumOfElements(arr);
        System.out.println("\nSum of elements: " + sum);

        int product = productOfElements(arr);
        System.out.println("Product of elements: " + product);

        System.out.println("Fibonacci series: ");
        printFibonacciSeries(5);
        System.out.println();

        reverseElements(arr);
        System.out.println("Reversed array: " + Arrays.toString(arr) + "\n");

    }
}