public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {38,52,3,8,65,9,2,75};
        int tamp = 0, min;

        for(int i=0; i<arr.length; i++){
            min = i;
            for(int j= i+1; j<arr.length; j++){
                if (arr[j]<arr[min]) {
                    min = j;
                }
            }
            tamp = arr[i];
            arr[i]= arr[min];
            arr[min]= tamp;
        }

        for (int element : arr) {
            System.out.print(element+" ");
        }
        
    }
}
