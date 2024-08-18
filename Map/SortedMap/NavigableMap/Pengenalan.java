package Map.SortedMap.NavigableMap;

import java.util.Collections;
import java.util.NavigableMap;
import java.util.TreeMap;

public class Pengenalan {
  // turunan SortedMap, untuk navigasi data, implementasi nya sama seperti NavigableSet
  // cuman khusus yang Map dia akan key dan value

  // konkrit class: TreeMap

  public static void main(String[] args) {
    NavigableMap<String, String> names = new TreeMap<>();
    names.put("test", "abdu");
    names.put("test", "abdu");
    names.put("test", "abdu");

    // ketiga ini hrs di masukkan ke dalam variable NavigableMap baru
    names.descendingKeySet(); // mengebalikkan
    names.headMap("test2", true); // slicing map ke depan berdasarkan param pertama
    names.tailMap("test3", true); // slicing map ke belakang berdasarkan param pertama

    for (String string : names.keySet()) {
      System.out.println(string);
    }

    // unmodifiable
    NavigableMap<String, String> immutableNames = Collections.unmodifiableNavigableMap(names);
  }
}
