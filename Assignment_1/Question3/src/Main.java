import java.util.ArrayList;


public class Main {


    public static void main(String[] args) {
        Enum daysOfTheWeek = new Enum();

        System.out.println(daysOfTheWeek.MONDAY);
        System.out.println(daysOfTheWeek.TUESDAY);
        System.out.println(daysOfTheWeek.TUESDAY);
        System.out.println(daysOfTheWeek.WEDNESDAY);
        System.out.println(daysOfTheWeek.THURSDAY);
        System.out.println(daysOfTheWeek.values());
        System.out.println(daysOfTheWeek.ordinal(daysOfTheWeek.FRIDAY));

    }

}

class Enum {

    final String MONDAY = "MONDAY";
    final String TUESDAY = "TUESDAY";
    final String WEDNESDAY = "WEDNESDAY";
    final String THURSDAY = "THURSDAY" ;
    final String FRIDAY = "FRIDAY";
    final String SATURDAY = "SATURDAY";
    final String SUNDAY = "SUNDAY";

    public ArrayList<String> values() {

        ArrayList<String> daysOfTheWeek = new ArrayList<>();

        daysOfTheWeek.add(MONDAY);
        daysOfTheWeek.add(TUESDAY);
        daysOfTheWeek.add(WEDNESDAY);
        daysOfTheWeek.add(THURSDAY);
        daysOfTheWeek.add(FRIDAY);
        daysOfTheWeek.add(SATURDAY);
        daysOfTheWeek.add(SUNDAY);

        return daysOfTheWeek;
    }
    public int ordinal(String day){
        int x = 0;
        int ordinal = -1;
        while (x < values().size()) {
            if(day.equals(values().get(x)))
            {
                ordinal = x+1;
            }
            x++;
        }
        return ordinal;
    }

}





