import java.util.List;

public class Main{

  // Funtion to find the height of the binary tree.
  public static int findHeight(BTNode root){
    if(root == null) return -1;

    int leftHeight = findHeight(root.left);
    int rightHeight = findHeight(root.right);

    return Math.max(leftHeight, rightHeight) + 1;
  }

  // Helper function to perform inorder traversal and
  // populate the 2D matrix
  public static void inorder(BTNode root, int row, int col, int height, List<List<String>> ans){
    if(root == null) return;

    // Calculate offset for child position
    int offset = (int) Math.pow(2, height - row - 1);

    // Traverse the left subtree
    if(root.left != null){
      inorder(root.left, row + 1, col - offset, height, ans);
    }

    // Place the current node's vale in the matrix
    ans.get(row).set(col, String.valueOf(root.val));

    // Traverse the right subtree
    if(root.right != null){
      inorder(root.right, row + 1, col + offset, height, ans);
    }
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