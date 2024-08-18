package Map;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Pengenalan {
  // berisikan struktur data antara key dan value
  // key nya harus unik

  // konkrit class nya: HashMap, WeakHashMap, IdentityHashMap, LinkedHashMap, EnumHashMap

  // HashMap -> implementasi Map dgn fungsi hashCode()
  // WeakHashMap -> implementasi nya sama seperti HashMap, hanya saja jika ada key yg tdk digunakan lagi
  // maka secara otomatis data itu akan dihapus, cmn kita gabisa memastikan data mana yg dihapus karena
  // itu di handle oleh Garbage Collection nya Java
  // IdentityHashMap -> implementasi nya sama seperti HashMap, hanya saja yg membedakan pengecekan kesamaan
  // data nya, kalo HashMap menggunakan method equals(), kalo ini pakai operator `==`
  // LinkedHashMap -> implementasi Map dgn menggunakan double linked list
  // EnumHashMap -> implementasi Map dimana key nya adalah Enum

  public static void main(String[] args) {
    Map<String, String> names = new HashMap<>();
    Map<Integer, Integer> names2 = new WeakHashMap<>();
    Map<String, String> names3 = new IdentityHashMap<>();
    Map<Abdu, String> names4 = new EnumMap<>(Abdu.class);

    names.put("key1", "abdu");
    names.put("key2", "abdu2");
    names.put("key3", "abdu3");

    for (int i = 0; i < 1_000_000; i++) {
      names2.put(i, i);
    }

    System.gc(); // run garbage collection

    System.out.println(names2.size());

    String nama = "abdu.eunha";
    String nama2 = "abdu";
    String nama3 = ".";
    String nama4 = "eunha";

    String joinNama = nama2 + nama3 + nama4;

    names3.put(nama, "eunha");
    names3.put(joinNama, "eunha");

    System.out.println(names3.size());
  }
}

enum Abdu{
  ABDU,
  EUNHA,
  SOWON
}
