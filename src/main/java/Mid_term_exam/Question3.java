package Mid_term_exam;

public class Question3 {
    public static boolean isMonth(int a) {
        return (a > 0 && a <= 12);
    }

    public static int getDayOfMonth(int a) {
        if (isMonth(a)) {
            switch (a) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 30;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 31;
                case 2:
                    return 28;
            }
        }
        return 0;
    }
}
