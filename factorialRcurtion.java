public class factorialRcurtion {
    static int fact = 0;

    public static void main(String[] args) {
        int fctnum = 5;
        int ans = fctnum;

        findFact(fctnum, ans);

        System.out.println(fctnum+" factorial is :- "+fact);
    }

    public static void findFact(int fctnum, int ans) {

        if (fctnum >= 1) {
            int sum = 0;

            for (int i = 1; i < fctnum; i++) {
                sum += ans;
            }
            fact = ans;
            ans = sum;

            // fact = ans;
            // fact = fact * fctnum;

            findFact(fctnum - 1, ans);

        }
    }
}
