package Collection.List.Sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Pengenalan {
  // List bisa dilakukan Sorting dengan menggunakan Collections

  // kalo set dan map kan sudah ada yaitu dgn pakai SortedSet atau SortedMap

  public static void main(String[] args) {
    List<String> names = new ArrayList<>(100);

    names.add("abdu");
    names.add("eunha");
    names.add("sowon");

    Collections.sort(names);
    // Collections.sort(names, comparator); // ini kalo pakai comparator
  }
}
