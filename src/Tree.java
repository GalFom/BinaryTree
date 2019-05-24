public class Tree {
    private TreeNode root;


    public void add(String data) {
        if (data == null) {
            return;
        }

        if (root == null) {
            TreeNode newItem = new TreeNode();
            newItem.data = data;
            newItem.leftChild = null;
            newItem.rightChild = null;
            root = newItem;
            return;
        }

        TreeNode root2 = root;

        while (true) {
            int x = data.compareTo(root2.data);
            if (x == 0) {
                return;
            }
            if (x > 0) {
                if (root2.rightChild != null) {
                    root2 = root2.rightChild;
                } else {
                    TreeNode newItem = new TreeNode();
                    newItem.rightChild = null;
                    newItem.leftChild = null;
                    newItem.data = data;
                    root2.rightChild = newItem;
                    break;
                }
            }
            if (x < 0) {
                if (root2.leftChild != null) {
                    root2 = root2.leftChild;
                } else {
                    TreeNode newItem = new TreeNode();
                    newItem.rightChild = null;
                    newItem.leftChild = null;
                    newItem.data = data;
                    root2.leftChild = newItem;
                    break;
                }
            }
        }
    }

    public boolean has(String data) {

        if (data == null) {
            return false;
        }

        if (root == null) {
            return false;
        }

        TreeNode root2 = root;
        while (true) {
            int x = data.compareTo(root2.data);
            if (x==0){
                return true;
            }
            if(x>0){
                if(root2.rightChild!=null){
                    root2=root2.rightChild;
                }else{
                    return false;
                }

            }
            if(x<0){
                if(root2.leftChild!=null) {
                    root2 = root2.leftChild;
                }
                else{
                    return false;
                }
            }
        }


    }

}
