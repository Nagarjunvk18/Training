package doselect.trying;

import java.util.ArrayList;

public class Implementation {
  public static ArrayList<String> changeOccurrence(ArrayList<String> list, String a, String b) {
    for (int i = 0; i < list.size(); i++) {
      if (list.get(i).equals(a)) {
        list.set(i, b);
      }
    }
    return list;
  }

  public static String getIndex(ArrayList<String> list) {
    return list.get(0);
  }

  public static ArrayList<String> addAfter(ArrayList<String> list, String a, String b) {
    ArrayList<String> copy = new ArrayList<>(list);
    for (int i = 0; i < copy.size(); i++) {
      if (copy.get(i).equals(a)) {
        copy.add(i + 1, b);
      }
    }
    return copy;
  }
}
