public class BubbleSortUsingRecur {

    public static int[] bSort(int[] arr, int i) {
        if (i < arr.length) {

            int tamp;
            int flag = 0;

            for (int j = 0; j < arr.length - 1-i; j++) {
                if (arr[j] > arr[j + 1]) {
                    tamp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = tamp;
                    flag = 1;
                }
            }
            if (flag == 0) {
                return arr;
            }
            bSort(arr, i+1);
        }
        return arr;

    }

    public static void main(String[] args) {

        int[] arr = { 36, 19, 26, 12, 5, 2 };
        int i = 0;
        // bSort(arr, i);


        for (int j : bSort(arr, i)) {
            System.out.print(j+" ");
        }

        // int tamp;

        // for (int i = 0; i < arr.length; i++) {
        // int flag = 0;
        // for (int j = 0; j < arr.length - 1 - i; j++) {
        // if (arr[j] > arr[j + 1]) {
        // tamp = arr[j];
        // arr[j] = arr[j + 1];
        // arr[j + 1] = tamp;
        // flag = 1;
        // }
        // }
        // if (flag == 0) {
        // break;
        // }
        // }

    }
}
