package BinarySearchTree;

public class BinarySearchTree {
    private Node Root = null;

    //function to insert single item
    public void insert(int value){
        Node iterator = Root;
        Node leaf = iterator;
        if(Root != null) System.out.print("root:");
        while (iterator != null){
            System.out.print(iterator.getValue());
            if (iterator.getValue() < value){
                leaf = iterator;
                System.out.print("-right:");
                iterator = iterator.getRight();
            }else {
                leaf = iterator;
                System.out.print("-left:");
                iterator = iterator.getLeft();
            }
        }
        if (leaf == null){
            Root = new Node(value);
            System.out.println("root:   " + value);
        }else if (leaf.getValue() < value){
            leaf.setRight(new Node(value));
            System.out.println("    : " + value);
        }else {
            System.out.println("    : " + value);
            leaf.setLeft(new Node(value));
        }
    }

    //function to insert value in array
    public void insertArray(int[] arr){
        for (int i : arr)
            insert(i);
    }

    //function to search for an item
    public boolean find(int value){
        boolean found = false;
        if(Root ==  null) return found;
        Node current = Root;
        while (current != null && !found){
            if (current.getValue() < value)
                current = current.getRight();
            else if (current.getValue() > value)
                current = current.getLeft();
            else found = true;
        }
        return found;
    }

    public Node getRoot() { return Root; }
}
