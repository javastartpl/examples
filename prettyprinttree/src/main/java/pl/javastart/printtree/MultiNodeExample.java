package pl.javastart.printtree;

import ajs.printutils.Color;
import ajs.printutils.PrettyPrintTree;

class MultiNodeExample {
    public static void main(String[] args) {
        MultiNode<String> root = new MultiNode<>("AAA");
        root.addChildren(
                new MultiNode<>("BBB").addChildren(
                        new MultiNode<>("EE\nEE"),
                        new MultiNode<>("FFF").addChildren(
                                new MultiNode<>("GGG"),
                                new MultiNode<>("HHH").addChildren(
                                        new MultiNode<>("XXX"),
                                        new MultiNode<>("YYY")
                                )
                        )
                ),
                new MultiNode<>("CCC"),
                new MultiNode<>("DDD")
        );

        PrettyPrintTree<MultiNode<String>> prettyTree = new PrettyPrintTree<>(
                MultiNode::getChildren,
                MultiNode::getValue
        );
        prettyTree.setColor(Color.RED);
        prettyTree.setTrim(2);
        prettyTree.setMaxDepth(3);
        prettyTree.display(root);
    }
}
