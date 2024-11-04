public class FromOneToHundred {
    public static void main(String[] args) {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }

}
