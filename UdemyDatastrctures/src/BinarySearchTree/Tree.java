package BinarySearchTree;

public class Tree {
    private  TreeNode root;
    public void insert(int value){
        if(root==null){
            root=new TreeNode(value);
        }else{
            root.insert(value);
        }
    }
    public void traveseInorder()
    {
        if(root!=null)
            root.inOrderTreversal();
    }
}
