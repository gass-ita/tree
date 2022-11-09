class Tree{
    TreeNode root;

    Tree(){
        root = null;
    }

    public void insert(int value){
        root = insert(root, value, 0, 0);
    }

    //insert the bigger to the right and the smaller to the left using a recursive function
    private TreeNode insert(TreeNode node, int value, int i, int j){
        if(node == null){
            node = new TreeNode(value, i, j);
        }else{
            if(value <= node.getValue()){
                node.setLeft(insert(node.getLeft(), value, i + 1, 2 * j));
            }else{
                node.setRight(insert(node.getRight(), value, i + 1, 2 * j + 1));
            }
        }
        return node;
    }

    public int height(){
        return height(root);
    }
    
    //find the height of the tree using a recursive function
    private int height(TreeNode node){
        if(node == null){
            return 0;
        }else{
            return 1 + Math.max(height(node.getLeft()), height(node.getRight()));
        }
    }

    public TreeNode getRoot(){
        return root;
    }

    public String toString(){
        return toString(root);
    }

    //print the tree using a recursive function
    private String toString(TreeNode node){
        if(node == null){
            return "";
        }else{
            return toString(node.getLeft()) + node.toString() + " " + toString(node.getRight());
        }
    }
}