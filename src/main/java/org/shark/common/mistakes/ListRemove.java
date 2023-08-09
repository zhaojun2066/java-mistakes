package org.shark.common.mistakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ListRemove {
    public static void main(String[] args) throws InterruptedException {
        modifyException();
    }
  private static void modifyException() throws InterruptedException {
    List<String> words = new ArrayList<>(Arrays.asList("a", "b", "c", "d"));
    Iterator<String> iterator = words.iterator();
    while (iterator.hasNext()) {
        String next = iterator.next();
        if (next.equals("b")) {
            iterator.remove();
        }
    }
    for (String word : words) {
        if (word.equals("b")) {
            iterator.remove();
        }
    }
    Thread.sleep(Long.MAX_VALUE);
}
}
