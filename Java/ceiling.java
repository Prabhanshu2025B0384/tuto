public class ceiling {
    public static void main(String args[]) {
        int arr[] = {3, 5, 8, 12, 14, 17, 19, 22, 25, 28, 31, 35, 39, 42, 46, 50, 55, 60, 66, 72};
        int k = search(arr, 100);  // Try other targets too
        System.out.print(k);
        System.out.print('a'>'b');
    }

    public static int search(int[] arr, int target) {
        boolean type = arr[0] < arr[arr.length - 1];  // Ascending or descending
        int start = 0;
        int end = arr.length - 1;
        int ceiling = Integer.MAX_VALUE;

        while (start <= end) {
            int mid = start + ((end - start) / 2);

            if (arr[mid] >= target && arr[mid] < ceiling) {
                ceiling = arr[mid];
            }

            if (type) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] < target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }

        return ceiling == Integer.MAX_VALUE ? -1 : ceiling;
    }
}
