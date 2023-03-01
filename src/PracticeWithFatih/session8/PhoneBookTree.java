package PracticeWithFatih.session8;

import java.util.ArrayList;
import java.util.List;

public class PhoneBookTree {

    CustomerNode root;

    public PhoneBookTree() {
        this.root = null;
    }

    void insert(CustomerNode newNode){
        if (root == null){
            root = newNode;
            return;
        }

        CustomerNode current = root;
        while(true){

            if (newNode.firstName.compareToIgnoreCase(current.firstName) < 0){

                if(current.leftChild == null){
                    current.leftChild = newNode;
                    break;
                }
                current = current.leftChild; // branch left
            }else{
                if( current.rightChild == null){
                    current.rightChild = newNode;
                    break;

                }
                current = current.rightChild;
            }
        }

    }


    void printNamesInAscOrder(CustomerNode root) {

            if (root == null) return; // termination
            printNamesInAscOrder(root.leftChild);
            System.out.print(root.firstName + ", ");
            printNamesInAscOrder(root.rightChild);

        }



    List<String> firstNamesListRecursive(CustomerNode root,List<String> list){ // This is an In Order Traversal Iteratively
        if (root==null) return list;
        firstNamesListRecursive(root.leftChild,list);
        list.add(root.firstName);
        firstNamesListRecursive(root.rightChild,list);
        return list;
    }
    List<String> firstNamesList3(CustomerNode root) { // This is an In Order Traversal Recursive, with no list as a parameter
        List<String> result = new ArrayList<>();
        if (root == null) return result;
        result.addAll(firstNamesList3(root.leftChild));
        result.add(root.firstName);
        result.addAll(firstNamesList3(root.rightChild));
        return result;

    }


}
