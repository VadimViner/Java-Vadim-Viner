public class LenValueArr {
    public static int[] createArray(int len, int initialValue) {
        int[] array = new int[len];
        for (int i = 0; i < len; i++) {
            array[i] = initialValue;
        }
        return array;
    }

    public static void main(String[] args) {
        int len = 7;
        int initialValue = 15;
        int[] resultArray = createArray(len, initialValue);

        for (int element : resultArray) {
            System.out.print(element + " ");
        }
    }

}
