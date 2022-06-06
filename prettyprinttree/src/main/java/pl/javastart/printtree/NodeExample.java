package pl.javastart.printtree;

import ajs.printutils.PrettyPrintTree;

class NodeExample {
    public static void main(String[] args) {
        Node<Integer> root = new Node<>(111);
        root.setLeft(new Node<>(222));
        root.setRight(new Node<>(333));
        root.getLeft().setLeft(new Node<>(444));
        root.getLeft().setRight(new Node<>(555));

        PrettyPrintTree<Node<Integer>> prettyTree = new PrettyPrintTree<>(
                Node::getChildren,
                node -> node.getValue().toString()
        );
        prettyTree.display(root);
    }
}
