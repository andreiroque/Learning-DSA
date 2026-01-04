import java.util.ArrayList;

public class Arraylist{

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