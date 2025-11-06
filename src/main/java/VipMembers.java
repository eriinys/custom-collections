public class VipMembers implements Member{
    private String name;

    public VipMembers(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void receiveReward(){
        System.out.printf("%s received 500 points this month!%n", name);
    }
}
