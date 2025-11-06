public class NewMember implements Member{
    private String name;

    public NewMember(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void receiveReward() {
        System.out.printf("%s received 100 points this month!%n", name);
    }
}
