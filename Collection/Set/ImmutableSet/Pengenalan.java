package Collection.Set.ImmutableSet;

import java.util.Collections;
import java.util.Set;

public class Pengenalan {
  // set data yg berada di dalam Set menjadi tidak bisa diubah

  private String name;

  private Set<String> hobbies;
  private Set<Boolean> result = Collections.singleton(true);

  public void addHobby(String hobby){
    hobbies.add(hobby);
  }

  public Set<String> getHobbies(){
    Collections.emptySet(); // membuat immutable set kosong
    Collections.singleton(hobbies); // membuat immutable set berisi 1 element
    
    return Collections.unmodifiableSet(hobbies); // akan membuat set ini menjadi unmodifiable
  }
}
