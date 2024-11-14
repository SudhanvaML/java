
enum Weekday {
    SUNDAY,
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY;
}

public class EnumExample {

    public static void main(String[] args) {

        Weekday[] days = Weekday.values();
        System.out.println("Days of the week:");
        for (Weekday day : days) {
            System.out.println(day);
        }

        Weekday day = Weekday.valueOf("FRIDAY");
        System.out.println("The selected day is: " + day);
    }
}
