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
    public void preOrder(){
        if(root!=null)
            root.preOrder();
    }
    public void delete(int value){
        root = delete(root,value);
    }
    private TreeNode delete (TreeNode subtreeRoot, int value){
        if(subtreeRoot==null){
            return subtreeRoot;
        }
        if(value<subtreeRoot.getData())
            subtreeRoot.setLeftNode(delete(subtreeRoot.getLeftNode(),value));
        else if (value> subtreeRoot.getData())
            subtreeRoot.setRightNode(delete(subtreeRoot.getRightNode(),value));
        else{
            if(subtreeRoot.getLeftNode()==null)
                return subtreeRoot.getRightNode();
            if(subtreeRoot.getRightNode()==null)
                return subtreeRoot.getLeftNode();
            subtreeRoot.setData(subtreeRoot.getRightNode().min());
            subtreeRoot.setRightNode(delete(subtreeRoot.getRightNode(), subtreeRoot.getData()));
        }
         return subtreeRoot;
    }
    public int min(){
        if(root==null)
            return Integer.MIN_VALUE;
        else{
            return root.min();
        }
    }
}
