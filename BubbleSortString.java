public class BubbleSortString {
    public static void main(String[] args) {
        String[] names = {"Deepak","Ram","Syam","Vebhav","Abhinav","Dev"};

        String tamp ="";

        for(int i = 0; i<names.length; i++){
            int flag =0;
            for(int j =0; j<names.length-1-i ; j++){
                if (names[j].compareTo(names[j+1])>0) {
                    tamp = names[j];
                    names[j] = names[j+1];
                    names[j+1]= tamp;
                    flag = 1;
                }
            }
            if (flag==0) {
                break;
            }
        }

        for (String elemeString : names) {
            System.out.print(elemeString+" ");
        }
    }
}
