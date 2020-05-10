import java.util.ArrayList;
import java.util.List;

public class Wrapper<T> {
    int count = 0;
    List<T> mylist = new ArrayList<T>();

    public void addItem(T t) throws DuplicateException {
        for (int i = 0; i < mylist.size(); i++) {
            if (getItem(i) == t) {
                count++;
            }
        }
        if (count != 0) {
            throw new DuplicateException("Duplicate Value : " + t);
        } else {
            if (t == null) {
                throw new NullPointerException("Can't input Null Value");
            } else {
                mylist.add(t);
            }
        }
    }

    public T getItem(int i) {
        return mylist.get(i);
    }
}
