package Collection.Set;

import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class Pengenalan {
  // collection yg berisikan element yg unik
  // memiliki sifat :
  // - tidak punya index (tidak bs dipastikan berurutan sesuai urutan masuk)
  // - tidak memiliki method baru (jd hanya menggunakan method interface parent nya)

  // ada 3 jenis Set :
  // - EnumSet -> khusus untuk Enum type
  // - HashSet
  // - LinkedHashSet

  // perbedaan HashSet dan LinkedHashSet, yaitu HashSet tidak menjamin data terurut sesuai urutan masuk
  // sedangkan LinkedHashSet itu menjamin, kedua nya implementasi `hash table` dimana data yg disimpan ke dalam
  // `hash table` dgn menjalankan hashCode() function

  public static void main(String[] args) {
    Set<String> names =  new HashSet<>();
    // Set<String> names = new LinkedHashSet<>();
    names.add("abdu");
    names.add("eunha");
    names.add("sowon");

    EnumSet<HASIL> hasil = EnumSet.allOf(HASIL.class);

    for(int i = 0; i < names.size(); i++){
      System.out.println("Nama: " + names.toArray()[i]);
      System.out.println("Nama enum: " + hasil.toArray()[i]);
    }
  }
}

enum HASIL {
  ABDU,
  EUNHA,
  SOWON
}