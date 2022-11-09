public class TreeNode {
    private int value;
    private TreeNode left;
    private TreeNode right;
    private int i;
    private int j;

    public TreeNode(int value, int i, int j) {
        this.value = value;
        this.left = null;
        this.right = null;
        this.i = i;
        this.j = j;
    }

    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getI() {
        return i;
    }

    public int getJ() {
        return j;
    }
    
    @Override
    public String toString() {
        return value + "";
    }
}
