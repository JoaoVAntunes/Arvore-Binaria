package ArvoreBinaria;

public class Main {
    public static void main(String[] args) {
        ArvoreBinaria tree = new ArvoreBinaria();

        tree.setRoot(8);
        tree.insert(10, tree.getRoot());
        tree.insert(12, tree.getRoot());
        tree.insert(4, tree.getRoot());
        tree.insert(1, tree.getRoot());

        tree.removeSmaller(tree.getRoot());

        tree.inOrder(tree.getRoot());
    }
}
