import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize){
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
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
