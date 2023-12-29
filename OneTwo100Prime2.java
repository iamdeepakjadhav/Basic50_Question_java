public class OneTwo100Prime2 {
    public static void main(String[] args) {
        for(int i = 1 ; i<=100; i++){
            boolean bul = true;
            for(int j = 2; j<i; j++){
                if (i %j == 0) {
                    bul = false;
                }
            }
            if (bul) {
                System.out.print(i+" ");
            }

        }
    }
}
