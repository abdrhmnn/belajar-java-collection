package Map.EntryMap;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class Pengenalan {
  // yaitu inner interface didalam Map untuk mengambil key dan value yang sudah di set

  public static void main(String[] args) {
    Map<String, String> map = new TreeMap<>();
    map.put("abdu", "1");
    map.put("abdu2", "12");
    map.put("abdu3", "13");

    Set<Map.Entry<String, String>> entries = map.entrySet();
    for (Map.Entry<String,String> entry : entries) {
      System.out.println(entry.getValue()); // get value map
      System.out.println(entry.getKey()); // get key map
    }
  }
}
