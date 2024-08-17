package Collection.Set.SortedSet.NavigableSet;

import java.util.Collections;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Pengenalan {
  // merupakan turunan dari SortedSet yaitu untuk melakukan navigasi pencarian element, seperti :
  // mencari element yg paling besar dari, kurang dari, mengebalikkan urutan set, dll

  // konkrit class nya juga adalah TreeSet

  public static void main(String[] args) {
    NavigableSet<String> names = new TreeSet<>();
    names.add("test");
    names.add("test2");
    names.add("test3");

    // ketiga ini hrs di masukkan ke dalam variable NavigableSet baru
    names.descendingSet(); // mengebalikkan
    names.headSet("test2", true); // slicing set ke depan berdasarkan param pertama
    names.tailSet("test3", true); // slicing set ke belakang berdasarkan param pertama

    for (String string : names) {
      System.out.println(string);
    }

    // unmodifiable
    NavigableSet<String> immutableNames = Collections.unmodifiableNavigableSet(names);
  }
}
