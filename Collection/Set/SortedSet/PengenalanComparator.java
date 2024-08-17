package Collection.Set.SortedSet;

import java.util.Comparator;

public class PengenalanComparator implements Comparator<Pengenalan> {
  @Override
  public int compare(Pengenalan o1, Pengenalan o2) {
    // urutkan berdasarkan nama - ASC
    return o1.getName().compareTo(o2.getName());
  }
}
