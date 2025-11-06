import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
       //String
        FixedList<String> people = new FixedList<String>(5);
        people.add("Olivia");
        people.add("Dave");
        people.add("Jennifer");
        people.add("Glynis");
        people.add("Cynthia");
        people.add("Alex");

        System.out.println("Maximum size: " + people.getItems().size());
        System.out.println("Current Members: " + people.getItems());

        //Interface
        FixedList<Member> members = new FixedList<>(5);
        NewMember Olivia = new NewMember("Olivia");
        VipMembers Dave = new VipMembers("Dave");
        members.add(Olivia);
        members.add(Dave);

        for(Member member : members.getItems()){
            member.receiveReward();
        }

        Special<Member> specialMembers = new Special<>(new VipMembers("Dave"), new VipMembers("Jennifer"));
        specialMembers.receiveReward();


        //LocalDate
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
