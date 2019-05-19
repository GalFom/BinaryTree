public class Tree {
    private TreeNode root;
    TreeNode newItem = new TreeNode();


    public void add(String data) {
        if (root == null) {
            newItem.data = data;
            newItem.leftChild = null;
            newItem.rightChild = null;
            root = newItem;
        } else {
            if (newItem < root) { //
                newItem = root.leftChild;
                newItem.leftChild = null;
                newItem.rightChild = null;
            }
            if (newItem < root.leftChild) {  //
                root = root.leftChild;
                newItem = root.leftChild;
                newItem.leftChild = null;
                newItem.rightChild = null;
            }
            if (newItem > root.leftChild && newItem < root.rightChild) {
                root = root.leftChild;
                newItem = root.rightChild;
                newItem.leftChild = null;
                newItem.rightChild = null;
            }
            f (newItem > root.rightChild) {  //
                root = root.rightChild;
                newItem = root.rightChild;
                newItem.leftChild = null;
                newItem.rightChild = null;
            }
        }
    }

    public boolean has(String data) {
        if (root == null) {
            return false;
        }
        if (data == root.data) {
            return true;
        }
        else{
            while (root.data!=data){
                if(root.data < data) {
                    root = root.leftChild;
                }else {
                    root = root.rightChild;
                }
            }
            return true;
        }



    }
}
