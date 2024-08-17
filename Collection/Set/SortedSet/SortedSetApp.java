package Collection.Set.SortedSet;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
  public static void main(String[] args) {
    // kalo mau DESC tinggal kasih reverse()
    SortedSet<Pengenalan> pengenalan = new TreeSet<>(new PengenalanComparator().reversed());

    pengenalan.add(new Pengenalan("abdu"));
    pengenalan.add(new Pengenalan("eunha"));
    pengenalan.add(new Pengenalan("umji"));

    for (Pengenalan pengenalan2 : pengenalan) {
      System.out.println(pengenalan2.getName());
    }

    // unmodifiable sorted set
    SortedSet<Integer> angka = Collections.unmodifiableSortedSet(new TreeSet<>());
  }
}
