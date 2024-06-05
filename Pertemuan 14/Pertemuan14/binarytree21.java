package Pertemuan14;

public class binarytree21 {
    node21 root;

    public binarytree21(){
        root = null;
    }

    boolean isEmpty(){
        return root == null;
    }

    void add(int data){
        if (isEmpty()) {
            root = new node21(data);
        } else {
            node21 current = root;
            node21 parent = null;
            while (true) {
                parent = current;
                if (data < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = new node21(data);
                        break;
                    }
                } else if (data > current.data) {
                    current = current.right;
                    if (current == null) {
                        parent.right = new node21(data);
                        break;
                    }
                } else {
                    break; // Duplicate data, do nothing
                }
            }
        }
    }

    boolean find(int data){
        node21 current = root;
        while (current != null) {
            if (data == current.data) {
                return true;
            } else if (data < current.data) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }

    void traversePreOrder(node21 node){
        if (node != null) {
            System.out.print(" " + node.data);
            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }

    void traversePostOrder(node21 node){
        if (node != null) {
            traversePostOrder(node.left);
            traversePostOrder(node.right);
            System.out.print(" " + node.data);
        }
    }

    void traverseInOrder(node21 node){
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.data);
            traverseInOrder(node.right);
        }
    }

    node21 getSuccessor(node21 del){
        node21 successor = del.right;
        node21 successorParent = del;
        while (successor.left != null) {
            successorParent = successor;
            successor = successor.left;
        }
        if (successor != del.right) {
            successorParent.left = successor.right;
            successor.right = del.right;
        }
        return successor;
    }

    void delete(int data) {
        if (isEmpty()) {
            System.out.println("Tree is empty");
            return;
        }

        node21 parent = root;
        node21 current = root;
        boolean isLeftChild = true;

        while (current != null && current.data != data) {
            parent = current;
            if (data < current.data) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
        }

        if (current == null) {
            System.out.println("Data not found!");
            return;
        }

        // Case 1: No children
        if (current.left == null && current.right == null) {
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                parent.left = null;
            } else {
                parent.right = null;
            }
        }
        // Case 2: One child (right)
        else if (current.left == null) {
            if (current == root) {
                root = current.right;
            } else if (isLeftChild) {
                parent.left = current.right;
            } else {
                parent.right = current.right;
            }
        }
        // Case 3: One child (left)
        else if (current.right == null) {
            if (current == root) {
                root = current.left;
            } else if (isLeftChild) {
                parent.left = current.left;
            } else {
                parent.right = current.left;
            }
        }
        // Case 4: Two children
        else {
            node21 successor = getSuccessor(current);
            if (current == root) {
                root = successor;
            } else if (isLeftChild) {
                parent.left = successor;
            } else {
                parent.right = successor;
            }
            successor.left = current.left;
        }
    }
    // method untuk menambahkan node secara rekursif
    node21 addRecursive(node21 root, int data){
        if (root == null) {
            root = new node21(data);
            return root;
        }
        if (data<root.data) {
            root.left = addRecursive(root.left, data);
        } else if (data > root.data){
            root.right = addRecursive(root.right, data);
        }
        return root; 
    }
    // method menampilkan nilai paling kecil
    int findMin(){
        return findMinRecursive(root);
    }
    int findMinRecursive(node21 root){
        if (root.left==null) {
            return root.data;
        } else{
            return findMinRecursive(root.left);
        }
    }

    // method menampilkan nilai paling besar
    int findMax(){
        return findMaxRecursive(root);
    }
    int findMaxRecursive(node21 root){
        if (root.right==null) {
            return root.data;
        } else{
            return findMaxRecursive(root.right);
        }
    }
    void printLeaf() {
        printLeafRecursive(root);
    }

    void printLeafRecursive(node21 root) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            System.out.print(root.data + " ");
        }

        printLeafRecursive(root.left);
        printLeafRecursive(root.right);
    }
    int countLeaf() {
        return countLeafRecursive(root);
    }

    int countLeafRecursive(node21 root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        } else {
            return countLeafRecursive(root.left) + countLeafRecursive(root.right);
        }
    }
}
