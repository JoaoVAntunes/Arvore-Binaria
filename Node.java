package ArvoreBinaria;

public class Node {
    
    private int element;
    private Node leftNode;
    private Node rightNode;


    // Construtores: um para definir apenas o elemento e outro já sabendo o próximo nó
    public Node(int element) {
        this.element = element;
        this.leftNode = null;
        this.rightNode = null;
    }
    

    // Getters
    public int getElement() {
        return this.element;
    }
    
    public Node getLeftNode() {
        return this.leftNode;
    }

    public Node getRightNode() {
        return this.rightNode;
    }


    // Setters
    public void setElement(int element) {
        this.element = element;
    }
    
    public void setLeftNode(Node leftNode) {
        this.leftNode = leftNode;
    }

    public void setRightNode(Node rightNode) {
        this.rightNode = rightNode;
    }

    
}
