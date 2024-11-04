public class ZeroOne {
    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 0, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1};

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

}
