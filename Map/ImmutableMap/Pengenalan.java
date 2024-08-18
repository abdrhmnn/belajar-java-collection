package Map.ImmutableMap;

import java.util.Collections;
import java.util.Map;

public class Pengenalan {
  // set data map yang sudah tidak bisa diubah

  private String name;

  private Map<String, String> hobbies;
  private Map<Boolean, String> result = Collections.singletonMap(true, "abdu");

  public void addHobby(String hobby){
    hobbies.put(hobby, "abdu");
  }

  public Map<String, String> getHobbies(){
    Collections.emptyMap(); // membuat immutable map kosong
    Collections.singletonMap(hobbies, "abdu"); // membuat immutable map berisi 1 element
    
    return Collections.unmodifiableMap(hobbies); // akan membuat map ini menjadi unmodifiable
  }
}
