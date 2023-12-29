public class SelectionSortString {
    public static void main(String[] args) {
        // int[] arr = { 38, 52, 3, 8, 65, 9, 2, 75 };
        String[] arr = { "deepak", "rahul", "veer", "swati", "abhi", "bhupendra" };

        String tamp = "";
        int min;

        for (int i = 0; i < arr.length; i++) {
            min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j].compareTo(arr[min]) < 0) {
                    min = j;
                }
            }
            tamp = arr[i];
            arr[i] = arr[min];
            arr[min] = tamp;
        }

        for (String elementString : arr) {
            System.out.print(elementString + " ");
        }

    }
}
