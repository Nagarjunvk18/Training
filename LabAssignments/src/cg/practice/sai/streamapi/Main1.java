package cg.practice.sai.streamapi;

import java.util.Scanner;
import java.util.Scanner;

public class Main1 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String str = scanner.nextLine();
    printDuplicateCharacters(str);
  }
  public static void printDuplicateCharacters(String str) {
    int n = str.length();
    boolean hasDuplicates = false;
    int[] count = new int[256];
    for (int i = 0; i < n; i++) {
      count[str.charAt(i)]++;
    }
    for (int i = 0; i < n; i++) {
      if (count[str.charAt(i)] > 1) {
        System.out.println(str.charAt(i));
        hasDuplicates = true;
      }
    }
    if (!hasDuplicates) {
      System.out.println("no duplicate");
    }
  }
}

