public class Main{

  public static int findHeight(BTNode root){
    if(root == null) return -1;

    int leftHeight = findHeight(root.left);
    int rightHeight = findHeight(root.right);

    return Math.max(leftHeight, rightHeight) + 1;
  }

  public static void main(String[] args){

    BTNode root = new BTNode(5);

    root.insert(new BTNode(2));
    root.insert(new BTNode(1));
    root.insert(new BTNode(3));
    root.insert(new BTNode(8));
    root.insert(new BTNode(7));
    root.insert(new BTNode(9));

  }

}