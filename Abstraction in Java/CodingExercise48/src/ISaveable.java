import java.util.LinkedList;

public interface ISaveable {
    LinkedList<String> list = new LinkedList<>();
    default LinkedList<String> write(){
        return list;
    }
    void read(LinkedList<String> list);

}