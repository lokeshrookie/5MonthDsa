package implementations;

public class Tree {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g =  new TreeNode(7);
        TreeNode h = new TreeNode(8);
        a.leftChild = b;
        a.rightChild = c;
        b.leftChild = d;
        b.rightChild = e;
        c.leftChild = f;
        c.rightChild = g;
        g.leftChild = h;

        preOrder(a);
        System.out.println();
        postOrder(a);
        inOrder(a);

    }


    private static class TreeNode{
        // Tree node a val and right and left childs
        private int value;
        private TreeNode leftChild;
        private TreeNode rightChild;

        public TreeNode(int value){
            this.value = value;
            this.leftChild = null;
            this.rightChild = null;
        }

        public TreeNode(int value, TreeNode leftChild, TreeNode rightChild){
            this.value = value;
            this.leftChild = leftChild;
            this.rightChild = rightChild;
        }
    }

    public static void displayTree(TreeNode root){
        if(root != null){
            System.out.println(root.value);
            displayTree(root.leftChild);
            displayTree(root.rightChild);
        }
    }
    public static void inOrder(TreeNode root){
        if(root != null){
            System.out.print(root.value + " ");
            inOrder(root.leftChild);
            inOrder(root.rightChild);
        }
    }

    public static void preOrder(TreeNode root){
        if(root != null){
            preOrder(root.leftChild);
            System.out.print(root.value + " ");
            preOrder(root.rightChild);
        }
    }
    public static void postOrder(TreeNode root){
        if(root != null){
            postOrder(root.rightChild);
            System.out.print(root.value + " ");
            postOrder(root.leftChild);
        }
    }
}
