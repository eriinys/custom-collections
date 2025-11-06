import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        FixedList<String> names = new FixedList<String>(5);

        names.add("Olivia");
        names.add("Dave");
        names.add("Jennifer");
        names.add("Glynis");
        names.add("Cynthia");
        names.add("Alex");

        System.out.println("Maximum size: " + names.getItems().size());
        System.out.println("Current Members: " + names.getItems());

        FixedList<LocalDate> dates = new FixedList<>(3);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMM dd, yyyy");

        dates.add(LocalDate.now());
        dates.add(LocalDate.now().withDayOfMonth(1));
        dates.add(LocalDate.now().withDayOfYear(300));

        //format print
        System.out.println("\nDates stored:");
        for (LocalDate date : dates.getItems()){
            System.out.println(date.format(formatter));
        }

        //normal print with automatic toString formatting
        System.out.printf("Dates: %s", dates.getItems());
    }
}
