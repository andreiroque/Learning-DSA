import java.util.ArrayList;
import java.util.List;

public class Node{

  String value;
  List<Node> children;

  public Node(String value){
    this.value = value;
    children = new ArrayList<>();
  }


}