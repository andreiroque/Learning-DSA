import java.util.ArrayList;

public class Arraylist{


  // This function assumes that there's only 1 target (no dupiclate)
  // I also pass in the target value instead of the index 
  // Because it would be better for my own sanity.
  public static void delFromArrayList(int target, ArrayList<Integer> list){
    for(int i = 0; i < list.size(); i++){
      if(list.get(i) == target){
        list.remove(i);
        break;
      }
    }
  }
  

  public static void main(String[] args){

    ArrayList<Integer> nums = new ArrayList<>();

    // Insertion:
    nums.add(2);
    nums.add(4);
    nums.add(3);

    // Printing the values within the ArrayList
    System.out.print("Original: ");
    for(int i = 0; i < nums.size(); i++){
      System.out.print(nums.get(i) + " ");
    }
  }

}