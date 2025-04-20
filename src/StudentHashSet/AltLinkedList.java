package StudentHashSet;
import java.util.*;


public class AltLinkedList<T> {
        private List<T> list = new LinkedList<>();

        public void add(T value) {
            list.add(value);
        }

        public T get(int index) {
            return list.get(index);
        }

        public void remove(T value) {
            list.remove(value);
        }

        public void addAll(Collection<T> collection) {
            list.addAll(collection);
        }

        public List<T> getList() {
            return list;
        }
}
