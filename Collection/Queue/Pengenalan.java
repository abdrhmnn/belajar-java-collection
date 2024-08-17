package Collection.Queue;

import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Pengenalan {
  // struktur data antrian FIFO (First In First Out)

  // konkrit class nya ada: PriorityQueue, ArrayDeque, LinkedList

  // ArrayDeque -> menggunakan Array sebagai implementasi queue nya
  // LinkedList -> menggunakan double linked list sebagai implementasi queue nya
  // PriorityQueue -> sama seperti ArrayQueue hanya saja sdh otomatis diurutkan dgn Comparable atau Comparator

  public static void main(String[] args) {
    Queue<String> queue = new ArrayDeque<>(10);
    // Queue<String> queue = new PriorityQueue<>();
    // Queue<String> queue = new LinkedList<>();

    for (int i = 1; i <= 10; i++) {
      queue.add(String.valueOf(i));
    }

    for (String data = queue.poll(); data != null; data = queue.poll()) {
      System.out.println(data);
    }
  }
}
