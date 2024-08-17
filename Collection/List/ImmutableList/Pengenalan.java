package Collection.List.ImmutableList;

import java.util.Collections;
import java.util.List;

public class Pengenalan {
  // set data yg berada di dalam List menjadi tidak bisa diubah

  private String name;

  private List<String> hobbies;
  private List<Boolean> result = Collections.singletonList(true);

  public void addHobby(String hobby){
    hobbies.add(hobby);
  }

  public List<String> getHobbies(){
    Collections.emptyList(); // membuat immutable list kosong
    Collections.singletonList(hobbies); // membuat immutable list berisi 1 element
    
    return Collections.unmodifiableList(hobbies); // akan membuat list ini menjadi unmodifiable
  }
}
