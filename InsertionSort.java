public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {5,2,1,6,4,3,7};
        int tamp,j;
        for(int i = 1; i<arr.length; i++){
            tamp = arr[i];
            j= i;
            while(j>0 && arr[j-1]> tamp){
                arr[j]= arr[j-1];
                j = j-1;
            }
            arr[j]= tamp;
        }

        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
}
