package EnumHW;

public class DayOfWeekMain {
    public static void main(String[] args) {
        System.out.println(getWorkingHours(DayOfWeek.Sunday));
    }

    public static int getWorkingHours(DayOfWeek day){
        int remainder = 0;

        int ind = day.ordinal();
        if (day.equals(DayOfWeek.Saturday) || day.equals(DayOfWeek.Sunday))
            System.out.println("Выходной!");
        else{
            for (int i = 0; i < DayOfWeek.values().length; i++) {
                switch (ind){
                    case 0:
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        remainder += 8;
                        break;
                    case 5:
                    case 6:
                        break;
                }
                ind ++;
            }
        }
        return remainder;
    }
}


