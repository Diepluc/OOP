import java.util.ArrayList;
import java.util.List;

public class Enny {
    public static void main(String[] args) {
        Word word1 = new Word("table", "ban");
        Word word2 = new Word("chair", "ghe");
        Word word3 = new Word("lamp", "den");
        Word word4 = new Word("apple", "ghet");
        Word word5 = new Word("hatr", "tf");
        Word word6 = new Word("apdh", "kahdj");

        List<Word> words = new ArrayList<>();
        Dictionary dictionary = new Dictionary(words);

        dictionary.addWord(word1);
        dictionary.addWord(word2);
        dictionary.addWord(word3);
        dictionary.addWord(word4);
        dictionary.addWord(word5);
        dictionary.addWord(word6);

        DictionaryCommandline dictionaryCommandline = new DictionaryCommandline(dictionary);
        dictionaryCommandline.dictionaryBasic();
    }
}
