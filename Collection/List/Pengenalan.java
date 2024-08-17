package Collection.List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Pengenalan {
  // struktur data collection yg memiliki sifat :
  // - bisa dimasukkan data yg duplikat
  // - data selalu berurutan sesuai data yg dimasukkan
  // - memiliki index

  // List dibagi menjadi 2 jenis :
  // ArrayList -> implementasi dri List menggunakan Array yg default length nya adalah 10
  // LinkedList -> implementasi dri List menggunakan Double Linked List

  // add
  // ArrayList -> lambat jika kapasitas array sudah penuh
  // LinkedList -> cepat karena menambah node di akhir
  
  // get
  // ArrayList -> cepat karena tinggal get pakai index
  // LinkedList -> lambat karena hrs cek dri node awal sampai ketemu index nya
  
  // set
  // ArrayList -> cepat karena tinggal set pakai index
  // LinkedList -> lambat karena hrs iterasi satu persatu dulu dri node awal sampai ketemu index nya
  
  // remove
  // ArrayList -> lambat krn jika ada data yg dihapus maka data setelah nya akan menggeser data yg di belakang nya
  // LinkedList -> cepat krn tinggal ubah prev dan next di node sebelah yg di hapus

  public static void main(String[] args) {
    List<String> names = new ArrayList<>(100); // set capacity 100
    names.add("abdu");
    names.add("eunha");
    names.set(0, "sowon");
    names.get(5);
    names.remove(0);

    List<Integer> angka = new LinkedList<>();
    angka.add(1);
    angka.add(2);
    angka.add(3);

    angka.set(3, 200);
  }
}