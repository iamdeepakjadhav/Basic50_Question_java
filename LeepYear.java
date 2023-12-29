public class LeepYear {
    public static void main(String[] args) {
        // year %400 ==0 or year % 4==0and 100!=0 leep year condition
        int year = 2016;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is leep year ");
        } else {
            System.out.println(year + " is not a leep year");
        }

    }
}