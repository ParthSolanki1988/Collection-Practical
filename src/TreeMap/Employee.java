package TreeMap;

import java.util.Map;
import java.util.TreeMap;

/**
 * Point 4 : Create tree set and iterate through loop.
 */

public class Employee {
  public static void main(String[] args) {
    TreeMap<Integer , String> treeMap = new TreeMap<>();

    treeMap.put(101 , "Parth");
    treeMap.put(110 , "jay");
    treeMap.put(102 , "Arpit");
    treeMap.put(103 , "Yash");
    treeMap.put(120 , "Akash");
    treeMap.put(320 , "Akash");

    System.out.println(treeMap);

    for (Map.Entry m:
            treeMap.entrySet()) {
      System.out.println("Employee Id : " + m.getKey() + "\nEmployee Name : " + m.getValue() +"\n");
    }
  }
}
