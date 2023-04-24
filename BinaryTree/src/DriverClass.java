public class DriverClass {
    public static void main(String a[]) {
 
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(8);
        bst.insert(10);
        bst.insert(14);
        bst.insert(3);
        bst.insert(6);
        bst.insert(7);
        bst.insert(1);
        bst.insert(4);
        bst.insert(13);
        System.out.println("\n-------------------");
        System.out.println("In Order Traversal");
        bst.inOrderTraversal();
        
        bst.print();
    }
}