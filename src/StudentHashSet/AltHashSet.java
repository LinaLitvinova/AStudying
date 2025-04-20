package StudentHashSet;
import java.util.*;


class AltHashSet<T> {
    private Set<T> set = new HashSet<>();

    public void insert(T value) {
        set.add(value);
    }

    public void remove(T value) {
        set.remove(value);
    }

    public Set<T> getSet() {
        return set;
    }
}

