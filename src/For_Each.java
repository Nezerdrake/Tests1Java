public class For_Each {
    public static void main(String[] args) {

        int[] arr = new int[]{1, 2, 3, 4, 5, 77};
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = 10;
//        }

        for (int item : arr) {
            System.out.println(item);
        }

    }
}
