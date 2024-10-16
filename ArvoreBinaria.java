package ArvoreBinaria;

public class ArvoreBinaria {
    private Node root;

    // Getters
    public Node getRoot(){
        return this.root;
    }

    // Setter
    public void setRoot(int element){
        Node rootNode = new Node(element);

        this.root = rootNode;
    }

    //Methods to traverse the binary tree

    //in-order method
    public void inOrder(Node n){
        if(n != null){
            // traverse the left side of my tree
            inOrder(n.getLeftNode());
            //prints the left leaf 
            System.out.println(n.getElement());
            // traverse the right side of my tree
            inOrder(n.getRightNode());
        }
    }

    //pre-order method
    public void preOrder(Node n){
        if (n != null) {
            System.out.println(n.getElement());
            preOrder(n.getLeftNode());
            preOrder(n.getRightNode());
        }

    }

    //post-order method
    public void postOrder(Node n){
        if (n != null) {
            postOrder(n.getLeftNode());
            postOrder(n.getRightNode());
            System.out.println(n.getElement());
        }
    }

    //insert an element method
    public void insert(int element, Node root){
        //if the root is null, simply adds a node (root of the tree)
        if (root == null) {
            this.root = new Node(element);
        } else {
            // outer if-else condition checks wich of the next positions the algorithm should continue
            if (element >= root.getElement()) {
                // this if condition checks if is there a null node in the next right node to set the element
                if (root.getRightNode() == null) {
                    root.setRightNode(new Node(element));
                } else {
                    // if not empty, calls recursively the function for the next right node
                    insert(element, root.getRightNode());
                }
                // this outer else checks if the element is a smaller value then the root, making the algorithm move for the left nodes
            } else {
                // this if condition checks if is there a null node in the next left node to set the element
                if (root.getLeftNode() == null) {
                    root.setLeftNode(new Node(element));
                } else {
                    // if not empty, calls recursively the function for the next left node                    
                    insert(element, root.getLeftNode());
                }
            }
        }
    }

    //remove a given element method
    public void remove(int element, Node root){
        // first check if the is the tree empty
        if(root == null){
            return;
        }

        // as in the "insert" method, this one also checks for wich side the algorithm should go according to value of the "element"
        
        // outer "if" checks if the algorithm should go to the right side of the tree
        if (element > root.getElement()) {
            //this next "if" makes an exception treatment to avoid null nodes
            if (root.getRightNode() != null) {
                //checks if the right node is the one to be deleted
                if (root.getRightNode().getElement() == element) {
                    root.setRightNode(null);  // sets null the right node
                } else {
                    // otherwise calls recursively the remove method to the right (since right is for greater values compared to the "element")
                    remove(element, root.getRightNode()); 
                }
            }
        // outer "else" checks if the algorithm should go to the left side of the tree
        } else {
            //this next "if" makes an exception treatment to avoid null nodes
            if (root.getLeftNode() != null) {
                //checks if the left node is the one to be deleted                
                if (root.getLeftNode().getElement() == element) {
                    root.setLeftNode(null);  // sets null the right node
                } else {
                    // otherwise calls recursively the remove method to the left (since left is for greater values compared to the "element")                    
                    remove(element, root.getLeftNode());
                }
            }
        }
    }

    //method to remove the bigger elemet
    public void removeBigger(Node root){
        //verifies if the tree isn't empty
        if (root == null || root.getRightNode() == null) {
            return;
        }

        //checks the second node after the given root
        if (root.getRightNode().getRightNode() == null) {
            //if the next right node is the last, removes it
            root.setRightNode(null);
        } else {
            //continue recursively
            removeBigger(root.getRightNode());
        }
    }

    //method to remove the bigger elemet
    public void removeSmaller(Node root){
        //verifies if the tree isn't empty
        if (root == null || root.getLeftNode() == null) {
            return;
        }

        //checks the second node after the given root
        if (root.getLeftNode().getLeftNode() == null) {
            //if the next left node is the last, removes it
            root.setLeftNode(null);
        } else {
            //continue recursively
            removeSmaller(root.getLeftNode());
        }
    }
}

