package Map.SortedMap;

import java.util.Collections;
import java.util.SortedMap;
import java.util.TreeMap;

public class Pengenalan {
  // implementasi map dengan data key yang diurutkan sesuai dgn Comparable key atau bs dgn Comparator

  // konkrit class: TreeMap

  public static void main(String[] args) {
    // disini menggunakan String yg sudah otomatis menggunakan interface Comparable
    // jdi ga perlu Comparator tambahan

    SortedMap<String, String> sortedMap = new TreeMap<>();

    // key akan diurutkan
    sortedMap.put("abdu", "eunha");
    sortedMap.put("yerin", "abdu");
    sortedMap.put("umji", "yerin");

    // immutable SortedMap
    SortedMap<String, String> sortedMap2 = Collections.emptySortedMap();
    SortedMap<String, String> sortedMap3 = Collections.unmodifiableSortedMap(sortedMap);
  }
}
