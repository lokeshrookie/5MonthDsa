package implementations;

import com.sun.source.tree.Tree;

public class BinartTreeI {
    private TreeNode root;

    static class TreeNode{
        private int value;
        private TreeNode right;
        private TreeNode left;
        public TreeNode(){
            this.value = 0;
            this.right = null;
            this.left = null;
        }
    }

    public void display(TreeNode root){
        TreeNode temp = root;
        System.out.println(root.value);


    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode();
        root.value = 5;
        root.right.value = 4;
        root.left.value = 6;
    }

}
