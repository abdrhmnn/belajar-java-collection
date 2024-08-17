package Collection.Deque;

import java.util.Deque;
import java.util.LinkedList;

public class Pengenalan {
  // singkatan dari `double ended queue` yg bisa beroperasi dari depan dan belakang
  // jadi tidak hanya FIFO tetapi juga bisa LIFO (Last In First Out)
  // sama seperti membuat struktur data stack `tumpukan data`

  // konkrit class nya: ArrayDeque dan LinkedList

  public static void main(String[] args) {
    Deque<String> stack = new LinkedList<>();

    stack.offerLast("eunha");
    stack.offerLast("sowon");
    stack.offerLast("umji");

    for (String data = stack.pollLast(); data != null; data = stack.pollLast()) {
      System.out.println(data);
    }
  }
}
