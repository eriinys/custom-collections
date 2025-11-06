public class Special<T extends Member> implements Member{
   private String name;
   private T left;
   private T right;


    public Special(T left, T right){
        this.left = left;
        this.right = right;
        this.name = name;
    }

    @Override
    public void receiveReward() {
        System.out.printf("%s and %s received special bonus of 1000 points!%n", left.getName(), right.getName());
    }

    @Override
    public String getName() {
        return "";
    }
}
