package Sample;

public class Tree {
    private TreeNode root;
    public void  insert(int data){
        if(root==null)
            root = new TreeNode(data);
        else
            root.insert(data);

    }

    public void traveseInorder() {
        if(root!=null)
            root.inOrderTrevarsal();
    }
}
