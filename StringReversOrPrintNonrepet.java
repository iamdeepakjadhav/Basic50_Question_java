public class StringReversOrPrintNonrepet {
    public static void main(String[] args) {
        String name = "deepak";
        char[] ar = name.toCharArray();
        char tamp;

        System.out.println("name is :- "+name);

        int lastindx = ar.length - 1;

        for (int i = 0; i < ar.length - 1; i++) {

            tamp = ar[i];
            ar[i] = ar[lastindx];
            ar[lastindx] = tamp;
            lastindx--;

        }
        System.out.print("revers name is :- ");
        for (char c : ar) {
            System.out.print(c);
        }

        for (int j = 0; j < ar.length - 1; j++) {
            for (int k = j + 1; k < ar.length; k++) {
                if (ar[j] == ar[k]) {
                    ar[j] = '0';
                    ar[k] = '0';
                }
            }
        }
        System.out.print("\nNon repeated character is :- ");
        for (int l = 0; l < ar.length; l++) {
            if (ar[l] != '0') {
                System.out.print(ar[l] + " ");
            }
        }

    }
}
