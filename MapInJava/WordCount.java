
import java.util.HashMap;

public class WordCount {
    public static void main(String[] args) {
        String text = "apple banana apple orange banana apple";
        String[] words = text.split(" ");

        HashMap<String, Integer> wordCount = new HashMap<>();

        for(String word : words){
            wordCount.put(word, wordCount.getOrDefault(word,0)+1);
            System.out.println(word);
        }








        // for (String word : words) {
        //     wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        // }

        System.out.println(wordCount);
    }
}
