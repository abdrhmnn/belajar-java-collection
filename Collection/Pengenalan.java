package Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Pengenalan {
  // interface untuk memanipulasi data di dalam collection

  public static void main(String[] args) {
    // karena collection itu gak ada objek nya jadi harus menggunakan antara List, Set, Queue
    Collection<String> names = new ArrayList<>();
    names.add("abdu");
    names.add("eunha");
    names.addAll(Arrays.asList("sowon", "yerin"));

    for(int i = 0; i < names.size(); i++){
      System.out.println("Nama: " + names.toArray()[i]);
    }

    System.out.println("REMOVE COLLECTION");
    names.remove("eunha");

    System.out.println("CHECK DATA COLLECTION");
    System.out.println(names.contains("abdu"));
    System.out.println(names.containsAll(Arrays.asList("yerin")));
  }
}
