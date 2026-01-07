public class BTNode{

  int val;
  BTNode left;
  BTNode right;

  public BTNode(int val){
    this.val = val;
    this.left = null;
    this.right = null;
  }


  public void insert(BTNode n){

    if(n.val <= this.val){
      if(this.left == null){
        this.left = n;
      }else{
        this.left.insert(n);
      }
    }else{
      if(this.right == null){
        this.right = n;
      }else{
        this.right.insert(n);
      }
    }

  }

}