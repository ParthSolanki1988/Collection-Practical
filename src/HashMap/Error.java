package HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * point 2 : Create hash map and iterate through loop.
 */
public class Error {
  public static void main(String[] args) {
    /**
     * HashMap class which allows us to store key and value pair,
     */
    HashMap<Integer, String> hashMap = new HashMap<>(4);

    hashMap.put(200, "OK");
    hashMap.put(202, "Accepted");
    hashMap.put(301 , "Moved Permanently");
    hashMap.put(201 , "Created");
    hashMap.put(100 , "Continue");


    /**
     * iterate entry using forEach loop
     */
    for (Map.Entry mapEntry : hashMap.entrySet()) {
      System.out.println("Error Status : " + mapEntry.getKey() + "\nError Message : "+ mapEntry.getValue());
    }

    /**
     * iterate using iterator (entrySet() is convert HashMap to Set)
     */
    Iterator iterator = hashMap.entrySet().iterator();
    while (iterator.hasNext()){
      System.out.println(iterator.next());
    }

    /**
     * using lambda expression
     */
      hashMap.forEach((key , value) -> System.out.println("Error Status : " + key + "\nError Message : " + value + '\n'));
  }
}
