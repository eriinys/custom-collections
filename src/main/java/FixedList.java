import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;
    private T right;
    private T left;

    public FixedList(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public FixedList(T left, T right){
        this.left = left;
        this.right = right;
    }

    public void add(T item){
        if (items.size() >= maxSize){
            System.out.println("Reached the maximum size limit.");
        } else {
            items.add(item);
        }
    }

    public List<T> getItems(){
        return items;
    }

}
