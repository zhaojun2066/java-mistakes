package org.shark.common.mistakes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class ModificationExceptionTest {
    public static void main(String[] args) {
        modificationException();
    }

    //ModCount  ,exceptedModCount
    //add remove
    private static void modificationException(){
        List<String>  words = new ArrayList<>(
                Arrays.asList("a","b","c","d")
        );
        words.iterator();
        words.removeIf(word -> word.equals("b"));
    }
}
