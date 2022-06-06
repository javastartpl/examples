package pl.javastart.printtree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MultiNode<T> {
    private T value;
    private List<MultiNode<T>> children = new ArrayList<>();

    public MultiNode(T value) {
        this.value = value;
    }

    public MultiNode<T> addChildren(MultiNode<T>... nodes) {
        children.addAll(Arrays.asList(nodes));
        return this;
    }

    public T getValue() {
        return value;
    }

    public List<MultiNode<T>> getChildren() {
        return children;
    }
}
