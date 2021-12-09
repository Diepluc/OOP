import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Word> words = new ArrayList<>();
        Dictionary dictionary = new Dictionary(words);
        DictionaryCommandline dCommandline = new DictionaryCommandline(dictionary);
        dCommandline.dictionaryAdvanced();
    }
}
