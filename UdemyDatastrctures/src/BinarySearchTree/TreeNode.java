package BinarySearchTree;

public class TreeNode {
    private int data;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    public void insert(int value){
        if(value == data)
            return;
        if(value<data){
            if(leftNode==null){
                leftNode = new TreeNode(value);
            }
            else{
                leftNode.insert(value);
            }
        }
        else{
            if(rightNode==null){
                rightNode=new TreeNode(value);
            }
            else
                rightNode.insert(value);
        }
    }


    public void inOrderTreversal(){
        if(leftNode!=null)
            leftNode.inOrderTreversal();
        System.out.println(data+".");
        if(rightNode!=null)
            rightNode.inOrderTreversal();

    }
}
