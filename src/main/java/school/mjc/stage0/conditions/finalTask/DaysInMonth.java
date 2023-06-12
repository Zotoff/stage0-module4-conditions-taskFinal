package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        boolean isLeap;
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            isLeap = true;
        } else {
            isLeap = false;
        }

        if (month == 0 || month < 0) {
            System.out.println("invalid date");
        } else {
            int daysInMonth = 0;
            switch (month) {
                case 1:
                    daysInMonth = 31;
                    break;
                case 2:
                    if (isLeap) {
                        daysInMonth = 29;
                    }
                    else {
                        daysInMonth = 28;
                    }
                    break;
                case 3:
                    daysInMonth = 31;
                    break;
                case 4:
                    daysInMonth = 30;
                    break;
                case 5:
                    daysInMonth = 31;
                    break;
                case 6:
                    daysInMonth = 30;
                    break;
                case 7:
                    daysInMonth = 31;
                    break;
                case 8:
                    daysInMonth = 31;
                    break;
                case 9:
                    daysInMonth = 30;
                    break;
                case 10:
                    daysInMonth = 31;
                    break;
                case 11:
                    daysInMonth = 30;
                    break;
                case 12:
                    daysInMonth = 31;
                    break;
                default:
                    System.out.println("invalid date");
                    break;
            }
            System.out.println(daysInMonth);
        }
    }
}
