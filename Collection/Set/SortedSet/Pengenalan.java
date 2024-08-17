package Collection.Set.SortedSet;

public class Pengenalan {
  // merupakan turunan dari Set dan element yg ada didalam nya itu otomatis akan diurutkan secara ASC atau DESC

  // jika element itu turunan dari interface Comparable maka secara otomatis akan diurutkan menggunakan
  // comparable tersebut, seperti String, Integer, dll

  // jika element bukan turunan dari interface Comparable maka hrs menggunakan Comparator untuk memberi tahu
  // SortedSet bagaimana mengurutkan element nya

  // SortedSet memiliki konkrit class nya yaitu TreeSet

  private String name;

  public Pengenalan(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }
}
