package Module7;
    import java.util.Scanner;

    public class CompareComplexityOfLinearAndBinary {

        // Linear Search
        static int linearSearch(int arr[], int key) {
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == key)
                    return i;
            }
            return -1;
        }

        // Binary Search
        static int binarySearch(int arr[], int key) {
            int low = 0, high = arr.length - 1;

            while (low <= high) {
                int mid = (low + high) / 2;

                if (arr[mid] == key)
                    return mid;
                else if (arr[mid] < key)
                    low = mid + 1;
                else
                    high = mid - 1;
            }
            return -1;
        }

        public static void main(String[] args) {

            int arr[] = {10, 20, 30, 40, 50, 60};
            int key;

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter element to search: ");
            key = sc.nextInt();

            // Linear Search
            int linearResult = linearSearch(arr, key);
            if (linearResult != -1)
                System.out.println("Linear Search: Element found at position " + (linearResult + 1));
            else
                System.out.println("Linear Search: Element not found");

            // Binary Search
            int binaryResult = binarySearch(arr, key);
            if (binaryResult != -1)
                System.out.println("Binary Search: Element found at position " + (binaryResult + 1));
            else
                System.out.println("Binary Search: Element not found");

            // Complexity comparison
            System.out.println("\nTime Complexity Comparison:");
            System.out.println("Linear Search Worst Case: O(n)");
            System.out.println("Binary Search Worst Case: O(log n)");

            sc.close();
        }
    }

