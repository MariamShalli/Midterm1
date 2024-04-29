package task4;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.List;


public class WordStat {
    public static void main(String[] args) {
        // Existing code
        List<String> fantasyFormatData = DreamGenerator.fantasy;

        // Create a set of all different words
        HashSet<String> uniqueWords = new HashSet<>(fantasyFormatData);

        // Print the set of unique words
        System.out.println("Unique Words:");
        for (String word : uniqueWords) {
            System.out.println(word);
        }

        // Create a map of word lengths to count of words with that length
        Map<Integer, Integer> wordLengthCount = new HashMap<>();
        for (String word : fantasyFormatData) {
            int length = word.length();
            wordLengthCount.put(length, wordLengthCount.getOrDefault(length, 0) + 1);
        }

        // Print the map of word lengths and their counts
        System.out.println("\nWord Length Count:");
        for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
            System.out.println("Length " + entry.getKey() + ": " + entry.getValue() + " words");
        }

        // Write the results to task4.txt
        try {
            PrintWriter writer = new PrintWriter(new FileWriter("task4.txt", true));
            writer.println("\n\nUnique Words:");
            for (String word : uniqueWords) {
                writer.println(word);
            }
            writer.println("\nWord Length Count:");
            for (Map.Entry<Integer, Integer> entry : wordLengthCount.entrySet()) {
                writer.println("Length " + entry.getKey() + ": " + entry.getValue() + " words");
            }
            writer.close();
        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }
}

