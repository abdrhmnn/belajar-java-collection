package KonversiArray;

import java.util.ArrayList;
import java.util.List;

public class Pengenalan {
  // bisa melakukan konversi dari collection ke array
  public static void main(String[] args) {
    List<String> names = new ArrayList<>();

    Object[] data = names.toArray(); // konversi ke array objek
    String[] data2 = names.toArray(new String[]{}); // konversi ke array string atau tipe data apapun
  }
}
